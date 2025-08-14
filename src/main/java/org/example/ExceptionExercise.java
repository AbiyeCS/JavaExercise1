package org.example;

import org.example.exceptions.NegativeNumberException;

public class ExceptionExercise {
    public static double divide(double a, double b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }

    public static void safeDivide(double a, double b) {
        try {
            double result = divide(a, b);
            System.out.println(a + "/" + b + " = " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    public static double squareRoot(double number) throws NegativeNumberException {
        if(number < 0){
            throw new NegativeNumberException("Cannot calculate square root of negative number: " + number);
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) throws NegativeNumberException {
        // TODO: Test safeDivide with valid and invalid inputs
        safeDivide(10, 0);
        // I'm sure that catch IllegalArgumentException in the safeDivde function will never be thrown because will it always not be thrown in the divide function instead

        // TODO: Test squareRoot with try-catch
//        squareRoot(-2);
        // I had to add throws to the main method declaration or it wouldn't let me test this OR I could've used a try and catch like below
        // And it causes my application to close, I guess that's why you use a try and catch

        // Test cases:
        safeDivide(10, 2);
        safeDivide(10, 0);

        try {
            double result = squareRoot(16);
            System.out.println("Square root: " + result);

            result = squareRoot(-4);  // This should throw exception
        } catch (NegativeNumberException e) {
            System.err.println("Custom error: " + e.getMessage());
        }
    }
}
