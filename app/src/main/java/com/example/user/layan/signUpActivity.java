package com.example.user.layan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signUpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username, password, email, phone_number;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        email= (EditText) findViewById(R.id.email);
        phone_number= (EditText) findViewById(R.id.phone_number);
    }


    @Override
    public void onClick(View v) {
        if ( v==signUp ) {

        }
    }
}
