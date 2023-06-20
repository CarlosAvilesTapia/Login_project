package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*if(textName.getText().toString().isEmpty() || textLastName.getText().toString().isEmpty() || textEmail.getText().toString().isEmpty()
        || textPassword.getText().toString().isEmpty() || !textEmail.getText().toString().contains("@") ){
        Toast.makeText(getBaseContext(), "faltan campos por completar", Toast.LENGTH_SHORT).show();
        return;
        }*/