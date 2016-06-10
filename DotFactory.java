package mx.edu.utng.fjplfw;

import java.util.HashMap;

/**
 * Created by francisco.perez on 06/06/2016.
 */
public class DotFactory {
    private static final HashMap<Integer, Dot> pointMap = new HashMap();
    /*
    creamos objeto de tipo figura
     */

    public static Dot getFwPoint (int colorx){
        /*
        llama del hash un elemento creado
        */
        Point fwPoint = (Point) pointMap.get(colorx);

        /*
        si no lo encuentra, lo crea en el hash y crea el objeto
         */
            if (fwPoint == null) {
                fwPoint = new Point(colorx);
                pointMap.put(colorx, fwPoint);
            }
        /*
        regresa el elemento llamado y/o creado
         */
        return fwPoint;
    }
}
