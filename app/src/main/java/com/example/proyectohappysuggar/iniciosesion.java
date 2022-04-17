package com.example.proyectohappysuggar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class iniciosesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciosesion);

        et_nombre=findViewById(R.id.txt_nombre);
        //de BD//
    }
    public void Ingresar (View view){
        String nombre = et_nombre.getText().toString();
        if (!nombre.equals("")) {
            Intent siguiente1 = new Intent (iniciosesion.this, EncuestaActivity1.class);
            intent.putExtra("Participante", nombre);
            startActivity(siguiente1);
            finish();
        } else {
            Toast.makeText(this, "primero debe escribir su nombre", Toast.LENGTH_SHORT).show();
            et_nombre.requestFocus();
            InputMethodManager imm = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
            imm.showSoftInput(et_nombre, InputMethodManager.SHOW_IMPLICIT);
        }
    }
    @Override
    public void onBackPressed () {
    }
}