package com.jun.second;

import java.io.*;

class Employee1 implements Externalizable {
    private String name;
    private int age;

    public Employee1() {
        // Required for Externalizable
    }

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ExternalizationExample {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("John Doe", 30);

        try {
            FileOutputStream fileOut = new FileOutputStream("C://Users//potda//Desktop//desktop icons//out.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            emp.writeExternal(out);
            out.close();
            fileOut.close();
            System.out.println("Employee object externally serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream("C://Users//potda//Desktop//desktop icons//out.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee1 emp2 = new Employee1();
            emp2.readExternal(in);
            in.close();
            fileIn.close();
            System.out.println("Employee object externally deserialized successfully.");
            System.out.println("Name: " + emp2.getName());
            System.out.println("Age: " + emp2.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

