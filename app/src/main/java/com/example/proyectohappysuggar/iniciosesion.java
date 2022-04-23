package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class iniciosesion extends AppCompatActivity {
EditText et_nombre;
Intent intent;
Button btningresar;
    private MediaPlayer mp, mp_great;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciosesion);

        et_nombre = findViewById(R.id.txt_nombre);
        btningresar = findViewById(R.id.Ingresar);

        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);


        //aqui BD

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //prueba
                String nombre = et_nombre.getText().toString();
                if (!nombre.equals("")) {
                    mp_great.start();
                    Intent siguiente1 = new Intent (iniciosesion.this, EncuestaActivity1.class);
                    intent.putExtra("Participante", nombre);
                    startActivity(siguiente1);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "primero debe escribir su nombre", Toast.LENGTH_SHORT).show();
                    mp.stop();
                    mp.release();
                }
        }
        }
        );
        }
    }
