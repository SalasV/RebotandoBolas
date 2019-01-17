package com.example.tnb_20.rebotandobolas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private int width;
    private int height;
    int velocidadX,velocidadY;
    private float inicioX,inicioY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics display = this.getBaseContext().getResources().getDisplayMetrics();
        final ImageView pelota = findViewById(R.id.imageView);
        height = display.heightPixels;;
        width = display.widthPixels;


        velocidadX = 5;
        velocidadY = 5;
        inicioX = 10;
        inicioY = 15;


        final Bola bola = new Bola(inicioX,inicioY,velocidadX,velocidadY,pelota.getWidth(),pelota.getHeight());

        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                if(!(inicioY<=0) && !(inicioY >= height-pelota.getHeight())) {
                        inicioX += velocidadX;
                        inicioY += velocidadY;
                        pelota.setX(inicioX);
                        pelota.setY(inicioY);
                }else{
                    velocidadY = velocidadY * -1;
                    inicioY += velocidadY;
                }

                if(!(inicioX<=0) && !(inicioX >= width-pelota.getWidth())) {
                        inicioX += velocidadX;
                        inicioY += velocidadY;
                        pelota.setX(inicioX);
                        pelota.setY(inicioY);
                }else{
                    pelota.setX(inicioX);
                    velocidadX = velocidadX * -1;
                    inicioX += velocidadX;
                }
            }
        };

        Timer t = new Timer();
        t.schedule(task,100,25);
    }
}
