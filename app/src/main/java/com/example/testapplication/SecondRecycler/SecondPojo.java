package com.example.testapplication.SecondRecycler;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondPojo {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("source")
    @Expose
    private List<Source> source = null;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public List<Source> getSource() {
        return source;
    }

    public void setSource(List<Source> source) {
        this.source = source;
    }
}
