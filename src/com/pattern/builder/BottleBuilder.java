package com.pattern.builder;

public abstract class BottleBuilder {
    public void buildBody() {
    }

    public void buildCap() {
    }

    public void buildLabel() {
    }

    public void buildSprayNozzle() {
    }

    abstract public Bottle getResult();
}
