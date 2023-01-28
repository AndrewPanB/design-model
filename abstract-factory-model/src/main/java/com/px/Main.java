package com.px;

import com.px.factory.AbstractFactory;
import com.px.factory.FactoryProducer;
import com.px.inter.Color;
import com.px.inter.Shape;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory1 = factoryProducer.getAbstractFactory("shape");
        Shape shape1 = shapeFactory1.getShape("circle");
        shape1.draw();

        AbstractFactory shapeFactory2 = factoryProducer.getAbstractFactory("shape");
        Shape shape2 = shapeFactory2.getShape("square");
        shape2.draw();

        AbstractFactory colorFactory3 = factoryProducer.getAbstractFactory("color");
        Color color1 = colorFactory3.getColor("red");
        color1.fill();

        AbstractFactory colorFactory4 = factoryProducer.getAbstractFactory("color");
        Color color2 = colorFactory4.getColor("black");
        color2.fill();
    }
}
