package com.example.myfirstappsena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard); // Asegúrate de usar el nombre correcto del layout

        // Encuentra el botón "Cerrar"
        Button closeButtonClose = findViewById(R.id.toggle_btn_close);
        Button closeButtonCreate = findViewById(R.id.toggle_btn_create);

        // Configura el OnClickListener
        closeButtonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una Intent para regresar a MainActivity
                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                // Iniciar MainActivity
                startActivity(intent);
                // Opcionalmente, puedes finalizar esta actividad para que no se quede en la pila de actividades
                finish();
            }
        });

        closeButtonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una Intent para regresar a MainActivity
                Intent intent = new Intent(DashboardActivity.this, CreateProductActivity.class);
                // Iniciar MainActivity
                startActivity(intent);
                // Opcionalmente, puedes finalizar esta actividad para que no se quede en la pila de actividades
                finish();
            }
        });
    }
}