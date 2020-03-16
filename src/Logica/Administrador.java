package Logica;

import java.util.Random;

public class Administrador {
    //Variables:
    
    private Random random = new Random();        //Variable que define un random.
    private int id=1;                            //ID autoincrementable para los carros.
    
    private Cola cola1 = new Cola();             //Inicializa Cola de prioridad de nivel 1.
    private Cola cola2 = new Cola();             //Inicializa Cola de prioridad de nivel 2.
    private Cola cola3 = new Cola();             //Inicializa Cola de prioridad de nivel 3.
    private Cola colaReparacion = new Cola();    //Inicializa Cola general para reparaciones/mejoras.
    
    private Carro carro;                         //Se crea un carro inicialmente.
    private Mecanico mec = new Mecanico();       //Inicializa un mecanico.

    //Constructor:
    public Administrador() 
    {

    }
    
    //Realiza la ejecucion:
    public void ejecutar(boolean x)
    {
        
        do
        {
            //Comprueba para crear un auto al inicio
            if(x)
            {
                //Crea un auto nuevo inicialmente:
                carro = new Carro(id,(random.nextInt(3)+1),0);
                System.out.println("Se ha creado el Carro "+carro.getId());
                
                //Incrementa ID de auto:
                id++;
                
                //Se encola el carro creado en una de las colas dependiendo de su prioridad 
                encolar();
                
                //Se pone la variable "x" en falso, para no entrar mas en la condicion
                x=false;
                
            }
            else
            {
                
            //Entra en operacion cuando hayan pasado dos ciclos de revision:
            ///if(mec.getCont_revisados()%2==0)
            //{
                //Probabilidad de 60% de crear nuevo carro:
                if(random.nextFloat() <= 0.6)
                {
                    carro = new Carro(id,(random.nextInt(3)+1),0);
                    System.out.println("\nSe ha creado el Carro "+carro.getId());
                    
                    id++;
                    
                    encolar();
                }
            //}     
            }
            
            //Se selecciona el carro de una de las colas y se lleva a revision:
            planificador();
            
            //Actualiza la cola de reparacion (si no esta vacia) cada vez que se actualizan las demas:
            if(!colaReparacion.getNodos().isEmpty())
            {
                actualizaReparaciones();
            }
            
            System.out.println("\n-----\n");
                                   
        } 
        while(true);
    }
    
    //Encola el carro creado en una de las colas de prioridad:
    public void encolar()
    {
        switch (carro.getPrioridad()) 
        {
            //Prioridad nivel 1:
            case 1:
                cola1.insertar(carro);
                
                System.out.print("\nCola 1: ");
                for(int i=0; i<cola1.getNodos().size(); i++)
                {
                 System.out.print("[Carro "+cola1.getNodos().get(i).getId()+", prioridad "+cola1.getNodos().get(i).getPrioridad()+", contador: "+cola1.getNodos().get(i).getContador()+"]; ");   
                }
                break;

            //Prioridad nivel 2:
            case 2:
                cola2.insertar(carro);
                System.out.print("\nCola 2: ");
                for(int i=0; i<cola2.getNodos().size(); i++)
                {
                 System.out.print("[Carro "+cola2.getNodos().get(i).getId()+", prioridad "+cola2.getNodos().get(i).getPrioridad()+", contador: "+cola2.getNodos().get(i).getContador()+"]; ");   
                }
                break;

            //Prioridad nivel 3:
            case 3:
                cola3.insertar(carro);
                System.out.print("\nCola 3: ");
                for(int i=0; i<cola3.getNodos().size(); i++)
                {
                 System.out.print("[Carro "+cola3.getNodos().get(i).getId()+", prioridad "+cola3.getNodos().get(i).getPrioridad()+", contador: "+cola3.getNodos().get(i).getContador()+"]; ");   
                }
                break; 
        }        
    }

    //Seleccionar el elemento a ser revisado (en base a su prioridad) y actualiza las colas:
    public void planificador()
    {
        //Si la cola es de prioridad 1, los autos en su interior pasan inmediatamente a revision:
        if(!cola1.getNodos().isEmpty())
        {
            //Carro seleccionado para revision, se restablece el contador
            carro.setContador(0);
            
            //El mecanico revisa el auto:
            mec.revisar(cola1.getNodos().get(0), cola1, colaReparacion);
            
            //Aumenta los contadores de cada carro que no fue seleccionado para revision en cada cola
            aumentarContador(cola1);
            aumentarContador(cola2);
            aumentarContador(cola3);

        }
        //Si cola es de prioridad 2, pasa solo si no hay elementos en cola 1:
        else if(cola1.getNodos().isEmpty() && !cola2.getNodos().isEmpty())
        {
            carro.setContador(0);
            
            mec.revisar(cola2.getNodos().get(0), cola2, colaReparacion);
            
            aumentarContador(cola2);
            aumentarContador(cola3);
        }
        //Si cola es de prioridad 3, pasa solo si no hay elementos en cola 1 y 2:
        else if(getCola1().getNodos().isEmpty() && getCola2().getNodos().isEmpty() && !getCola3().getNodos().isEmpty())
        {
            carro.setContador(0);

            mec.revisar(cola3.getNodos().get(0), cola3, colaReparacion);
            
            aumentarContador(cola3);      
        }
        
    }
    
    //Subir los niveles de prioridad y actualizar cola de reparaciones:
    public void actualizarColas(int prioridad)
    {
        System.out.println("\nACTUALIZANDO COLAS...");

        //Resta la prioridad
        prioridad--;

        //Actualiza las colas:
        switch (prioridad) 
        {
            //Inserta el primer auto de cola de prioridad 2 en la de prioridad 1:
            case 1:
                cola1.insertar(cola2.getNodos().get(0));
                cola2.eliminar(cola2.getNodos().get(0));
                System.out.print("\nCola 1: ");
                for(int i=0; i<cola1.getNodos().size(); i++)
                {
                 System.out.print("\n[Carro "+cola1.getNodos().get(i).getId()+", prioridad "+cola1.getNodos().get(i).getPrioridad()+", contador: "+cola1.getNodos().get(i).getContador()+"]; ");   
                }
                break;
            //Inserta el primer auto de cola de prioridad 3 en la de prioridad 2:
            case 2:
                cola2.insertar(cola3.getNodos().get(0));
                cola3.eliminar(cola3.getNodos().get(0));
                System.out.print("\nCola 2: ");
                for(int i=0; i<cola2.getNodos().size(); i++)
                {
                 System.out.print("\n[Carro "+cola2.getNodos().get(i).getId()+", prioridad "+cola2.getNodos().get(i).getPrioridad()+", contador: "+cola2.getNodos().get(i).getContador()+"]; ");   
                }
                break;
            //Evita que modifique la prioridad de un auto de prioridad 1:    
            default:
                System.out.println("\nNo es posible modificar la prioridad, se encuentra en la mas alta.");
                break;
        }
               
    }
    
    //Realiza las reparaciones/mejoras:
    public void actualizaReparaciones()
    {
        //Guarda en una variable auxiliar el valor del carro actual
        Carro aux = carro;
        //Selecciona el primer carro de la cola de reparaciones/mejoras
        carro = colaReparacion.getNodos().get(0);
        //Elimina el carro de la cola
        colaReparacion.eliminar(carro);
        
        //Si la probabilidad es del 60% sale de la cola general y vuelve a su cola original:
        if (random.nextFloat() <= 0.6) 
        {
            System.out.println("\nCarro "+carro.getId()+" ha salido de la cola de Reparaciones y mejoras.");
            
            encolar();
        }
        else
        {
            //Vuelve a insertar el carro en la cola de reparaciones hasta que vuelvan a ser actualizadas las colas:
            colaReparacion.insertar(carro);
        }
        
        //Se restablece el valor original del carro actual:
        carro = aux;
       
    }
    
    //Aumenta los contadores asociados a cada auto de la cola
    public void aumentarContador(Cola cola)
    {
        //Recorre la cola seleccionada:
        for(int i=0; i<cola.getNodos().size(); i++)
        {
            int j=cola.getNodos().get(i).getContador();
            cola.getNodos().get(i).setContador(j+1);
            //System.out.println("\n"+cola.getNodos().get(i).getContador());
            
            //Reinicializa el contador y actualiza la cola:
            if(cola.getNodos().get(i).getContador()==10)
            {
                cola.getNodos().get(i).setContador(0);
                actualizarColas(cola.getNodos().get(i).getPrioridad());
            }
        }


    }
 
    //Getter's & Setter's:
    
    public Cola getCola1() {
        return cola1;
    }

    public void setCola1(Cola cola1) {
        this.cola1 = cola1;
    }

    public Cola getCola2() {
        return cola2;
    }

    public void setCola2(Cola cola2) {
        this.cola2 = cola2;
    }

    public Cola getCola3() {
        return cola3;
    }

    public void setCola3(Cola cola3) {
        this.cola3 = cola3;
    }

    public Cola getColaReparacion() {
        return colaReparacion;
    }

    public void setColaReparacion(Cola colaReparacion) {
        this.colaReparacion = colaReparacion;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
}
