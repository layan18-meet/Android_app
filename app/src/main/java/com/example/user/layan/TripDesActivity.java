package com.example.user.layan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TripDesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    ArrayList<TripDay> tripDays2;

    ListView plannedDaysLV;

    CustomAdapter dayAdapter2;

    TextView plannedDaysTV, tripName2TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_des);

        plannedDaysLV= (ListView) findViewById(R.id.plannedDaysLV);

        plannedDaysTV= (TextView) findViewById(R.id.plannedDaysTV);
        tripName2TV= (TextView) findViewById(R.id.tripName2TV);

        plannedDaysLV.setOnClickListener(this);


        Trip trip = (Trip) getIntent().getSerializableExtra("trip");
        if(trip != null){
            tripName2TV.setText(trip.getName());
            tripDays2= trip.getDays();

        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onClick(View v) {

    }
}
