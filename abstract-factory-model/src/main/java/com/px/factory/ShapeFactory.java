package com.px.factory;

import com.px.inter.Color;
import com.px.inter.Shape;
import com.px.impl.Circle;
import com.px.impl.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name){
        if("circle".equals(name)){
            return new Circle();
        } else {
            return new Square();
        }
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
