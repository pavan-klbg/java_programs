package com.prac.in;

import java.util.Scanner;

public class Simple {
static double cal( int amt,float rate, int yr){
	return amt*rate*yr/100;
	//System.out.println(res);
	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("******** welcome to interest calculation ********");
		System.out.println("pls enter princi amt");
		 int amt=s.nextInt();
		 System.out.println("*** pls enter rate");
		 float rate=s.nextFloat();
		 System.out.println("*** enter yrs******");
		 int yr=s.nextInt();
		 System.out.println("----FINAL CALCULATION AS FOLLOWS---");
		System.out.println(cal(amt, rate, yr));
	}

}
