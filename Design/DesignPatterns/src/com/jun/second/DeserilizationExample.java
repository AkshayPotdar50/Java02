package com.jun.second;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExample {
    public static void main(String[] args) {
        try{
            FileInputStream filein = new FileInputStream("C://Users//potda//Desktop//desktop icons//out.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            Employee emp = (Employee)in.readObject();
            in.close();
            filein.close();
            System.out.println("employee object deserialized successfully");
            System.out.println("name "+emp.getName());
            System.out.println("age "+emp.getAge());
        }catch (IOException |ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
