package com.jun.Fourth;

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
    }
}
