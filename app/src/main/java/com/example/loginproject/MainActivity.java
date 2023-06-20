package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Llamado al método creado para ingresar datos.
        enterData();
    }

    private void enterData() {
        // Creación de instancias generadas en el diseño.
        EditText textName = findViewById(R.id.textName);
        EditText textLastName = findViewById(R.id.textLastName);
        EditText textEmail = findViewById(R.id.textEmail);
        EditText textPassword = findViewById(R.id.textPassword);
        Button createAccount = findViewById(R.id.createAccountButton);

        // Creación de funcionalidad para el botón de crear cuenta.
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creación de variables para cada campo.
                String name = textName.getText().toString().trim();
                String lastName = textLastName.getText().toString().trim();
                String email = textEmail.getText().toString();
                String password = textPassword.getText().toString();

                // Validación para el nombre.
                if (name.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Ingrese su nombre por favor.", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Validación para el apellido.
                if (lastName.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Ingrese su apellido por favor.", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Validación para el e-mail.
                if (!email.contains("@") || !email.contains(".")) {
                    Toast.makeText(getBaseContext(), "Ingrese un e-mail válido por favor.", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Validación para el password.
                if (password.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Ingrese una contraseña por favor.", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });

    }

}
