package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btniniciarsesion;
    Button btnRegistrar1;
    private MediaPlayer mp, mp_great, mp_bad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //musica
        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);

        mp_great = MediaPlayer.create(this, R.raw.wonderful);
        mp_bad = MediaPlayer.create(this, R.raw.bad);
    }



    //metodo del boton iniciarsecionyregistrarse
            public void setBtniniciarsesion(View view) {
                mp_great.start();
                Intent intent = new Intent(MainActivity.this, iniciosesion.class);
                startActivity(intent);

            }
    public void setBtnRegistrar1(View view) {
        Intent intent = new Intent(MainActivity.this, registrarse.class);
        startActivity(intent);
        mp.stop();
        mp.release();
    }



    //Método para mostar y ocultar el menú en inicio

   // public boolean onCreateOptionsMenu(Menu menu){
     //   getMenuInflater().inflate(R.menu.inicio, menu);
       // return true;
    }

    //Metodo para asignar las fuciones correspondientes a las opciones del menu.

   // public boolean onOptionsItemSelected(MenuItem item){
       // int id = item.getItemId();

      //  if(id == R.id.item1) {

      //  } else if (id == R.id.item2){

        //} else if (id == R.id.item3){

      //  }
       // return super.onOptionsItemSelected(item);
  //  }
//}