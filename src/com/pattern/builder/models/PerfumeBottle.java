package com.pattern.builder.models;

public class PerfumeBottle extends Bottle {

    String materialType;

    public PerfumeBottle(String title, String capacity, String materialType) {
        super(title, capacity);
        this.materialType = materialType;
    }

    public String getCapacity(){
        return materialType;
    }
}
