package com.pattern.builder;

public class PerfumeBottle extends Bottle {

    String materialType;

    public PerfumeBottle(String title, String capacity, String materialType) {
        super(title, capacity);
        this.materialType = materialType;
    }

}
