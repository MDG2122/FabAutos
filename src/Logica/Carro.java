package Logica;

public class Carro {
    
    private int id;
    private int prioridad;
    private int contador;

    public Carro(int id, int prioridad, int contador) 
    {
        this.id = id;
        this.prioridad = prioridad;
        this.contador = contador;
    }
    
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
