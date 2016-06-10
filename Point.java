package mx.edu.utng.fjplfw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;

/**
 * Created by francisco.perez on 06/06/2016.
 */
public class Point implements Dot {
    private int cantidad;
    private int tipox;
    private int colorx;
    private int x;
    private int y;
    private int xx;
    private int yy;
    private int xmin;
    private int xmax;
    private int ymin;
    private int ymax;
    private int xa;
    private int ya;
    private int z;
    private int x1;
    private int y1;
    private int color1;
    private int radio;
    private int tipo1[] = {60,40,250,100,560,430,645,355};
    private int tipo2[] = {60,62,310,270,400,265,340,370};
    private int tipo3[] = {160,110,260,220,390,420,465,430};
    private int tipo4[] = {360,330,350,375,430,390,380,200};
    public Point(int colorx){
        this.colorx = colorx;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setTipox(int tipox) {
        this.tipox = tipox;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT);
        Paint pincel1 = new Paint();
        switch (colorx){
            case 1:
                pincel1.setColor(Color.parseColor("#00ff00"));
                break;
            case 2:
                pincel1.setColor(Color.parseColor("#B5AC00"));
                break;
            case 3:
                pincel1.setColor(Color.parseColor("#3F7D33"));
                break;
            case 4:
                pincel1.setColor(Color.parseColor("#661B31"));
                break;
            default:
                pincel1.setColor(Color.parseColor("#0D0982"));
                break;

        }
//        pincel1.setColor(colorx);

        int i = cantidad;
        x1=0;
        y1=1;

        switch (tipox){
            case 1:
                System.out.println(x1 + "  " + y1);

                while (i>=1) {
                    System.out.println(" i  " + i);
                    System.out.println(" x1  " + x1);
                    System.out.println(" y1  " + y1);

                    xx = tipo1[x1];
                    yy = tipo1[y1];
                    xmin = xx - 15;
                    xmax = xx + 15;
                    ymin = yy - 20;
                    ymax = yy + 20;

                    canvas.drawCircle(xx, yy, radio, pincel1);

                    z=0;
                    while (z < 20) {
                        xa = 0;
                        ya = 0;

                        while (xa < xmin || xa > xmax){
                            xa = (int)(Math.random()*(xx + 30));

                        }

                        while (ya < ymin || ya > ymax){
                            ya = (int)(Math.random()*(yy + 40));

                        }
                        canvas.drawCircle(xa, ya, radio, pincel1);
                        z++;
                    }
                    i--;
                    x1 = x1 + 2;
                    y1 = y1 + 2;
                }

                break;
            case 2:

                while (i>=1) {

                    xx = tipo2[x1];
                    yy = tipo2[y1];
                    xmin = xx - 15;
                    xmax = xx + 15;
                    ymin = yy - 20;
                    ymax = yy + 20;

                    canvas.drawCircle(xx, yy, radio, pincel1);

                    z=0;
                    while (z < 40) {
                        xa = 0;
                        ya = 0;

                        while (xa < xmin || xa > xmax){
                            xa = (int)(Math.random()*(xx + 30));

                        }

                        while (ya < ymin || ya > ymax){
                            ya = (int)(Math.random()*(yy + 40));

                        }
                        canvas.drawCircle(xa, ya, radio, pincel1);
                        z++;
                    }
                    i--;
                    x1 = x1 + 2;
                    y1 = y1 + 2;
                }

                break;
            case 3:

                while (i>=1) {

                    xx = tipo3[x1];
                    yy = tipo3[y1];
                    xmin = xx - 15;
                    xmax = xx + 15;
                    ymin = yy - 20;
                    ymax = yy + 20;

                    canvas.drawCircle(xx, yy, radio, pincel1);

                    z=0;
                    while (z < 80) {
                        xa = 0;
                        ya = 0;

                        while (xa < xmin || xa > xmax){
                            xa = (int)(Math.random()*(xx + 30));

                        }

                        while (ya < ymin || ya > ymax){
                            ya = (int)(Math.random()*(yy + 40));

                        }
                        canvas.drawCircle(xa, ya, radio, pincel1);
                        z++;
                    }
                    i--;
                    x1 = x1 + 2;
                    y1 = y1 + 2;
                }

                break;
            case 4:

                while (i>=1) {

                    xx = tipo4[x1];
                    yy = tipo4[y1];
                    xmin = xx - 15;
                    xmax = xx + 15;
                    ymin = yy - 20;
                    ymax = yy + 20;

                    canvas.drawCircle(xx, yy, radio, pincel1);

                    z=0;
                    while (z < 160) {
                        xa = 0;
                        ya = 0;

                        while (xa < xmin || xa > xmax){
                            xa = (int)(Math.random()*(xx + 30));

                        }

                        while (ya < ymin || ya > ymax){
                            ya = (int)(Math.random()*(yy + 40));

                        }
                        canvas.drawCircle(xa, ya, radio, pincel1);
                        z++;
                    }
                    i--;
                    x1 = x1 + 2;
                    y1 = y1 + 2;
                }

                break;
            default:
                break;
        }
        /*
        coordenadas
        tipo 1 {060,040,250,100,560,430,645,355}
        tipo 2 {060,062,310,270,400,265,340,370}
        tipo 3 {160,110,260,220,390,420,465,430}
        tipo 4 {360,330,350,375,430,390,380,200}
         */


    }
}
