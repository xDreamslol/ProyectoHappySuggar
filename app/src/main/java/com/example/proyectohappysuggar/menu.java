package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class menu extends AppCompatActivity {
    ToggleButton  btn1;
    private MediaPlayer mp, mp_great;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1= (ToggleButton) findViewById(R.id.toggleButton5);

        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();

        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(menu.this, Logros.class);
                                        startActivity(intent);
                                    }
                                }
        );
        mp.stop();
    }

}