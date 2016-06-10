package mx.edu.utng.fjplfw;

/**
 * Created by francisco.perez on 09/06/2016.
 */
public class Escasas implements Envase {
    public String EscasasNombres[] = {"BAJA CALIFORNIA NORTE", "CHIHUAHUA", "QUINTANA ROO", "CHIAPAS"};

    @Override
    public Iterador getIterador(){
        return new NombreIterado();

    }

    private class NombreIterado implements Iterador{
        int indice;

        @Override
        public boolean hasNext(){
            if (indice < EscasasNombres.length){
                return true;
            }
            return false;
        }

        @Override
        public Object Next(){
            if (hasNext()){
                return EscasasNombres[indice++];
            }
            return null;
        }
    }
}
