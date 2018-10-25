package com.rainy.bryan.exercisingtracker.models;

public class Exercise_Model_Video {

    String name;
    String howDescription;
    String whyDescription;
    String videoURL;

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowDescription() {
        return howDescription;
    }

    public void setHowDescription(String howDescription) {
        this.howDescription = howDescription;
    }

    public String getWhyDescription() {
        return whyDescription;
    }

    public void setWhyDescription(String whyDescription) {
        this.whyDescription = whyDescription;
    }

    public Exercise_Model_Video(String name, String how, String why, String url) {
        this.name = name;
        this.howDescription = how;
        this.whyDescription = why;
        this.videoURL = url;
    }
}
