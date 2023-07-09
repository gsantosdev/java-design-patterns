package org.example.behavioral.strategy;

public class SubtractionOperationStrategy implements OperationStrategy {

    @Override
    public Integer execute(int a, int b) {
        return a - b;
    }
}
