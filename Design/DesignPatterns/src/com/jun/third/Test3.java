package com.jun.third;

public class Test3 {
    /*
    * Single Responsibility Principle (SRP):
This principle states that a class should have only one reason to change, meaning that it should have only one job or responsibility.
The idea is to keep each class focused on doing one thing well, which makes it easier to understand, maintain, and extend.
When a class has multiple responsibilities, changes to one responsibility may inadvertently affect the others, leading to unexpected behavior or bugs.

* Open-Closed Principle (OCP):
This principle states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
In other words, you should be able to extend the behavior of a module without modifying its source code.
This is typically achieved by using abstraction and inheritance, allowing new functionality to be added through the creation of new classes that inherit from existing ones, rather than modifying existing code.

* Liskov Substitution Principle (LSP):
Named after Barbara Liskov, this principle states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
In other words, a subclass should be able to substitute for its superclass without changing the behavior expected by clients of the superclass.
This principle ensures that inheritance is used correctly and that derived classes adhere to the contracts established by their base classes.

* Interface Segregation Principle (ISP):
This principle states that clients should not be forced to depend on interfaces they don't use.
It emphasizes the importance of designing fine-grained, cohesive interfaces rather than large, monolithic ones.
By separating interfaces into smaller, more specific ones, you can minimize the impact of changes and reduce the likelihood of introducing dependencies on unrelated functionality.

* Dependency Inversion Principle (DIP):
This principle states that high-level modules should not depend on low-level modules; both should depend on abstractions.
Abstractions should not depend on details; details should depend on abstractions.
By relying on abstractions rather than concrete implementations, you can decouple modules from each other, making the system more flexible and easier to maintain.
    *
    * */

    /*
    * Linked List: Initially, when elements are added to the HashMap, collision resolution is handled by chaining, where
    * elements with the same hash code are stored in a linked list within the same bucket. This means that multiple key-value
    *  pairs with different keys but the same hash code can exist in the same bucket, forming a linked list.
Red-Black Tree: As the number of elements in a bucket grows beyond a certain threshold (typically 8 in Java 8), the linked
*  list is converted into a balanced tree (specifically, a red-black tree) for performance reasons. This is done to ensure
*  that the worst-case time complexity for lookups remains O(log n) rather than O(n) for linked lists.*/

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={7, 8, 1, 2, 3};
        for(int i=0; i<arr.length-1;i++){
            int smallest =i;
            {
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]<arr[smallest]){
                        smallest=j;
                    }
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);

    }
}
