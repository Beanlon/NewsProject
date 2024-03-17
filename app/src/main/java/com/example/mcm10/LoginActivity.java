package com.example.mcm10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    String username;

    String password;

    String usernameCheck;

    String passwordCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button mybutton = findViewById(R.id.button2);
        EditText usernameInput = findViewById(R.id.username);
        EditText passwordInput = findViewById(R.id.password);
        usernameCheck= "MATARIC";
        passwordCheck= "test";


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LOGIN CODE
                username = usernameInput.getText().toString();
                password = passwordInput.getText().toString();
                if (username.equals(usernameCheck) && password.equals(passwordCheck)) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);

                }
            }

        });
    }
}