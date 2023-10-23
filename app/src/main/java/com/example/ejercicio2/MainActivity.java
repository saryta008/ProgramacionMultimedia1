package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button miBoton;
    Image gato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla1);

        miBoton=(Button)findViewById(R.id.boton1);
        miBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               // LayoutInflater inflater = getLayoutInflater();
                Toast.makeText(MainActivity.this, "Ver los gatitos" , Toast.LENGTH_SHORT).show();
            }
        });


    }

}