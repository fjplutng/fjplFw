package mx.edu.utng.fjplfw;

/**
 * Created by francisco.perez on 05/06/2016.
 */
public class ModeradaState implements State {

    public void doAction(mx.edu.utng.fjplfw.Context context) {

        context.setState(this);
    }
    public String toString(){
        /*
         establece color fondo = 2
        */
        return "#444444";
    }
    public int getColor(){
        return R.color.grisoscuro;
    }

}
