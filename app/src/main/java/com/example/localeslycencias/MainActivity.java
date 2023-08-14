package com.example.localeslycencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresar (View view){
        Intent ingresar = new Intent(this, menuPrincipal.class);
        startActivity(ingresar);
    }

    public void Registrar (View view){
        Intent registrar = new Intent(this, formularioRegistro.class);
        startActivity(registrar);
    }

}