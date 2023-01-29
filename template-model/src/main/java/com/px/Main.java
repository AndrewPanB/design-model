package com.px;

import com.px.impl.Cricket;
import com.px.impl.Football;
import com.px.inter.Game;

public class Main {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
    }
}
