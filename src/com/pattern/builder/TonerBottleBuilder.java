package com.pattern.builder;

public class TonerBottleBuilder extends BottleBuilder {
    TonerBottle tonerBottle;
    
    @Override
    public void buildBody() {
        tonerBottle = new TonerBottle("AHA Toner", "100 mL");
    }

    @Override
    public void buildCap() {
    }

    @Override
    public void buildLabel() {
    }

    @Override
    public Bottle getResult() {
        return tonerBottle;
    }

}
