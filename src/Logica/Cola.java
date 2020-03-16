package Logica;

import java.util.ArrayList;

public class Cola {
 
    //Inicializa un Arraylist:
    private ArrayList nodos;

    //Crea un array de tipo Carro
    public Cola()
    {
       nodos=new ArrayList<Carro>();
    }

    //Inserta un carro en la cola seleccionada
    public void insertar(Carro x)
    {
       nodos.add(x);
    }

    //Elimina un carro de la cola seleccionada
    public void eliminar(Carro x)
    {
       nodos.remove(x);
    }

    //Resetea el array
    public void resetear()
    {
       nodos.clear();
    }

    //Getter's & Setter's:
    
    public ArrayList<Carro> getNodos()
    {
       return nodos;
    }

    public void setNodos(ArrayList<Carro> nodos)
    {
       this.nodos = nodos;
    }
}
