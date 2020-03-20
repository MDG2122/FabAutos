package Logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Mecanico {
    
    private int tiempoEspera = 5000;        //Tiempo que tarda en hacer la revision (5 segundos expresados en milisegundos).
    private Random random = new Random();   //Variable que define un random.
    private int contador=0;                 //Contador de carros en el mercado.
    
    public Mecanico() { }
    
    //Hace una revision al carro:
    public void revisar(Carro carro, Cola cola, Cola reparaciones, JLabel id, JLabel prioridad, JTextArea estado, JLabel carros) {

        id.setText(Integer.toString(carro.getId()));
        prioridad.setText(Integer.toString(carro.getPrioridad()));
        
        //Variable que define una probabilidad
        float probabilidad = random.nextFloat();
        
        try
        {   
            estado.selectAll();
            estado.replaceSelection("");            
            estado.append(" Carro "+carro.getId()+" en revisión.");

            //Realiza revision por 5 segundos:
            sleep(tiempoEspera);
            
            //Carro seleccionado para revision, se restablece el contador
            carro.setContador(0);
            
            //Sale al mercado (probabilidad de 30%):
            if (probabilidad <= 0.3) 
            {
                //Borra todo el TextArea
                estado.selectAll();
                estado.replaceSelection(""); 
                //Muestra el estado actual
                estado.append(" El carro "+carro.getId()+" ha salido al mercado.");
                
                //Aumenta y muestra por pantalla el total de autos fuera del sistema
                contador++;
                carros.setText(Integer.toString(contador));
            }
            //Se necesita mas tiempo de revision (probabilidad de 50%):
            else if (probabilidad > 0.3 && probabilidad <= 0.8) 
            {
                estado.selectAll();
                estado.replaceSelection("");  
                estado.append(" El carro "+carro.getId() +" necesita más tiempo de revisión.");
                
                //Inserta al carro de ultimo en la cola:
                cola.insertar(carro);
            }
            //El carro debe mejorarse (probabilidad 20%):
            else 
            {
                estado.selectAll();
                estado.replaceSelection("");  
                estado.append(" El carro "+carro.getId() +" tiene un defecto o debe mejorarse.\n Se lleva a la cola de Reparaciones.");

                //Inserta el carro en una cola general sin prioridades:
                reparaciones.insertar(carro);

            }

        }
        catch(InterruptedException ex)
        {
            Logger.getLogger(Mecanico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
}
