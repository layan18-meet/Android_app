package com.example.user.layan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Trip implements Serializable{

    private List<String> countries;
    private String name;
    private String tripId;
    private ArrayList<TripDay> days;
    private String description;
    private int pin;

    public Trip(String name, String description ){
     //   this.countries = new ArrayList<String>();
        this.days= new ArrayList<TripDay>();
        this.name= name;
      //  this.tripId= tripId;
        this.description=description;
     //   this.pin= pin;
    }

    public void setCountries() {
        days.add(new TripDay("France", "Paris", "wow", 1));
        days.add(new TripDay("England", "London", "eh", 8374));
        for (int i =0; i<days.size(); i++) {
            countries.add(days.get(i).getCountry());
        }
        //return countries;
    }

    public List<String> getCountries() {
        countries.add("France");
        countries.add("England");
        return countries;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public ArrayList<TripDay> getDays() {
        return days;
    }

    public void setDays(ArrayList<TripDay> days) {
        this.days = days;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
