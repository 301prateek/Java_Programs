package com.bridge.prateek.java_assignment;
import java.util.Map;
import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"Dog");
		hm.put(2,"Cat");
		hm.put(3,"Bird");
		hm.put(3,"Crane"); //does not allow duplicates keys
		
		System.out.println(hm);
		
		String value1 = hm.get(1);
		System.out.println(value1);
		String value2 = hm.get(2);
		System.out.println(value2);
		String value3 = hm.get(3);
		System.out.println(value3);
	}
}
