package com.example.apknew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu extends AppCompatActivity {
    private TextView Resulado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Resulado = findViewById(R.id.et_resultado);
        String nombreUs = getIntent().getStringExtra("Usuario");
        Resulado.setText("Bienvenido " + nombreUs);
    }

    public void Tienda(View view){
        Intent i = new Intent(this, GPST.class);
        startActivity(i);
    }

    public void Formulario(View view){
        Intent i = new Intent(this, Crud.class);
        startActivity(i);
    }


}