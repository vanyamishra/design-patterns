package com.pattern.builder;

public class PerfumeBottleBuilder extends BottleBuilder {
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

    public void buildSprayNozzle() {
        System.out.println("Building perfume bottle spray nozzle...");
    }

    @Override
    public Bottle getResult() {
        return perfumeBottle;
    }
}
