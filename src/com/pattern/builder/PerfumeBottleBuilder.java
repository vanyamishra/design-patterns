package com.pattern.builder;

import com.pattern.builder.models.Bottle;
import com.pattern.builder.models.PerfumeBottle;

//Concrete builder for perfume bottles
public class PerfumeBottleBuilder implements BottleBuilder {
    PerfumeBottle perfumeBottle;

    @Override
    public void buildBody() {
        perfumeBottle = new PerfumeBottle("Jo Malone", "50 mL", "Glass");
    }

    @Override
    public void buildCap() {
        System.out.println("Building perfume bottle cap...");
    }

    @Override
    public void buildLabel() {
        System.out.println("Building perfume bottle label...");
    }

    @Override
    public Bottle getResult() {
        return perfumeBottle;
    }
}
