package mx.edu.utng.fjplfw;

import android.graphics.Color;

/**
 * Created by francisco.perez on 05/06/2016.
 */
public class EscasaState implements State {

    public void doAction(mx.edu.utng.fjplfw.Context context) {

        context.setState(this);
    }
    public String toString() {
        /*
         establece color fondo = 1
        */
        return "#ffff00";
    }

    public int getColor(){
        return R.color.amarillo;
    }

}
