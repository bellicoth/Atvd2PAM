package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variaveis globais que representam os objetos no xml
    Button btnSingIn, btnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //abrindo a minha activity
        setContentView(R.layout.activity_main);



        btnSingIn = findViewById(R.id.btnSignIn);
        btnSingUp = findViewById(R.id.btnSignUp);

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),SingInActivity2.class));
                finish();

            }
        });

        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),SingUpActivity.class));
                finish();
            }
        });


    }



}