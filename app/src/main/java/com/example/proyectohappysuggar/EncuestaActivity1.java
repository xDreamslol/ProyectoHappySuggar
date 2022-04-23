package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EncuestaActivity1 extends AppCompatActivity {
    ImageButton btnicono1,btnicono2;
    private MediaPlayer mp, mp_great;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta1);

        btnicono1= (ImageButton) findViewById(R.id.btnmujer);
        btnicono2= (ImageButton) findViewById(R.id.btnhombre);

        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);

        btnicono1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp_great.start();
                Intent intent = new Intent(EncuestaActivity1.this, Encuesta2.class);
                startActivity(intent);
            }
        }
        );

        btnicono2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             mp_great.start();
                                             Intent intent = new Intent(EncuestaActivity1.this, Encuesta2.class);
                                             startActivity(intent);
                                         }
                                     }
        );

        mp.stop();
    }
}