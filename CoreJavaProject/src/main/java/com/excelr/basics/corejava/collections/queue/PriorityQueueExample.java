package com.excelr.basics.corejava.collections.queue;
import java.util.Comparator;
import java.util.*;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");
        System.out.println("Queue Original: " + queue);

        String front = queue.poll();
        System.out.println("Front element: " + front);
        System.out.println("Queue now: " + queue);

        String peek = queue.peek();
        System.out.println("Front element (peek): " + peek);
        System.out.println("Queue now: " + queue);
    }
}
