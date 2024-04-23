package com.jun.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Java81 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("hello", "world", "stream", "api", "practice");

        String[] result = IntStream.range(0, words.size())
                .mapToObj(i -> i % 2 == 0 ? words.get(i).toUpperCase() : words.get(i))
                .toList().toArray(new String[0]);
        System.out.println(Arrays.toString(result));
    }

    //pair finding programme using flatmap

    public static int maxPairs(List<Integer> rating, int minDiff){
        return (int) (rating.stream()
                        .sorted()
                        .flatMap((i)->rating.stream().map((j)->new int[]{i,j})).filter((pair)->Math.abs(pair[0]-pair[1]) >=minDiff).count()/2);
    }

    public static int minPairs(List<Integer> rating, int minDiff){
        return (int) (rating.stream().sorted().flatMap((i)->rating.stream().map((j)->new int[]{i, j})).filter((pair)->Math.abs(pair[0]-pair[1]) <=minDiff).count()/2);
    }

    public static boolean checkAnagram(String str1, String str2){
        str1=str1.replaceAll("//s", " ");
        str2=str2.replaceAll("//s", " ");

        return Arrays.equals(str1.chars().toArray(), str2.chars().toArray());

    }

    public static boolean checkPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) !=str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }
}
