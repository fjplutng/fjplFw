package mx.edu.utng.fjplfw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static mx.edu.utng.fjplfw.R.drawable.mapa1;
import static mx.edu.utng.fjplfw.R.drawable.mapa2;
import static mx.edu.utng.fjplfw.R.drawable.mapa3;
import static mx.edu.utng.fjplfw.R.drawable.mapa4;
import static mx.edu.utng.fjplfw.R.drawable.mapa5;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private TextView txv2;
    private int numpob;
    private int nummap;
    private String numpobt;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    public String imagen;
    public String txtToast;
    public String colorx;
    public int colory;
    public static final int colores[] =  {1, 2, 3 ,4};
    private DotFactory dotFactory;
    private Point fwPoint;
    private Lienzo1 lienzo1;
    private RelativeLayout layFw;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        }

    public void initComponents() {
        txv2=(TextView)findViewById(R.id.txv2);
        btn1=(Button) this.findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2=(Button) this.findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3=(Button) this.findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4=(Button) this.findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5=(Button) this.findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        dotFactory = new DotFactory();

    }

    @Override
    public void onClick(View v) {

        System.out.println("¿que está haciendo desde onClick?");

        if (v.getId() == R.id.btn5) {
            nummap = 5;
            imagen = String.format("%s", "mapa5.bmp");
        }else if (v.getId() == R.id.btn4) {
            nummap = 4;
            imagen = String.format("%s", "mapa4.bmp");
        }else if (v.getId() == R.id.btn3) {
            nummap = 3;
            imagen = String.format("%s", "mapa3.bmp");
        }else if (v.getId() == R.id.btn2) {
            nummap = 2;
            imagen = String.format("%s", "mapa2.bmp");
        }else if (v.getId() == R.id.btn1) {
            nummap = 1;
            imagen = String.format("%s", "mapa1.bmp");
        }

        // obtener un número random entre el 1 y el 4
        numpob = ((int) (Math.random() * (4) + 1));

        // obtener el texto correspondiente al número de poblaciones
        numpobt = String.format(" %s %s", String.valueOf(numpob), getString(R.string.txv2vc));

        // obtener el nombre de la imagen de fondo que está en formato bmp
        //imagen = String.format("%s%s%s", "mapa", String.valueOf(nummap), ".bmp");
        System.out.println(imagen);

        /*
        genera el layout para controlar la imagen de fondo del singletón
        */
        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);

        // utiliza el patrón de diseño singleton
        SingletonMapa mapa = SingletonMapa.getInstancia();

        /*
        genera el layout para usar con el método flyweight
         */
        layFw = (RelativeLayout) findViewById(R.id.layout2);
        lienzo1 = new Lienzo1(MainActivity.this, fwPoint);
        layFw.addView(lienzo1);

        /*
        Crea el contexto a usarse para el PATRÓN STATE
         */
        mx.edu.utng.fjplfw.Context context = new mx.edu.utng.fjplfw.Context();
        switch (v.getId()){
            case R.id.btn1:
                //utliza el patrón de diseño STATE para cambiar el color del fondo de la aplicación
                EscasaState escasastate = new EscasaState();
                escasastate.doAction(context);
                colory = escasastate.getColor();

                /*
                genera un mensajes informativo a cerca del tipo de población seleccionado
                 */
                txv2.setText(getString(R.string.txv2ve));
                txv2.append(numpobt);
                txtToast = getString(R.string.txtT1);

                /*
                aquí debe ejecutar el iterador
                 */
                Escasas iEscasas = new Escasas();
                for (Iterador iterador = iEscasas.getIterador();
                     iterador.hasNext();) {
                    String nombre = (String) iterador.Next();
                    System.out.println("Poblaciones escasas en " + nombre);
                }


                    break;
            case R.id.btn2:
                //utliza el patrón de diseño STATE para definir el color de fondo
                ModeradaState moderadastate = new ModeradaState();
                moderadastate.doAction(context);
                colorx = moderadastate.toString();
                colory = moderadastate.getColor();
                /*
                genera un mensajes informativo a cerca del tipo de población seleccionado
                 */
                txv2.setText(getString(R.string.txv2vm));
                txv2.append(numpobt);
                txtToast = getString(R.string.txtT2);

                break;
            case R.id.btn3:
                //utliza el patrón de diseño STATE para definir el color de fondo
                GrandeState grandestate = new GrandeState();
                grandestate.doAction(context);
                colorx = grandestate.toString();
                colory = grandestate.getColor();

                /*
                genera un mensajes informativo a cerca del tipo de población seleccionado
                 */
                txv2.setText(getString(R.string.txv2vg));
                txv2.append(numpobt);
                txtToast = getString(R.string.txtT3);

                break;
            case R.id.btn4:
                //utliza el patrón de diseño STATE para definir el color del fondo
                SobrepState sobrepstate = new SobrepState();
                sobrepstate.doAction(context);
                colorx = sobrepstate.toString();
                colory = sobrepstate.getColor();

                /*
                genera un mensajes informativo a cerca del tipo de población seleccionado
                 */
                txv2.setText(getString(R.string.txv2vs));
                txv2.append(numpobt);
                txtToast = getString(R.string.txtT4);

                break;
            default:

                DefaultState DefaultState = new DefaultState();
                DefaultState.doAction(context);
                colorx = DefaultState.toString();
                colory = DefaultState.toColor();

                /*
                genera un mensajes informativo al inicializar la aplicación
                 */
                txv2.setText(getString(R.string.txv2v));
                txtToast = getString(R.string.txtT5);
                reiniciarActividad(this);
        }
        /*
        cambiar el color del fondo
        */
        View contenedor = v.getRootView();
        contenedor.setBackgroundColor(getResources().getColor(colory));

        /*
        utiliza el patrón de diseño flyweight para ejemplificar el tipo de población
        */
        fwPoint = (Point) dotFactory.getFwPoint(getRandomColor());
        fwPoint.setCantidad(numpob);
        fwPoint.setTipox(nummap);
        fwPoint.setX(getRandomX());
        fwPoint.setY(getRandomY());
        fwPoint.setRadio(1);
        lienzo1.setFwPoint(fwPoint);
        lienzo1.draw(new Canvas());

        /*
         muestra un mensaje del singletón
          */
        mapa.muestraMensaje();


        // muestra mensaje informativo del tipo de población mediante el toast
        Toast.makeText(this, txtToast, Toast.LENGTH_LONG).show();
    }
    // Clase para poser mostrar el mapa donde se representarán las poblaciones
    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            Bitmap bmp;
            switch (nummap){
                case 1:
                    bmp = BitmapFactory.decodeResource(getResources(), mapa1 );
                    break;
                case 2:
                    bmp = BitmapFactory.decodeResource(getResources(), mapa2 );
                    break;
                case 3:
                    bmp = BitmapFactory.decodeResource(getResources(), mapa3 );
                    break;
                case 4:
                    bmp = BitmapFactory.decodeResource(getResources(), mapa4 );
                    break;
                default:
                    bmp = BitmapFactory.decodeResource(getResources(), mapa5 );
                    break;
            }
            /*
            calcula el punto de inicio de la imagen (esquina superior izquierda)
             */
            canvas.drawBitmap(bmp, (ancho - (ancho-30)), (alto- (alto - 5)), null);
        }
    }

    public static int getRandomColor(){
        int i;
        i = colores[(int)(Math.random()*colores.length)];
        return i;
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);

    }
    private static int getRandomY(){
        return (int)(Math.random()*100);

    }
    //reinicia una Activity
    public static void reiniciarActividad(Activity actividad){
        Intent intent=new Intent();
        intent.setClass(actividad, actividad.getClass());
        //llamamos a la actividad
        actividad.startActivity(intent);
        //finalizamos la actividad actual
        actividad.finish();
    }
}
