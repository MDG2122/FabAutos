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
    
    public Mecanico() { }
    
    //Hace una revision al carro:
    public void revisar(Carro carro, Cola cola, Cola reparaciones, JLabel id, JLabel prioridad, JTextArea estado) {

        id.setText(Integer.toString(carro.getId()));
        prioridad.setText(Integer.toString(carro.getPrioridad()));
        
        //Variable que define una probabilidad
        float probabilidad = random.nextFloat();
        
        //Saca al carro de la cola mientras se revisa
        cola.eliminar(carro);
        
        try
        {   
            estado.selectAll();
            estado.replaceSelection("");            
            estado.append(" Carro "+carro.getId()+" en revision");

            //Realiza revision por 5 segundos:
            sleep(tiempoEspera);
            
            //Carro seleccionado para revision, se restablece el contador
            carro.setContador(0);
            
            //Sale al mercado (probabilidad de 30%):
            if (probabilidad <= 0.3) 
            {
                estado.selectAll();
                estado.replaceSelection("");  
                estado.append(" El carro "+carro.getId()+" ha salido al mercado.");
                System.out.println("\nEl carro "+carro.getId()+" ha salido al mercado.");
            }
            //Se necesita mas tiempo de revision (probabilidad de 50%):
            else if (probabilidad > 0.3 && probabilidad <= 0.8) 
            {
                estado.selectAll();
                estado.replaceSelection("");  
                estado.append(" El carro "+carro.getId() +" necesita mas tiempo de revisión.");
                System.out.println("\nEl carro "+carro.getId() +" necesita mas tiempo de revisión.");
                //Inserta al carro de ultimo en la cola:
                cola.insertar(carro);
            }
            //El carro debe mejorarse (probabilidad 20%):
            else 
            {
                estado.selectAll();
                estado.replaceSelection("");  
                estado.append(" El carro "+carro.getId() +" tiene un defecto.\nSe lleva a la cola de Reparaciones.");
                System.out.println("\nEl carro "+carro.getId()+" tiene un defecto o debe mejorarse.");
                //Inserta el carro en una cola general sin prioridades:
                reparaciones.insertar(carro);
                System.out.println("\nEl carro "+carro.getId()+" fue insertado en la cola de Reparaciones.");
            }
            
            sleep(tiempoEspera/5);
        }
        catch(InterruptedException ex)
        {
            Logger.getLogger(Mecanico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
}
