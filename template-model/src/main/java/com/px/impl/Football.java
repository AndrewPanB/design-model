package com.px.impl;

import com.px.inter.Game;

public class Football extends Game {
    @Override
    public void init() {
        System.out.println("Football init");
    }

    @Override
    public void start() {
        System.out.println("Football start");
    }

    @Override
    public void end() {
        System.out.println("Football end");
    }
}
