package com.rainy.bryan.exercisingtracker.models;

public class Exercise_Model {

    String name;
    String howDescription;
    String whyDescription;
    Integer exampleGif;

    public Integer getExampleGif() {
        return exampleGif;
    }

    public void setExampleGif(Integer exampleGif) {
        this.exampleGif = exampleGif;
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

    public Exercise_Model(String name, String how, String why, Integer gif) {
        this.name = name;
        this.howDescription = how;
        this.whyDescription = why;
        this.exampleGif = gif;
    }


}
