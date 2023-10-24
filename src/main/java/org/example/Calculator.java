package org.example;

import java.util.function.BinaryOperator;

public class Calculator {
    private BinaryOperator<Double> adding = (a, b) -> a + b;
    private BinaryOperator<Double> subtracting = (a, b) -> a - b;
    private BinaryOperator<Double> multiplying = (a, b) -> a * b;
    private BinaryOperator<Double> dividing = (a, b) -> a / b;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: " + calculator.add(242, 11));
        System.out.println("Subtract: " + calculator.subtract(242, 11));
        System.out.println("Multiply: " + calculator.multiply(242, 11));
        System.out.println("Divide: " + calculator.divide(242, 11));
    }

    public double add(double a, double b) {
        return adding.apply(a, b);
    }

    public double subtract(double a, double b) {
        return subtracting.apply(a, b);
    }

    public double multiply(double a, double b) {
        return multiplying.apply(a, b);
    }

    public double divide(double a, double b) {
        return dividing.apply(a, b);
    }
}