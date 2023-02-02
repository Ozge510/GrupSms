package com.example.grupsms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class KayitActivity extends AppCompatActivity {

     EditText emailEditText,passwordEditText;
     Button registerButton;
     Button redirectTologinButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);
        emailEditText=findViewById(R.id.kayit_activity.email.editText);
        passwordEditText=findViewById(R.id.kayit_activity.passwordEditText);
        kayit_button=findViewById(R.id.kayit_activity.kayit_button);





    }
}