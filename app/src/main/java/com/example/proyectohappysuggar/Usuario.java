package com.example.proyectohappysuggar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.EditText;

public class Usuario {
    private String Nombre, Usuario,Password;
    EditText et_nombre;
    Intent intent;

    private MediaPlayer mp, mp_great;



    public Usuario(String nombre, String usuario, String password) {
        Nombre = nombre;
        Usuario = usuario;
        Password = password;
    }

    public Usuario() {

    }


    public boolean isNull() {
        if (Nombre.equals("") && Usuario.equals("") && Password.equals("")){
            return false;
        }else

        {
            return true;
        }
    }

    @Override
    public String toString() {
        return "iniciosesion{" +
                "et_nombre=" + et_nombre +
                ", intent=" + intent +
                ", mp=" + mp +
                ", mp_great=" + mp_great +
                ", Nombre='" + Nombre + '\'' +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                ", btningresar=" + btningresar +
                '}';
    }


    public String getUsuario() {

        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public EditText getEt_nombre() {
        return et_nombre;
    }

    public void setEt_nombre(EditText et_nombre) {
        this.et_nombre = et_nombre;
    }


    Button btningresar;


}
