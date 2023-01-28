package com.px.factory;

public class FactoryProducer {
    public AbstractFactory getAbstractFactory(String choice){
        if("color".equals(choice)){
            return new ColorFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
