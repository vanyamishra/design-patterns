package com.pattern.builder;

import com.pattern.builder.models.Bottle;
import com.pattern.builder.models.TonerBottle;

//Concrete builder for toner bottles
public class TonerBottleBuilder implements BottleBuilder {
    TonerBottle tonerBottle;
    
    @Override
    public void buildBody() {
        tonerBottle = new TonerBottle("AHA Toner", "100 mL");
    }

    @Override
    public void buildCap() {
        System.out.println("Building toner bottle cap.");
    }

    @Override
    public void buildLabel() {
        System.out.println("Building toner bottle label.");
    }

    @Override
    public Bottle getResult() {
        return tonerBottle;
    }

}
