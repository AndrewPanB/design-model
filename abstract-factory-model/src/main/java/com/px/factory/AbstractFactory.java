package com.px.factory;

import com.px.inter.Color;
import com.px.inter.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String name);

    public abstract Color getColor(String name);
}
