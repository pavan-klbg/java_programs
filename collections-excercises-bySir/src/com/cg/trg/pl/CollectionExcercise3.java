package com.cg.trg.pl;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a method, getEmployeeByCompany() which receives string array contains
 *  email id's of the employees working in different organizations. 
 *  The method has to return hashmap where keys are
organization name and values are no. of employees in each organization.
Hint: domain name contains organization name.

 */
public class CollectionExcercise3 {

	public static void main(String[] args) {
		String emails[]= {"ravi@capgemini.com","venu@capgemini.com",
							"ravik@cts.com","madhavi@cts.com",
							"madhu@ibm.com","vani@google.com",
							"akash@capgemini.com"
						};
		
		Map<String,Integer> map= getEmployeesByCompany(emails);
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}

	}

	private static Map<String, Integer> getEmployeesByCompany(String[] emails) {
		Map<String,Integer> map= new HashMap<>();
		for(String e : emails) {
			String domainName= e.split("@")[1].split("\\.")[0];
			System.out.println(domainName);
			if(map.containsKey(domainName)) {
				map.put(domainName, map.get(domainName)+1);
			}else {
				map.put(domainName, 1);
			}
		}
		return map;
	}  //op: capgemini
	/*capgemini
	cts
	cts
	ibm
	google
	capgemini
	cts:2
	ibm:1
	google:1
	capgemini:3*/

}
