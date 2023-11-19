package com.pattern.builder;

public abstract class BottleBuilder {
    public abstract void buildBody();

    public abstract void  buildCap();

    public abstract void  buildLabel();

    public abstract  Bottle getResult();
}
