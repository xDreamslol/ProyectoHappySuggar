package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.inputmethod.InputMethodManager;
import android.media.MediaPlayer;


public class registrarse extends AppCompatActivity {
    Button btn1, btn2;
    private MediaPlayer mp, mp_great;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        btn1=(Button) findViewById(R.id.btn_registrar);
        btn2=(Button) findViewById(R.id.cancelar);

        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();



        //metodo para cuando le das clic al boton registrar
     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             mp_great.start();
             Intent intent = new Intent(registrarse.this, iniciosesion.class);
             startActivity(intent);
         }
     }
     );
        //metodo del boton registrarse
        btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         Intent intent = new Intent(registrarse.this, MainActivity.class);
         startActivity(intent);
          }
        }
        );
        mp.stop();
    }



    }

