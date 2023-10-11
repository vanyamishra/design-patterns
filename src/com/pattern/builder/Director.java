package com.pattern.builder;

public class Director {
    BottleBuilder bottleBuilder;

    public Director(BottleBuilder bottleBuilder){
        this.bottleBuilder = bottleBuilder;
    }

    public void construct(boolean isPerfume){
        bottleBuilder.buildBody();
        bottleBuilder.buildCap();
        bottleBuilder.buildLabel();
        if(isPerfume){
            bottleBuilder.buildSprayNozzle();
        }
    }
}
