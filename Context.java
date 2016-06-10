package mx.edu.utng.fjplfw;

/**
 * Created by francisco.perez on 05/06/2016.
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

}
