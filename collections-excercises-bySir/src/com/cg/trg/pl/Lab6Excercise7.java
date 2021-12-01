package com.cg.trg.pl;

import java.util.Arrays;

public class Lab6Excercise7 {

	public static void main(String[] args) {
		int [] list= {123,567,324,451};
		
		int sortedList [] = getSorted(list);
		
		for(int i=0;i<sortedList.length;i++) {
			System.out.println(sortedList[i]);
		}

	}

	private static int[] getSorted(int[] list) {
		int temp[]= new int[list.length];
		for(int i=0; i<list.length;i++) {
		 StringBuffer sb= 
				 new StringBuffer(new Integer(list[i]).toString()).reverse();
		 temp[i]= Integer.parseInt(sb.toString());
		}
		Arrays.sort(temp);
		return temp;
	}

}// op: 321,765,423,154 ...in ascending.