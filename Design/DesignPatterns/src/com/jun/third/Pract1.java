package com.jun.third;

import java.util.Arrays;

public class Pract1 {
    public static void main(String[] args) {

        String [] arr1 ={"9", "2", "7", "7", "4"};
        System.out.println(formLargestNumber(arr1));
        System.out.println("*****************************");
        System.out.println(formSmallestNumber(arr1));
        System.out.println("***********************************");

        String s="akshay";
        System.out.println(firstNonrepeating(s));

    }

    //form the largest number and smallest number using array

    public static String formLargestNumber(String[] arr){
        Arrays.sort(arr, (num1, num2)->(num2 +num1).compareTo(num1+num2));
        StringBuilder str1= new StringBuilder();
        for(String s:arr){
            str1.append(s);
        }
        return str1.toString();
    }

    public static String formSmallestNumber(String [] arr){
        Arrays.sort(arr, (num1, num2)->(num1+num2).compareTo(num2+num1));
        StringBuilder str1 = new StringBuilder();
        for(String s:arr){
            str1.append(s);
        }
        return str1.toString();
    }

    //find first non repeating character in string
    public static int firstNonrepeating(String s){
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }

        }
        return -1;
    }
}

/*
*
* for making your class singleton in java we follow below steps
 * @Service
 * public class SingleToneService{
 *
 * 1.the instance should be private
 * private static SingleToneService instance;
 *
 * 2.private constructor to prevent instantiation
 * private SingleToneService(){
 * initialize the code if needed
 * }
 *
 * 3.method to get singleTon Instance
 * public static synchronized SingleToneService getInstance(){
 * if(instance ==null){
 * instance= new SingleToneService();
 * }
 * return instance;
 * }
 *
 * BUSINESS LOGIC HERE
 * public void doSomething(){
 * System.Out.Println("SingletonService is doing something");
 * }
 * }*/
