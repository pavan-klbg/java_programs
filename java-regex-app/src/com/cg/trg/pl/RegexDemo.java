package com.cg.trg.pl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Pattern pattern1= Pattern.compile("\\d+");
		String admissionNumber="12348790";
		Matcher matcher1= pattern1.matcher(admissionNumber);
		System.out.println(matcher1.matches());	
				
		//alternate way
		System.out.println(Pattern.matches("\\d+", admissionNumber));

		String input = "Shop,Mop,hopping,Chopping";
		Pattern pattern2= Pattern.compile("hop");
		Matcher matcher2= pattern2.matcher(input);
		while(matcher2.find()) {
			System.out.println(matcher2.group()+":"+matcher2.start()+":"+matcher2.end());
		}


		String input1 = "E12"; 
		//Checks for string that start with upper case alphabet and end with digit. 
		Pattern p = Pattern.compile("^[A-Z][0-9]$");
				Matcher m = p.matcher(input1); 
		if (!m.find()) {
			System.err.println("Enter  code which  start with upper case alphabet and end with a digit");
		}else {
			System.out.println("Matches");
		}

	}

}
