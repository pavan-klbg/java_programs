package com.prac.in;

public class ArrayDouble {

	public static void main(String[] args) {
		int ar1[]={34,23,45,21};
		int ar2[]={34,20,12,21};
		int temp[]=new int[5];
		int i,j;


		System.out.println("begins");

		for( i=0;i<ar1.length;i++){
			for( j=i;j<ar2.length;j++){
				if(ar1[i]==ar2[j]){
					temp[i]=ar2[j];
					System.out.println(ar2[j]);
				}

			}

		}

	}


}