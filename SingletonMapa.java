package mx.edu.utng.fjplfw;

/**
 * Created by francisco.perez on 31/05/2016.
 */
public class SingletonMapa {
    // Crea el objeto SingletonMapa
    private static SingletonMapa instancia;
    // hace el constructor privado de tal manera que la clase no pueda ser instanciada
    private SingletonMapa(){

    }
    // obtiene el único objeto disponible
    public static SingletonMapa getInstancia(){
        // como no se quiere que se cree más de una instancia, se pone un if antes de new
        if (instancia == null){
            instancia = new SingletonMapa();
        }
        return instancia;


    }
    public void muestraMensaje(){

//        System.out.println("Este es el singletón");
    }

}
