package com.jun.second;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class SerializationExample {
    public static void main(String[] args) {
        Employee emp= new Employee("akshay", 27);
        try{
            FileOutputStream fileout = new FileOutputStream("C://Users//potda//Desktop//desktop icons//out.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(emp);
            out.close();
            fileout.close();
            System.out.println("employee object serialized successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
