package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Lab6Excercise1 {

	public static void main(String[] args) {
		Map<Integer,Integer> myMap= new HashMap<>();
		myMap.put(1, 100);myMap.put(2, 90);
		myMap.put(3, 110);myMap.put(4, 50);

		List<Integer> myList= new ArrayList();
		List<Integer>mylist=getValues(myMap);
		Iterator<Integer> iterator= myList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static  List<Integer> getValues(Map<Integer, Integer> myMap) {

		List<Integer> myList= new ArrayList<>(myMap.values());
		Collections.sort(myList);
		return myList;

	}

}      /*op
50
90
100
110



*/
