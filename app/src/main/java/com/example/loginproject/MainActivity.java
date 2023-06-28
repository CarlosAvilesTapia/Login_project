package com.example.loginproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Generación de clase tipo Binding para utilizar view binding en la Activity.
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creación de la instancia binding para ser usada por la Activity.
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Se pasa al setContentView para activarla en pantalla.
        setContentView(binding.getRoot());

        // Llamado al método creado para ingresar datos.
        enterData();
    }

    // Creación de método para llenado de datos.
    private void enterData() {

        // Creación de funcionalidad para el botón de crear cuenta mediante view binding.
        binding.createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creación de variables para cada campo con view binding.
                String name = binding.textName.getText().toString().trim();
                String lastName = binding.textLastName.getText().toString().trim();
                String email = binding.textEmail.getText().toString();
                String password = binding.textPassword.getText().toString();

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
