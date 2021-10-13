package com.example.testapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPojo {

    @SerializedName("fld_Date")
    @Expose
    private String fldDate;

    @SerializedName("fld_r_id")
    @Expose
    private int rid;

    @SerializedName("fld_crid")
    @Expose
    private String fldCrid;

    public String getFldDate() {
        return fldDate;
    }

    public void setFldDate(String fldDate) {
        this.fldDate = fldDate;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getFldCrid() {
        return fldCrid;
    }

    public void setFldCrid(String fldCrid) {
        this.fldCrid = fldCrid;
    }

    public String getFldDesc() {
        return fldDesc;
    }

    public void setFldDesc(String fldDesc) {
        this.fldDesc = fldDesc;
    }

    @SerializedName("fld_desc")
    @Expose
    private String fldDesc;
}
