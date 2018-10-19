package com.example.user.layan;

import java.util.ArrayList;
import java.util.List;

public class Trip {

    private List<String> countries;
    private String name;
    private int tripId;
    private ArrayList<TripDay> days;
    private String description;
    private int pin;

    public Trip(String name, List<String> countries){
        this.name= name;
        days = new ArrayList<>();
    }


    public CharSequence getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
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
