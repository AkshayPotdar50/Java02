package com.algo.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InterviewProblems {
    public static void main(String[] args) {
        String sentence= "my name is abc";
        String reverseSentence=reverseWords(reverseWords(sentence));
        System.out.println(reverseSentence);

        System.out.println("///////////special character remove/////////");

        String input="my@nameis%abc!";
        String result =removeSpecialCharacter(input);
        System.out.println(result);
        System.out.println("*******************reverse string**********************");

        StringBuilder str =new StringBuilder(input);
        String s1=str.reverse().toString();
        System.out.println(s1);


    }
    public static String reverseWords(String sentense){
        return Arrays.stream(sentense.split(" "))
                .map(InterviewProblems::reverseString)
                .collect(Collectors.joining());

    }

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String removeSpecialCharacter(String input){
        String regrex="[^a-zA-Z0-9]";

        return input.replaceAll(regrex, " ");
    }

}
