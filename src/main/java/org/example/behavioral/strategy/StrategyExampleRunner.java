package org.example.behavioral.strategy;

public class StrategyExampleRunner {


    public static void main(String[] args) {

        OperationStrategyContext operationStrategyContext = new OperationStrategyContext();
        operationStrategyContext.setOperationStrategy(new AdditionOperationStrategy());
        Integer additionResult = operationStrategyContext.executeStrategy(2, 3);

        System.out.println("ADDITION STRATEGY EXECUTED " + additionResult);

        operationStrategyContext.setOperationStrategy(new SubtractionOperationStrategy());
        Integer subtractionResult = operationStrategyContext.executeStrategy(2, 3);

        System.out.println("SUBTRACTION STRATEGY EXECUTED " + subtractionResult);

    }

}
