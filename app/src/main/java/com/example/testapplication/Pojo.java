package com.example.testapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pojo {


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<DataPojo> getData() {
        return data;
    }

    public void setData(List<DataPojo> data) {
        this.data = data;
    }

    @SerializedName("Response")
    @Expose
    private String response;

    @SerializedName("data")
    @Expose
    private List<DataPojo> data = null;
}
