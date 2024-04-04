package com.excelr.basics.sortingMethods;

public class binarySort {

	public static void main(String[] args) {
		int[] sortedArray = {1,3,4,55,67,88,90,123,1234,4566,8888};
		int target = 4;
		int result = binarySearch(sortedArray, target);
		System.out.println("Hello");
		if( result == -1)
		{
			System.out.println("Theres no such element");
		}
		else
		{
			System.out.println("The element is present at index: "+ result);
		}
	}
	
	public static int binarySearch(int[] arr, int target)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				high = mid;
			}
			else
			{
				low = mid;			
			}
		}
		return(-1);	
	}
}
