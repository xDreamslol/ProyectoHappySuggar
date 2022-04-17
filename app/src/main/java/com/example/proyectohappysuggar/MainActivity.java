package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity {


    private EditText et_nombre;
    private MediaPlayer mp, mp_great, mp_bad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre=findViewById(R.id.txt_nombre);

        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);

        mp_great = MediaPlayer.create(this, R.raw.wonderful);
        mp_bad = MediaPlayer.create(this, R.raw.bad);

    }

    public void Continuar(View view){
        String nombre=et_nombre.getText().toString();
        if (!nombre.equals("")) {


            Intent intent = new Intent(MainActivity.this, EncuestaActivity1.class);
            intent.putExtra("Participante", nombre);
            mp_great.start();
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this,"primero debe escribir su nombre",Toast.LENGTH_SHORT).show();
            mp_bad.start();
            et_nombre.requestFocus();
            InputMethodManager imm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            imm.showSoftInput(et_nombre, InputMethodManager.SHOW_IMPLICIT);

            mp.stop();
            mp.release();
        }
    }
    @Override
    public void onBackPressed(){
    }



}
