package com.example.user.layan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TripListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Trip> trips;

    ListView tripsLV;

    CustomAdapter2 tripAdapter;

    TextView tripListTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list);

        tripsLV= (ListView) findViewById(R.id.tripsLV);
        tripListTV= (TextView) findViewById(R.id.tripListTV);

        trips= new ArrayList<>();


        trips.add(new Trip("my fav trip", 1, "was amazing", 3));
        trips.add(new Trip("my worst trip", 1, "not so good", 5));

        trips.get(0).setCountries();

        tripsLV.setOnItemClickListener(this);
        tripAdapter= new CustomAdapter2(this, R.layout.custom_row2, trips);
        tripsLV.setAdapter(tripAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //----------------------------------------------------THE ERROR IS HERE!!!!!!!!!!!!!!!!!----------------------------------------------------------------------------
//        Intent i= new Intent(this, TripDesActivity.class);
//        i.putExtra("trip", trips.get(position));
//        startActivity(i);
        //----------------------------------------------------------------------------------------------------------------------------





        //String selectedItem= trips.get(position);
        //if (selectedItem=="Germany") {

        //}
    }
}
