package com.px.impl;

import com.px.inter.Operation;

public class AddOperation implements Operation {
    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}
