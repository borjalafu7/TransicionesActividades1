package com.borjalapa.transicionesactividades1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //en el archivo themes.xml cambiamos y habilitamos las transiciones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarActividad(View view) {
        //le decimos que cree una escena de transicion con lo que hemos puesto en el archivo themes.xml
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);

        Intent i = new Intent(this,MainActivity2.class);
        //iniciamos la otra actividad y le pasamos la transicion
        startActivity(i, options.toBundle());
    }
}