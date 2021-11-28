package org.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExambles {
	public static void main(String[] args) {

		Map<Integer,String> a = new HashMap();
		a.put(13, "agarwal");
		a.put(52, "gill");
		a.put(26, "pujara");
		a.put(35, "rahane");
		a.put(105, "iyer");
		a.put(50, "jadeja");

		int size = a.size();
		System.out.println(size);

		System.out.println("+++++++++++++++++++++++++++");

		String string = a.get(105);
		System.out.println(string);

		System.out.println("+++++++++++++++++++++++++++");

		boolean containsKey = a.containsKey(50);
		System.out.println(containsKey);

		System.out.println("+++++++++++++++++++++++++++");

		boolean containsValue = a.containsValue("gill");
		System.out.println(containsValue);

		System.out.println("+++++++++++++++++++++++++++");


		Set<Integer> keySet = a.keySet();
		System.out.println(keySet);

		System.out.println("+++++++++++++++++++++++++++");
		
		Collection<String> values = a.values();
		System.out.println(values);
		
		System.out.println("+++++++++++++++++++++++++++");

		Set<Entry<Integer, String>> entrySet = a.entrySet();

		for (Entry<Integer, String> y : entrySet) {
			System.out.println(y);
//			Integer key = y.getKey();
//			System.out.println(key);
//			String value = y.getValue();
//			System.out.println(value);




		}


	}







}
