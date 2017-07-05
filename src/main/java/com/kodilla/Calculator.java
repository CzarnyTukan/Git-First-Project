package com.kodilla;

/**
 * Created by Dom on 2017-07-04.
 */
public class Calculator {
    public double firstNumber;
    public double secondNumber;
    public double result;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void addNumbers() {
        result=firstNumber+secondNumber;
        return System.out.println(firstNumber+secondNumber);
    }

    public static void main(String args[])  {
        Calculator calculator = new Calculator(4.0, 4.0);
        calculator.addNumbers();
    }

}
