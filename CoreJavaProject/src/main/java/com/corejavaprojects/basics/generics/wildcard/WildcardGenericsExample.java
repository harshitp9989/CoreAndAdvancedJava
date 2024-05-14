package com.corejavaprojects.basics.generics.wildcard;

import java.util.List; // Add import statement for List

public class WildcardGenericsExample {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Java");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        printList(strings);
        printList(numbers);
    }
}
