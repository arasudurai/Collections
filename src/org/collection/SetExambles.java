package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
 
public class SetExambles {

	public static void main(String[] args) {

		Set a = new HashSet();
		Set b = new LinkedHashSet();

		a.add(50);
		a.add(9952396590L);
		a.add(007);
		a.add("java");
		a.add(50);
		a.add('A');

		b.add("java selenium");

		int size = a.size();
		System.out.println(size);

		System.out.println("===================");


		b.addAll(a);
		System.out.println(b);

		System.out.println("===================");

		b.retainAll(a);
		System.out.println(b);

		System.out.println("===================");

		b.removeAll(a);
		System.out.println(b);

		System.out.println("===================");

		for (Object x : a) {
			System.out.println(x);

		}


	}



}
