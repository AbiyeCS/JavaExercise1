package org.example;

import java.util.Optional;

public class OptionalExercise {
    public static Optional<String> findUserById(int id){
        if(id > 0){
            return Optional.of("User " + id);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        findUserById(1);
        findUserById(2);

        findUserById(3).ifPresent(System.out::println);
        findUserById(0).ifPresentOrElse(System.out::println, () -> System.out.println("No user found"));
        //another way of doing the above
        System.out.println(findUserById(-1).orElse("Default user found"));

        // NOTE: This has to be ran before the exception because as soon as the exception is called the application would stop
        System.out.println(findUserById(1).map(n -> n.toUpperCase()).get());

        // I just used a runtimeException because cbf to make a new exception
        System.out.println(findUserById(-1).orElseThrow(RuntimeException::new));

    }
}
