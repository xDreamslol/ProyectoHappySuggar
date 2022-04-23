package com.example.proyectohappysuggar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class inicio extends AppCompatActivity {
    private MediaPlayer mp, mp_great;
    Button btn0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        btn0= (Button) findViewById(R.id.btninicio);
        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);
        btn0.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        mp_great.start();
                                        Intent intent = new Intent(inicio.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                }
        );

    }
}

