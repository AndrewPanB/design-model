package com.px.impl;

public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton(){
    }

    public static final Singleton getSingleton(){
        return SingletonHolder.INSTANCE;
    }

    public void show(){
        System.out.println("Singleton show");
    }
}
