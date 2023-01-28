package com.px.factory;

import com.px.impl.Black;
import com.px.impl.Red;
import com.px.inter.Color;
import com.px.inter.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        if ("black".equals(name)) {
            return new Black();
        } else {
            return new Red();
        }
    }
}
