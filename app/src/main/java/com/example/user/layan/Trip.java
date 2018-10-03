package com.example.user.layan;

public class Trip {

    public String country;
    public String[] cities;
    public String description;
    public int pin;

    public Trip(String country, String[] cities, String description, int pin){
        country= country;
        cities= cities;
        description= description;
        pin= pin;
    }

    public void setCountry(String countryName) {
        country = countryName;
    }

    public void addCity(String cityName) {
        int currentSize = cities.length;
        int newSize = currentSize + 1;
        cities[cities.length- 1] = cityName;
    }



}
