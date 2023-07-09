package org.example.behavioral.strategy;

public class OperationStrategyContext {

    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public Integer executeStrategy(int a, int b) {
        return operationStrategy.execute(a, b);
    }
}
