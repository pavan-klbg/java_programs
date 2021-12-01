package com.cg.trg.pl;

import java.util.HashMap;
import java.util.Map;

public class Lab6Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'s','s','a','d','a'};
		Map<Character,Integer> map = countChars(c);
		
		for (Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public static Map<Character,Integer> countChars(char[] arr)
	{
		Map<Character,Integer> map = new HashMap<>();
		for (char a : arr) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}
			else {
				map.put(a, 1);
			}
		}
		return map;
	} // outp: s2,a2,d1;
}