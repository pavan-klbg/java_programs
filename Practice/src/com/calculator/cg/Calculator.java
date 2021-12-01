package com.calculator.cg;

public class Calculator {
	
	private int x,y,res;
	
	public Calculator(int number1, int number2) {
		x = number1;
		y = number2;
	}
	 
	void add(){
		System.out.println(res=x+y);
		
	}
	void  sub(){
	System.out.println(res=x-y);
	}
	void mul(){
		 System.out.println(res=x*y);
		
	}
	
	void div(){
		res=x/y;
		System.out.println("division "+res);
	}
}
