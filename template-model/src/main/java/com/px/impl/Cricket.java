package com.px.impl;

import com.px.inter.Game;

public class Cricket extends Game {
    @Override
    public void init() {
        System.out.println("Cricket init");
    }

    @Override
    public void start() {
        System.out.println("Cricket start");
    }

    @Override
    public void end() {
        System.out.println("Cricket end");
    }
}
