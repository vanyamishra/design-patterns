package com.pattern.builder;

//Director class
public class Director {
    BottleBuilder bottleBuilder;

    public Director(BottleBuilder bottleBuilder){
        this.bottleBuilder = bottleBuilder;
    }

    public void construct(){
        bottleBuilder.buildBody();
        bottleBuilder.buildCap();
        bottleBuilder.buildLabel();
    }
}
