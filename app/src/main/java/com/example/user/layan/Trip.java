package com.example.user.layan;

import java.util.ArrayList;

public class Trip {

    private String[] countries;
    private String name;
    private int tripId;
    private ArrayList<TripDay> days;
    private String description;
    private int pin;

    public Trip(String[] countries, String description, int pin, int tripId, String name){
        description= this.description;
        pin= this.pin;
        days = new ArrayList<>();
        tripId= this.tripId;
    }


    public void addCountry(String CountryName) {

    }

    public String getName() { return name;}


    public void addDay(TripDay tripDay){
        days.add(tripDay);
    }

    public void addCity(String cityName) {
       /* int currentSize = TripDay.length;
        int newSize = currentSize + 1;
        cities[cities.length- 1] = cityName;*/
    }



}
