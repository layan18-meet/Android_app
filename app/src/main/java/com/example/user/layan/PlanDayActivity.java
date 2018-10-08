package com.example.user.layan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlanDayActivity extends AppCompatActivity implements View.OnClickListener {
    Button countryButton, citiesButton;
    EditText descriptionDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_day);

        countryButton= (Button) findViewById(R.id.countryButton);
        citiesButton= (Button) findViewById(R.id.citiesButton);
        descriptionDay= (EditText) findViewById(R.id.descriptionDay);
    }

    @Override
    public void onClick(View v) {

    }
}
