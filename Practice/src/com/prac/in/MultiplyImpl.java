package com.prac.in;

import java.util.ArrayList;
import java.util.List;

public class MultiplyImpl {
//static int x=4;
//public static void Sample(String s){
//	System.out.println("str");
//}
//public static void Sample(Object o){
//	System.out.println("obj");
//}
	
	public static void Test(Exception e)
	{
		System.out.println("excep");
	}
	
	public static void Test(ArithmeticException ae)
	{
		System.out.println("AE");
	}
	
	public static void Test(Object o)
	{
		System.out.println("obj");
	}

	public static void main(String[] args) {

		
//		Multiply m=(num1,num2)->{
//		return num1*num2;
//	};
//	System.out.println("value is "+m.mul(5, 6));
		
//		List<Integer> li=new ArrayList<>();
//		li.add(56);
//		li.add(45);
//		li.add(8);
//		li.add(69);
		
//		for(int x=5;x<10;x++){
//			x++;
//			System.out.println(x--);
//		}
		
//		int x=42;
//		double y=42.25;
//		System.out.println("x mod 10="+x%10);
//		System.out.println(y%10);
		
		Test(null);
		
	}
}

