package com.example.proyectospinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    private Button btnAceptar;
    private Button btnCancelar;

    private TextInputLayout tilNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //region Referencias y Eventos

    private void referencias(){
        btnAceptar = findViewById(R.id.btnAceptar);
        btnCancelar = findViewById(R.id.btnCancelar);
        tilNombre = findViewById(R.id.tilNombre);
    }

    private void eventos(){
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerDatos();
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        private void obtenerDatos(){
            String nombre = tilNombre.getEditText().getText().toString();
            Intent mostrarNombre = new Intent(this, DesplegarInfoActivity.class);
            mostrarNombre.putExtra("datoNombre", nombre);
            startActivity(mostrarNombre);
        }
    }
}