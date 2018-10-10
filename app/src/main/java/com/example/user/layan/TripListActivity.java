package com.example.user.layan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TripListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<String> tripList= new ArrayList<>();
    ListView lvTrips;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list);

        lvTrips= (ListView) findViewById(R.id.lvTrips);

        lvTrips.setOnItemClickListener(this);

        arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tripList);
        lvTrips.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem= tripList.get(position);
        if (selectedItem=="Germany") {

        }
    }
}
