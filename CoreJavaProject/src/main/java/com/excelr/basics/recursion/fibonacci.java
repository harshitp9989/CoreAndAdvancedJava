package com.excelr.basics.recursion;

public class fibonacci {

	int i = 0;

	public int fib(int n) {
		if (n == 0)
		{
			this.i = this.i + 1;
			return 1;
		}
		if (n == 1)
		{
			this.i = this.i + 1;
			return 1;
		}
		else {
			this.i = this.i + 1;
			return (fib(n - 1) + fib(n - 2));
		}
	}

	public static void main(String[] args) {
		fibonacci ff = new fibonacci();
		for(int k=1;k<15;k++)
		{
			System.out.print(ff.fib(k)+ " ");
			System.out.println(ff.i);
			ff.i=0;
		}	
	}
}
