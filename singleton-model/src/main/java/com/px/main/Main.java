package com.px.main;

import com.px.impl.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.show();
    }
}
