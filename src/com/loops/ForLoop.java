package com.loops;

public class ForLoop 
{

	public static void main(String[] args)
	{
		Number n = new Number ();
		 n.generateNumbers(15);
	}

}

class Number
{
	public void generateNumbers(int num) 
	{
		//i is a Iterator
		for(int i = 1; i<= num; i++) 
		{
			System.out.println(i);
		}
		
	}
	
	
}










