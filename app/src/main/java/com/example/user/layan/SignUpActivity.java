package com.example.user.layan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username, password, email, phone_number;
    Button signUp;
    final String TAG="Firebase";
    TextView signUpTV;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpTV= (TextView) findViewById(R.id.signUpTV);
        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        email= (EditText) findViewById(R.id.email);
        phone_number= (EditText) findViewById(R.id.phone_number);



    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    @Override
    public void onClick(View v) {
        if ( v==signUp ) {
            String getEmail = email.getText().toString();

            if ((username.equals("") || password==null || email.equals("") || phone_number==null) || (!isEmailValid(getEmail))) {

                //Check if one or more fields are empty
                if (username.equals("") || password==null || email.equals("") || phone_number==null)
                    Toast.makeText(this, "There Are Empty Fields", Toast.LENGTH_SHORT).show();

                // Check if email id is valid or not
                if (!isEmailValid(getEmail))
                    Toast.makeText(this, "\"Your Email Id is Invalid.\"", Toast.LENGTH_SHORT).show();
            }

            else {
                Intent i = new Intent(this, ThirdPageActivity.class);
                startActivity(i);
            }

        }
    }
}


