package com.pattern.builder.models;

public class Bottle {
    private String title;
    private String capacity;

    public Bottle(String title, String capacity){
        this.title = title;
        this.capacity = capacity;
    }

    public String getTitle(){
        return title;
    }

    public String getCapacity(){
        return capacity;
    }

}
