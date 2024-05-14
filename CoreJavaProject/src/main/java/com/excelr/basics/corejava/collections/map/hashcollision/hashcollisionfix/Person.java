package com.excelr.basics.corejava.collections.map.hashcollision.hashcollisionfix;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        // Example of a simple hash code calculation based on firstName and lastName
    	int hash = 17;
        hash = 31 * hash + firstName.hashCode();
        hash = 31 * hash + lastName.hashCode();
        return hash;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ram", "Lakshman");
        Person person2 = new Person("Ram", "Laxman");

        System.out.println("Hash code of person 1: " + person1.hashCode());
        System.out.println("Hash code of person 2: " + person2.hashCode());
    }
}
