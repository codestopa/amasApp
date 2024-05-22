package com.example.amasapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class RecetaActivity extends AppCompatActivity {

    private TextView mNombreReceta;
    private TextView mIngredientes;
    private TextView mNombremetodo;
    private TextView mReceta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        mNombreReceta = (TextView) findViewById(R.id.receta);
        mIngredientes = (TextView) findViewById(R.id.ingredientes);
        mNombremetodo = (TextView) findViewById(R.id.nombre);
        mReceta = (TextView) findViewById(R.id.metodo);
        //estructura de datos que contiene una descripción de la acción que se va a realizar
        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("nombre");
        String ingredientes = intent.getExtras().getString("ingredientes");
        String tituloMetodo = intent.getExtras().getString("tituloMetodo");
        String receta = intent.getExtras().getString("receta");

        mNombreReceta.setText("nombre");
        mIngredientes.setText("ingredientes");
        mNombremetodo.setText("tituloMetodo");
        mReceta.setText("receta");
    }
}