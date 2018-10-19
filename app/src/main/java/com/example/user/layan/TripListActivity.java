package com.example.user.layan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TripListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Trip> trips;
    ListView tripsLV;
    CustomAdapter2 tripAdapter;
    TextView tripListTV;
    List<String> countries;
    List<String> countries2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list);

        tripsLV= (ListView) findViewById(R.id.tripsLV);
        tripListTV= (TextView) findViewById(R.id.tripListTV);

        trips= new ArrayList<>();

        countries = new ArrayList<>();
        countries2 = new ArrayList<>();
        countries.add("Italy");
        countries.add("France");
        countries2.add("Palestine");
        countries2.add("South Africa");
        countries2.add("Spain");


        trips.add(new Trip("my fav trip", countries));
        trips.add(new Trip("my worst trip", countries2));


        tripAdapter= new CustomAdapter2(this, R.layout.custom_row2, trips);
        tripsLV.setAdapter(tripAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //String selectedItem= trips.get(position);
        //if (selectedItem=="Germany") {

        //}
    }
}
