package com.example.user.layan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class PlanTripActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    Button addTripButton, saveTripButton;
    EditText tripDescription;
    ListView daysLV;
    ArrayList<TripDay> days;
    Custom_adapter dayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trip);

        addTripButton= (Button) findViewById(R.id.addTripButton);
        saveTripButton= (Button) findViewById(R.id.saveTripButton);
        tripDescription=(EditText) findViewById(R.id.tripDescription);
        daysLV= (ListView) findViewById(R.id.daysLV);

        days= new ArrayList<>();

        days.add(new TripDay("country", "city", "day1", R.drawable.flag));
        days.add(new TripDay("country", "city", "day2", R.drawable.flag));
        days.add(new TripDay("country", "city", "day3", R.drawable.flag));
        days.add(new TripDay("country", "city", "day4", R.drawable.flag));

        addTripButton.setOnClickListener(this);
        saveTripButton.setOnClickListener(this);

        dayAdapter= (Custom_adapter) new Custom_adapter(this, R.layout.custom_row, days);
        daysLV.setAdapter(dayAdapter);
        daysLV.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if( v==addTripButton ){
            Intent i = new Intent(this, PlanDayActivity.class);
            startActivity(i);
        }
        else if(v==saveTripButton){

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
