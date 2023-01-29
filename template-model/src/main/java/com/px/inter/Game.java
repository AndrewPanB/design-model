package com.px.inter;

public abstract class Game {
    public abstract void init();

    public abstract void start();

    public abstract void end();

    public void play(){
        this.init();

        this.start();

        this.end();
    }
}
