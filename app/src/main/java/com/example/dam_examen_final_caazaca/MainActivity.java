package com.example.dam_examen_final_caazaca;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia del TextView
        TextView tvDNI = findViewById(R.id.tv_dni);

        // Opciones para mostrar en la ventana emergente
        final String[] opcionesDNI = {"DNI", "Carné de extranjería", "Pasaporte"};

        // Evento de clic para abrir la ventana emergente
        tvDNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Selecciona una opción");

                // Configurar las opciones en la lista
                builder.setItems(opcionesDNI, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Actualiza el TextView con la opción seleccionada
                        tvDNI.setText(opcionesDNI[which]);
                        Toast.makeText(MainActivity.this, "Seleccionaste: " + opcionesDNI[which], Toast.LENGTH_SHORT).show();
                    }
                });

                // Mostrar el diálogo
                builder.create().show();
            }
        });
    }
}