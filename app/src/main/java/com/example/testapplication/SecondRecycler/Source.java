package com.example.testapplication.SecondRecycler;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Source {
    @SerializedName("measures")
    @Expose
    private List<String> measures = null;
    @SerializedName("annotations")
    @Expose
    private Annotations annotations;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("substitutions")
    @Expose
    private List<Object> substitutions = null;

    public List<String> getMeasures() {
        return measures;
    }

    public void setMeasures(List<String> measures) {
        this.measures = measures;
    }

    public Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(List<Object> substitutions) {
        this.substitutions = substitutions;
    }
}
