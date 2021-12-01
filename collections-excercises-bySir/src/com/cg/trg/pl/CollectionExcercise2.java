package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Create a method getKeys() which receives Hashmap and a String,
 * returns array of strings.
 Ex. if following hashmap is passed to the method,
  Hashmap<String String>{"infy:hari","cisco:lakshmi","honeywell:hari","cts:venu"};
  and also the following String is passed to the method, "hari";

  then method returns {"infy","honeywell"}; 
 */
public class CollectionExcercise2 {

	public static void main(String[] args) {
		Map<String,String> map= new HashMap<>();
		map.put("infy","hari");
		map.put("cisco","lakshmi");
		map.put("honeywell","hari");
		map.put("cts","venu");
		String orgs[] = getKeys(map,"hari");
		for(String o : orgs) {
			System.out.println(o);
		}
	}

	public static String[] getKeys(Map<String,String> map,String name) {
		List<String> keyList=new ArrayList<>();
		for(Map.Entry<String,String> m: map.entrySet()) {
			if(m.getValue().equals(name)) {
				keyList.add(m.getKey());
			}
		}		
		//Convert List of Strings to String Array				
		return keyList.toArray(new String[keyList.size()]);

	} // op is infy, hari

}

