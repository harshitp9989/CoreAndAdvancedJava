package com.excelr.basics.java8.stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class StreamOperationDemo {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(5,3,8,6,1,2,6,4,9,5,37);
	System.out.println("Original List: "+ numbers);
	
	System.out.println("\nINTERMEDIATE OPERATIONS: ");
	
	List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println("Even Numbers: "+ evenNumbers);
	
	List<String> sortedNumbers = numbers.stream().map(n->"Number: "+n).collect(Collectors.toList());
	System.out.println(sortedNumbers);
	
	
}
}
