package com.jun.third;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {


    public static void main(String[] args) {
        String inputString = "Hello, World";
        StringBuilder stringBuilder = new StringBuilder(inputString);
        Map<String, Integer> map = new HashMap<>();
        map.put("first", stringBuilder.indexOf("o"));
        map.put("last", stringBuilder.lastIndexOf("o"));
        System.out.println(map);
        System.out.println("*******************************************");

        String input4 = "Hello World 123";
        long vowelCount = input4.chars()
                .mapToObj((ch) -> (char)ch).map(Character::toLowerCase)
                .filter((ch) -> "aeiou".contains(String.valueOf(ch)))
                .count();
        System.out.println("number of voewl:" + vowelCount);

        long consonantCount = input4.chars()
                .mapToObj((ch) -> (char)ch)
                .map(Character::toLowerCase)
                .filter((ch) -> Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch)))
                .count();
        System.out.println("number of consonant:" + consonantCount);

        long digitCount = input4
                .chars().mapToObj((ch) -> (char)ch)
                .filter(Character::isDigit).count();
        System.out.println("number of digit:" + digitCount);

        long whiteSpaceCount = input4
                .chars().mapToObj((ch) -> (char)ch)
                .filter(Character::isWhitespace)
                .count();
        System.out.println("number of whiteSpace:" + whiteSpaceCount);
        System.out.println("***************************************************");

        String strip1 = "Hello have a good day";
        String result1 = removeConsonant(strip1);
        System.out.println(result1);
        System.out.println("********************************************");

        Map<Character, Long> characterCount = strip1
                .chars()
                .mapToObj((ch) -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        characterCount.forEach((character, count) -> {
            if (count > 1L) {
                System.out.println("character" + character + "count" + count);
            }

        });
        System.out.println("*****************************************************");
        String s1 = "akshay";
        String s2 = "ashok";
        char[] s11 = s1.toCharArray();
        char[] s12 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s12);
        System.out.println(Arrays.equals(s11, s12));
        System.out.println("***********************************************");
        String str4 = "123456";
        System.out.println(str4.matches("[0-9]+"));
        System.out.println("*********************************************************");
        int numeric = Integer.parseInt(str4);
        System.out.println(numeric);
    }

    public static String removeConsonant(String input) {
        return input.toLowerCase().replaceAll("[^aeiou\\s]", " ");
    }
}


