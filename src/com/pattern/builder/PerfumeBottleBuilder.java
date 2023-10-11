package com.pattern.builder;

public class PerfumeBottleBuilder extends BottleBuilder {
    PerfumeBottle perfumeBottle;

    @Override
    public void buildBody() {
        perfumeBottle = new PerfumeBottle("Jo Malone", "50 mL", "Glass");
    }

    @Override
    public void buildCap() {
    }

    @Override
    public void buildLabel() {
    }

    @Override
    public void buildSprayNozzle() {
    }

    @Override
    public Bottle getResult() {
        return perfumeBottle;
    }
}
