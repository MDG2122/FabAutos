package Logica;

public class Carro {
    
    private int id;         //ID unico del carro
    private int prioridad;  //Prioridad del carro
    private int contador;   //Contador asociado al carro

    //Constructor:
    public Carro(int id, int prioridad, int contador) 
    {
        this.id = id;
        this.prioridad = prioridad;
        this.contador = contador;
    }
    
    //Getter's & Setter's:
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getContador() 
    {
        return contador;
    }

    public void setContador(int contador) 
    {
        this.contador = contador;
    }

    public int getPrioridad() 
    {
        return prioridad;
    }

    public void setPrioridad(int prioridad) 
    {
        this.prioridad = prioridad;
    }  
    
}
