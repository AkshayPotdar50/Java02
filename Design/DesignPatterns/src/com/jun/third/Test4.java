package com.jun.third;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Example of default method in interface
interface MyInterface {
    default void myMethod() {
        System.out.println("Default method");
    }
}
class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod(); // Output: Default method
    }
}


public class Test4 {
    //below are the main features inroduced in java 8

    public static void main(String[] args) {

        // Example of using lambda to sort a list of strings
        List<String> strings = Arrays.asList("foo", "bar", "baz");
        strings.sort(String::compareTo);
        System.out.println(strings); // Output: [bar, baz, foo]


        // Example of using method reference to print elements of a list
        List<String> strings1 = Arrays.asList("foo", "bar", "baz");
        strings1.forEach(System.out::println); // Output: foo bar baz

        // Example of using Optional to handle null values
        String str = "hello";
        Optional<String> optionalStr = Optional.ofNullable(str);
        optionalStr.ifPresent(s -> System.out.println(s.toUpperCase())); // Output: HELLO

        // Example of using Date and Time API to get current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now); // Output: Current date and time: 2024-04-17T21:22:39.123




    }
}
