package com.jun.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

    public static void main(String[] args) {
        /*ArrayList is a dynamically resizable array-like data structure in Java.
        Internally, it uses an array to store elements. When you add elements to
        an ArrayList, it checks if the underlying array has enough capacity. If not,
         it creates a new array with larger capacity and copies the elements to it.
         This process is called resizing.

ArrayList allows random access to elements using their index, which is efficient because
 it directly accesses the underlying array. However, adding or removing elements at arbitrary
  positions can be inefficient because it may require shifting elements to maintain contiguous storage.

Overall, ArrayList provides flexibility in terms of adding, removing, and accessing
elements dynamically, but resizing operations can impact performance, especially for large collections.*/
        List<Integer> list1 = new ArrayList<>();
        /*

        Underlying Data Structure:
ArrayList uses a dynamic array to store elements. It provides fast random access but slower insertion and deletion in the middle of the list.
LinkedList uses a doubly linked list to store elements. It provides fast insertion and deletion at arbitrary positions but slower random access.
Access Time:
ArrayList provides O(1) time complexity for random access (get and set operations) because it directly accesses elements using their index.
LinkedList provides O(n) time complexity for random access because it has to traverse the list from the beginning or end to find the desired element.
Insertion/Deletion Time:
ArrayList provides slower insertion and deletion in the middle of the list (O(n)) because it may require shifting elements to maintain contiguous storage.
LinkedList provides faster insertion and deletion at arbitrary positions (O(1)) because it only requires updating the references of neighboring nodes.
Memory Overhead:
ArrayList generally has less memory overhead per element because it doesn't need additional pointers for linking nodes.
LinkedList has more memory overhead per element due to the extra pointers needed for linking nodes
         */

        List<Integer> list2 = new ArrayList<>();

        List<Integer> list= new Vector<>();
        



    }
}
