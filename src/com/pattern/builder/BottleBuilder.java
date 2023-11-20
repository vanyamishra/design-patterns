package com.pattern.builder;

import com.pattern.builder.models.Bottle;

public interface BottleBuilder {
    void buildBody();

    void buildCap();

    void buildLabel();

    Bottle getResult();
}
