package com.example.testapplication.SecondRecycler;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("ID Nation")
    @Expose
    private String iDNation;
    @SerializedName("Nation")
    @Expose
    private String nation;
    @SerializedName("ID Year")
    @Expose
    private Integer iDYear;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Population")
    @Expose
    private Integer population;
    @SerializedName("Slug Nation")
    @Expose
    private String slugNation;

    public String getIDNation() {
        return iDNation;
    }

    public void setIDNation(String iDNation) {
        this.iDNation = iDNation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getIDYear() {
        return iDYear;
    }

    public void setIDYear(Integer iDYear) {
        this.iDYear = iDYear;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getSlugNation() {
        return slugNation;
    }

    public void setSlugNation(String slugNation) {
        this.slugNation = slugNation;
    }
}
