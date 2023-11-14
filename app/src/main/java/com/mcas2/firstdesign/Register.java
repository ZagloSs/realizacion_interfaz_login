package com.mcas2.firstdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void openMain(View view) {
        Toast toast = Toast.makeText(Register.this, "Entrar al Main", Toast.LENGTH_LONG);
        toast.show();
    }

    public void openLogin(View view) {
        Intent intent = new Intent(Register.this, Login.class);
        startActivity(intent);
    }
}