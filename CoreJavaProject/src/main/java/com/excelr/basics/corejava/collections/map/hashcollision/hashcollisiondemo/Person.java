package com.excelr.basics.corejava.collections.map.hashcollision.hashcollisiondemo;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String first, String lastName) {
        this.firstName = first;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        // Example of a simple hash code calculation based on firstName and lastName
        return 1;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ram", "Lakshman");
        Person person2 = new Person("Ram", "Laxman");

        System.out.println("Hash code of person 1: " + person1.hashCode());
        System.out.println("Hash code of person 2: " + person2.hashCode());
    }
}
