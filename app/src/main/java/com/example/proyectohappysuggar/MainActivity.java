package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Método para entrar a la encuesta

    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEntrar = findViewById(R.id.btnIngresar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EncuestaActivity1.class);
                startActivity(intent);
            }
        });
    }

    //Método para mostar y ocultar el menú en inicio

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }

    //Metodo para asignar las fuciones correspondientes a las opciones del menu.

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1) {

        } else if (id == R.id.item2){

        } else if (id == R.id.item3){

        }
        return super.onOptionsItemSelected(item);
    }
}