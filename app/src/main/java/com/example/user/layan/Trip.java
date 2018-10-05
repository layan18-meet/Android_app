package com.example.user.layan;

import java.util.ArrayList;

public class Trip {

    public String country;
    public ArrayList<TripDay> day;
    public String description;
    public int pin;

    public Trip(String country, String description, int pin){
        country= this.country;
        description= this.description;
        pin= this.pin;
        day = new ArrayList<>();
    }

    public void setCountry(String countryName) {
        country = countryName;
    }

    public void addDay(TripDay tripDay){
        day.add(tripDay);
    }
    public void addCity(String cityName) {
       /* int currentSize = TripDay.length;
        int newSize = currentSize + 1;
        cities[cities.length- 1] = cityName;*/
    }



}
