package belajar.java.lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Jaya");

        String name = null;

        sayHello(name);

    }

    public static void sayHello(String name){
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO ")
//                );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println("HELLO "+ value));

    }
}
