package com.jun.Fourth;

import java.util.Arrays;

public class Singleton {

    private Singleton(){}

    private static volatile Singleton instance =null;

    public static Singleton Instance(){
        if(instance ==null){
            instance= new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        int a=15;
        a=a>>>3;
        System.out.println(a);
       Singleton obj1= Singleton.instance;
        Singleton obj2= Singleton.instance;
        System.out.println(obj1==obj2);
        System.out.println("**********************");
       // System.out.println(obj1.equals(obj2));

        //moving zeros in array

        int [] arr1 ={1, 0, 2, 0, 3, 0, 4, 0, 5, 0};
        moveZerosToStart(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("********************************");

        moveZerosToEnd(arr1);
        System.out.println(Arrays.toString(arr1));


    }

    private static void moveZerosToStart(int [] arr){
        int n=arr.length;
        int nonZeroElement=n-1;

        for(int i=n-1; i>=0; i--){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZeroElement];
                arr[nonZeroElement] =temp;
                nonZeroElement--;
                if(nonZeroElement <0){
                    break;
                }
            }
        }
    }

    private static void moveZerosToEnd(int[] arr){
        int n=arr.length;
        int ZeroElement=0;

        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[ZeroElement];
                arr[ZeroElement]=temp;
                ZeroElement++;
            }
        }
    }
}
