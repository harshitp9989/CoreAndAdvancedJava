package com.excelr.basics.java8.methodreferences;

class SampleClass {

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void nonStaticMethod() {
        System.out.println("NonStaticMethod");
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        Runnable staticMethodReference = SampleClass::staticMethod;
        staticMethodReference.run();

        SampleClass sampleInstance = new SampleClass(); // Corrected instantiation

        Runnable nonStaticMethodReference1 = sampleInstance::nonStaticMethod;
        nonStaticMethodReference1.run();

        Runnable nonStaticMethodReference2 = sampleInstance::nonStaticMethod; // Simplified method reference
        nonStaticMethodReference2.run();

        System.out.println("Main");
    }
}
