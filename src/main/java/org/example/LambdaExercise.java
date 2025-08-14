package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExercise {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        names.forEach(name -> System.out.println(name));

        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .toList();

        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        List<String> sortedByLength = names.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        Optional<String> nameWithC = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();

        System.out.println("Long names: " + longNames);
        System.out.println("Upper names: " + upperNames);
        System.out.println("Sorted by length: " + sortedByLength);
        System.out.println("Name with C: " + nameWithC.get());


    }
}
