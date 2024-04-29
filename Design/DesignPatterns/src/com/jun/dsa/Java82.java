package com.jun.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
* stream()
* filter()
* map()
* collect()
* count()
* sorted()
* sorted(comparator)
* max() & min()
* forEach()
* toArray()
* Stream.of()
* */

public class Java82 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(21, 22, 54, 78, 45, 56, 89);
        List<Integer> list2 = list1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list2);

        List<String> list =Arrays.asList("apple", "banana", "cherry" );
        List<String> list3 =list.stream().toList();
        System.out.println(list3);

        List<String> list4 =list.stream().filter(fruit->fruit.endsWith("e")).toList();
        System.out.println(list4);

        List<String> list5 =list.stream().map(String::toUpperCase).toList();
        System.out.println(list5);

        List<String> list6 =list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list6);

        List<String> list7 =list.stream().min(Comparator.naturalOrder()).stream().toList();
        System.out.println(list7);

    }




}


class CombinedExample {
        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("apple", "banana", "cherry", "orange", "grape");

            // Filtering fruits starting with 'a' and 'b', then mapping to uppercase, sorting, and collecting to list
            List<String> filteredAndMapped = fruits.stream()
                    .filter(fruit -> fruit.startsWith("a") || fruit.startsWith("b"))
                    .map(String::toUpperCase)
                    .sorted(Comparator.reverseOrder())
                    .toList();
            System.out.println("Filtered, Mapped, Sorted: " + filteredAndMapped);

            // Counting the fruits starting with 'c'
            long count = fruits.stream()
                    .filter(fruit -> fruit.startsWith("c"))
                    .count();
            System.out.println("Count of fruits starting with 'c': " + count);

            // Finding the maximum and minimum length of the fruits
            Optional<Integer> maxLength = fruits.stream()
                    .map(String::length)
                    .max(Integer::compareTo);
            Optional<Integer> minLength = fruits.stream()
                    .map(String::length)
                    .min(Integer::compareTo);
            maxLength.ifPresent(m -> System.out.println("Max length: " + m));
            minLength.ifPresent(m -> System.out.println("Min length: " + m));

            // Printing the fruits using forEach
            System.out.print("Printing fruits: ");
            fruits
                    .forEach(fruit -> System.out.print(fruit + " "));
            System.out.println();

            // Converting the fruits to an array
            String[] fruitArray = fruits.toArray(String[]::new);
            System.out.println("Fruits as array: " + Arrays.toString(fruitArray));

            // Creating a stream of additional fruits and concatenating with the existing list
            Stream<String> additionalFruits = Stream.of("kiwi", "pineapple");
            List<String> combinedList = Stream.concat(fruits.stream(), additionalFruits)
                    .toList();
            System.out.println("Combined list: " + combinedList);
        }
    }


