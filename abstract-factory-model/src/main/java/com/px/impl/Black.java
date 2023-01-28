package com.px.impl;

import com.px.inter.Color;

public class Black implements Color {
    @Override
    public void fill() {
        System.out.println("Black color");
    }
}
