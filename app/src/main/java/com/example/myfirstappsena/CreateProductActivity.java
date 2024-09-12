package com.example.myfirstappsena;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CreateProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_product);

        Button closeButtonCreate = findViewById(R.id.btnCreate);
        Button closeButtonBack = findViewById(R.id.btnBack);

        closeButtonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una Intent para regresar a MainActivity
                Intent intent = new Intent(CreateProductActivity.this, DashboardActivity.class);
                // Iniciar MainActivity
                startActivity(intent);
                // Opcionalmente, puedes finalizar esta actividad para que no se quede en la pila de actividades
                finish();
            }
        });

        closeButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear una Intent para regresar a MainActivity
                Intent intent = new Intent(CreateProductActivity.this, DashboardActivity.class);
                // Iniciar MainActivity
                startActivity(intent);
                // Opcionalmente, puedes finalizar esta actividad para que no se quede en la pila de actividades
                finish();
            }
        });


        // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //     return insets;
        // });
    }
}