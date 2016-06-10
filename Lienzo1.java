package mx.edu.utng.fjplfw;

import android.graphics.Canvas;
import android.view.View;

/**
 * Created by francisco.perez on 07/06/2016.
 */
public class Lienzo1 extends View{
    private Point fwPoint;

    public Lienzo1(android.content.Context context, Point fwPoint) {
        super(context);
        this.fwPoint = fwPoint;
    }

    protected void onDraw(Canvas canvas) {
//        if (fwPoint != null) {
            fwPoint.draw(canvas);
  //      }
    }
    public Point getFwPoint() {
        return fwPoint;
    }
    public void setFwPoint(Point fwPoint) {
        this.fwPoint= fwPoint;
    }

}
