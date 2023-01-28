package com.px.factory;

import com.px.Shape;
import com.px.impl.Circle;
import com.px.impl.Rectangle;
import com.px.impl.Square;

public class ShapeFactory {
    public static Shape getShape(String name){
        if("circle".equals(name)){
            return new Circle();
        } else if ("rectangle".equals(name)){
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
