package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        List<Integer> processed = numbers.stream()
                .filter(numGreaterThanFive -> numGreaterThanFive > 5)
                .map(n -> n * 2)
                .toList();
        System.out.println(processed);

//        // can't figure out
//        int sum = numbers.stream()
//                .equals();
//        System.out.println("Sum: " + sum);

// So to use the .sum() you have to map it to Int first to make it into a IntStream which then allows you to use the .sum() method

        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum: " + sum);

        boolean hasLargeNumber = numbers.stream()
                .anyMatch(n -> n > 8);
        System.out.println("Has large number: " + hasLargeNumber);

        Optional<Integer> firstLarge = numbers.stream()
                .filter(n -> n > 5)
                .findFirst();

        //Extract the firstLarge value
        if (firstLarge.isPresent()) {
            System.out.println("First large: " + firstLarge.get());
        } else {
            System.out.println("No large number found");
        }

    }
}
