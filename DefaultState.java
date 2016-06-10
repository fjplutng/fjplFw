package mx.edu.utng.fjplfw;

/**
 * Created by francisco.perez on 08/06/2016.
 */
public class DefaultState implements State {

    public void doAction(mx.edu.utng.fjplfw.Context context) {

        context.setState(this);
    }
    public String toString(){
        /*
         establece color fondo = 5
        */
        return "#ffffff";
    }
    public int toColor(){
        return R.color.blanco;
    }
}
