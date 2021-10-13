package com.example.testapplication.SecondRecycler;

public class DataModel {

    public DataModel(String country, String popu) {
        this.country = country;
        this.popu = popu;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopu() {
        return popu;
    }

    public void setPopu(String popu) {
        this.popu = popu;
    }

    private String country;
    private String popu;
}
