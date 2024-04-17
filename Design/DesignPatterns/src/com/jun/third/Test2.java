package com.jun.third;

import java.util.Arrays;

public class Test2 {
    public Test2() {
    }

    public static void main(String[] args) {
        String str = "akshay";
        String str2 = "ashish";
        System.out.println(checkAnagram(str, str2));
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.replaceAll("//s", "");
        str2 = str2.replaceAll("//s", "");
        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
    }

    public static boolean checkPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}