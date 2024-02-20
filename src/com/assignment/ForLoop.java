package com.assignment;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		//print factorial number of 5*4*3*2*1=120
		
		//increment
		/*int factorial = 1;
		int num = 5;
		for(int i=1;i<=num;i++) 
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);*/
		
		//Decrement
		
		int factorial = 1;
		int num = 10;
		for(int i=num;i>=1;i--) 
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
	}

}
