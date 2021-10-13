package com.example.testapplication.SecondRecycler;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Annotations {

    @SerializedName("source_name")
    @Expose
    private String sourceName;
    @SerializedName("source_description")
    @Expose
    private String sourceDescription;
    @SerializedName("dataset_name")
    @Expose
    private String datasetName;
    @SerializedName("dataset_link")
    @Expose
    private String datasetLink;
    @SerializedName("table_id")
    @Expose
    private String tableId;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("subtopic")
    @Expose
    private String subtopic;

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public String getDatasetLink() {
        return datasetLink;
    }

    public void setDatasetLink(String datasetLink) {
        this.datasetLink = datasetLink;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubtopic() {
        return subtopic;
    }

    public void setSubtopic(String subtopic) {
        this.subtopic = subtopic;
    }
}
