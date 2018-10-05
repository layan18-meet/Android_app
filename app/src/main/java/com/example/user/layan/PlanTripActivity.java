package com.example.user.layan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class PlanTripActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    Button addTripButton;
    Switch addPinSwitch;
    ListView daysLV;
    ArrayList<TripDay> dayArrayList= new ArrayList<>();
    ArrayAdapter<TripDay> dayArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trip);

        addTripButton= (Button) findViewById(R.id.addTripButton);
        addPinSwitch= (Switch)findViewById(R.id.addPinSwitch);
        daysLV= (ListView) findViewById(R.id.daysLV);

        dayArrayAdapter= new ArrayAdapter<TripDay>(this, android.R.layout.simple_list_item_1, dayArrayList);
        daysLV.setAdapter(dayArrayAdapter);
    }

    @Override
    public void onClick(View v) {
        if( v==addTripButton ){
            Intent i = new Intent(this, PlanDayActivity.class);
            startActivity(i);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        
    }
}
