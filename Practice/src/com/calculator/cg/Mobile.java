package com.calculator.cg;

public class Mobile {
static int count=0;
	
	Mobile(){
		count++;
	}
	public static void main(String[] args) {
Mobile obj=new Mobile();
Mobile obj2=new Mobile();
new Mobile();
new Mobile();
new Mobile();
System.out.println("number of objects created are "+Mobile.count);


	}

}
