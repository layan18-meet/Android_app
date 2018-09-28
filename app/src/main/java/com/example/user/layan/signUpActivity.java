package com.example.user.layan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    String getEmail = email.getText().toString();



    @Override
    public void onClick(View v) {
        if ( v==signUp ) {
            if ((username.equals("") || password==null || email.equals("") || phone_number==null) || (!isEmailValid(getEmail))) {

                //Check if one or more fields are empty
                if (username.equals("") || password==null || email.equals("") || phone_number==null)
                    Toast.makeText(this, "There Are Empty Fields", Toast.LENGTH_SHORT).show();

                // Check if email id is valid or not
                if (!isEmailValid(getEmail))
                    Toast.makeText(this, "\"Your Email Id is Invalid.\"", Toast.LENGTH_SHORT).show();
            }

            else {
                Intent i = new Intent(this, homeActivity.class);
                startActivity(i);
            }

        }
    }
}
