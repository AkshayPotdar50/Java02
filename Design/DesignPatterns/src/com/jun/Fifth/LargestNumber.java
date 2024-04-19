package com.jun.Fifth;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        String[] arr1 ={"99", "21", "72", "78", "43"};

        System.out.println(formLargestNumber(arr1));
        System.out.println("************************************");

        String str="tenet";
        System.out.println(findFirstNonRpeating(str));

    }

    public static String formLargestNumber(String[] arr){
        Arrays.sort(arr,(num1, num2)->(num2+num1).compareTo(num1+num2));

        StringBuilder str = new StringBuilder();
        for(String s:arr){
            str.append(s);
        }
        return str.toString();
    }

    public static int findFirstNonRpeating(String str){
        for(int i=0; i<str.length(); i++){
            char c= str.charAt(i);
            if(str.indexOf(c) ==str.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
}
