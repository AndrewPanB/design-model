package com.px;

import com.px.factory.OperationFactory;
import com.px.impl.AddOperation;
import com.px.impl.MulOperation;
import com.px.impl.SubOperation;

public class Main {
    public static void main(String[] args) {
        OperationFactory operationFactory1 = new OperationFactory(new AddOperation());
        operationFactory1.printOperation(1, 3);

        OperationFactory operationFactory2 = new OperationFactory(new MulOperation());
        operationFactory2.printOperation(1, 3);

        OperationFactory operationFactory3 = new OperationFactory(new SubOperation());
        operationFactory3.printOperation(1, 3);
    }
}
