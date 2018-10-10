package com.example.user.layan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText password2, username2;
    Button login;
    TextView loginTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        password2 = (EditText) findViewById(R.id.password2);
        username2 = (EditText) findViewById(R.id.username2);
        login = (Button) findViewById(R.id.login);
        loginTV= (TextView) findViewById(R.id.loginTV);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == login) {
            Intent i = new Intent(this, ThirdPageActivity.class);
            startActivity(i);
        }
    }
}