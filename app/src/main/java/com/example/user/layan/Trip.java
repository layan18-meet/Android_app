package com.example.user.layan;

import java.util.ArrayList;

public class Trip {

    public String[] countries;
    public int tripId;
    public ArrayList<TripDay> days;
    public String description;
    public int pin;

    public Trip(String[] countries, String description, int pin){
        description= this.description;
        pin= this.pin;
        days = new ArrayList<>();

    }


    public void addCountry(String CountryName) {

    }


    public void addDay(TripDay tripDay){
        days.add(tripDay);
    }

    public void addCity(String cityName) {
       /* int currentSize = TripDay.length;
        int newSize = currentSize + 1;
        cities[cities.length- 1] = cityName;*/
    }



}
