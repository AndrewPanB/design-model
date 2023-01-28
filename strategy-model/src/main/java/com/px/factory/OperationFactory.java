package com.px.factory;

import com.px.inter.Operation;

public class OperationFactory {
    private Operation operation;

    public OperationFactory(Operation operation){
        this.operation = operation;
    }

    public void printOperation(int num1, int num2){
        System.out.println(operation.operate(num1, num2));
    }
}
