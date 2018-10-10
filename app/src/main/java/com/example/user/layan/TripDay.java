package com.example.user.layan;

import java.util.ArrayList;

public class TripDay {
    public String country;
    public int tripId;
    public ArrayList<String> cities;
    public String description;


    public TripDay(String country, String city, String description) {
        country= this.country;
        description= this.description;
        cities= new ArrayList<String>();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<String> getCities() {
        return this.cities;
    }

    public void addCity(String city) {
        this.cities.add(city);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
