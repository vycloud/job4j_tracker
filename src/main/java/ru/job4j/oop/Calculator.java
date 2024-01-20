package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result;
        Calculator calculator = new Calculator();
        result = Calculator.sum(10);
        System.out.println("Result from static method sum: " + result);
        result = calculator.multiply(5);
        System.out.println("Result from non-static method multiply: " + result);
        result = Calculator.minus(8);
        System.out.println("Result from static method minus: " + result);
        result = calculator.divide(20);
        System.out.println("Result from non-static method divide: " + result);
        result = calculator.sumAllOperation(7);
        System.out.println("Result from non-static method sumAllOperation: " + result);
    }
}
