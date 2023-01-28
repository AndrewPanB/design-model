package com.px.impl;

import com.px.inter.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red color");
    }
}
