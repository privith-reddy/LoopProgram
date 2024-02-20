package com.swapping;



public class SampleOne 
{

	public static void main(String[] args) 
	{
        
		//with temp variable
		int x = 10;
		int y = 20;
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println(x);
		System.out.println(y);
	  
		
		//with out temp variable
		int p = 10;
		int q = 20;
		p = p+q;
		q = p-q;
		p = p-q;
		System.out.println(p);
		System.out.println(q);
		

       
	}

}
