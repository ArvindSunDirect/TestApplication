package com.example.testapplication.SecondRecycler;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondDatum {

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    @SerializedName("Mode")
    @Expose
    private String mode;

    @SerializedName("Amount")
    @Expose
    private String amt;

    @SerializedName("Date")
    @Expose
    private String date;

    @SerializedName("ID")
    @Expose
    private int id;

    @SerializedName("TranID")
    @Expose
    private String transId;
}

