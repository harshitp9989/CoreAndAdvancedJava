package com.excelr.basics.recursion;
public class MaxElementRecursive {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1,0};
        int max = findMaximum(array, 0);
        System.out.println("The maximum element in the array is: " + max);
    }

    static int findMaximum(int[] arr, int index) {
        // Base case: if the index is the last element in the array
        if (index == arr.length - 1) {
            return arr[index];
        }
        System.out.println(index); 
        // Recursive case: find the maximum element in the rest of the array
        int maxInRest = findMaximum(arr, index + 1);
        System.out.print("hello ");
        System.out.print(maxInRest+" ");
        System.out.println(arr[index]);
        // Compare the maximum in the rest with the current element
        return Math.max(maxInRest, arr[index]);
    }
}
