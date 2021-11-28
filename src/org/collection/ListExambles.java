package org.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExambles {
	public static void main(String[] args) {

		List a = new ArrayList();
		List b = new LinkedList();
		b.add("java selenium");

		a.add(50);
		a.add(9952396590L);
		a.add(007);
		a.add("java");
		a.add(50);
		a.add('A');


		int size = a.size();
		System.out.println(size);
		System.out.println("********************");

		boolean contains = a.contains("java");
		System.out.println(contains); 
		System.out.println("********************");

		a.set(1, "selenium");
		System.out.println(a);
		System.out.println("********************");

		int indexOf = a.indexOf(50);
		System.out.println(indexOf);
		System.out.println("********************");

		int lastIndexOf = a.lastIndexOf(50);
		System.out.println(lastIndexOf);
		System.out.println("********************");


		a.add(2, "Testng");
		System.out.println("********************");

		a.remove(3);
		System.out.println(a);
		System.out.println("********************");

		b.addAll(a);
		System.out.println(b);
		System.out.println("********************");

		b.retainAll(a);
		System.out.println(b);
		System.out.println("********************");

		for (Object x : a) {
			System.out.println(x);

		}
		System.out.println("********************");

		for (int i = 0; i < b.size(); i++) {
			Object object = b.get(i);
			System.out.println(object);

		}
		System.out.println("********************");


		b.removeAll(a);
		System.out.println(b);


	}}
