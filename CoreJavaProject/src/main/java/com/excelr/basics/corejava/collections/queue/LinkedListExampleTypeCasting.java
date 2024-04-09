package com.excelr.basics.corejava.collections.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExampleTypeCasting {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        
        System.out.println("Linked List: " + list1);
        
        // Peeking at the front element
        System.out.println(list1.getClass().getName());
        String peek = ((Queue<String>) list1).peek();
        System.out.println("Front element (peek): " + peek);
        
        System.out.println("Linked List after peek: " + list1);

        // Polling the front element
        String front = ((LinkedList<String>) list1).poll();
        System.out.println("Front element (poll): " + front);
        
        System.out.println("Linked List after poll: " + list1);
    }
}
