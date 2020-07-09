package com.qa.HashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("F"); // this will overwite the previous "F", as duplicate values are not permitted

		System.out.println(hashSet.isEmpty()); // boolean : check its empty or not

		// Use size() to check the size
		if (hashSet.size() == 0) {
			System.out.println("HashSet is empty");
		} else {
			System.out.println(hashSet.size());
		}

		hashSet.remove("A");

		Iterator<String> setIterator = hashSet.iterator();
		while (setIterator.hasNext()) {
			String obj = setIterator.next();
			setIterator.remove();

			System.out.println(hashSet);
		}

	}
}
