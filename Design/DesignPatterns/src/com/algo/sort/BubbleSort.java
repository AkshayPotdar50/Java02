package com.algo.sort;

public class BubbleSort {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("***********BUBBLE SORT***************");
        int arr[] ={7, 8, 1, 2, 4, 3};

        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] >arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        printArray(arr);

        System.out.println("*********SELECTION SORT******************");

        for(int i=0; i<arr.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] <arr[smallest]){
                    smallest =j;
                }
            }
            //swapping
            int temp =arr[smallest];
            arr[smallest] =arr[i];
            arr[i] =temp;
        }
        printArray(arr);

        System.out.println("**************insertion sort**************");

        for(int i=1; i<arr.length; i++){
            int current =arr[i];
            int j= i-1;
            while(j >=0 && arr[j]>current){
                //keep swapping
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
