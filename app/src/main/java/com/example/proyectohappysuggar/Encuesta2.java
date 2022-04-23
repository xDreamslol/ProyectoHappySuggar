package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Encuesta2 extends AppCompatActivity {

    Button botonsiguiente;
    private MediaPlayer mp, mp_great;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta2);

        botonsiguiente = (Button) findViewById(R.id.btnsiguiente);
        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);

         botonsiguiente.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View view){
        mp_great.start();
        Intent intent = new Intent(Encuesta2.this, Perfil.class);
        startActivity(intent);
    }
    }
        );
        mp.stop();
}
}