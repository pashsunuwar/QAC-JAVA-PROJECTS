package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Runner {
	public static void main(String [] args ) {
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
				names.stream()
				.filter(str -> !str.contains("Dean"))
				.collect(Collectors.toList())
				.forEach(x-> System.out.println("Hello " + x));
	
//		System.out.println(---------------);
				
		List<Integer> num = Arrays.asList(3,4,7,8,12);
		int multiply =
				num.stream()
				.reduce((a,b) -> a*b)
				.get();
		System.out.println(multiply);
		
//		System.out.println(------------------------);
		
		List<Integer> nums = Arrays.asList(4,234,21,21,34,3);
		int maxmin = nums.stream()
				.sorted()
				.collect(Collectors.toList())
//				.get(0);	//min
				.get(nums.size()-1); //max
		System.out.println(maxmin);
	
		List<Integer> even = nums.stream()
				.map(s -> Integer.valueOf(s))
//				.filter(x -> x % 2 == 0) //prints even numbers
				.filter(x -> x % 2 == 1) //prints odd numbers
				.collect(Collectors.toList());
		System.out.println(even);
		
		int sum =
				nums.stream()
				.reduce((a,b) -> a+b)
				.get();
		System.out.println(sum);
		
		List<Integer> square = 
				nums.stream()
				.map(x -> x*x)
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
				
		System.out.println(square);
		
		
//		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
//		System.out.println("Original list" + numbers);
//		
//		List<Integer> even = numbers.stream()
//				//gets the integer value from the string
//				.map(s ->Integer.valueOf(s))
//				//checking if its even
//				.filter(number -> number % 2 ==0)
//				//filer(number -> number %2 == 1) // odd numbers
//				.collect(Collectors.toList());
//				//collects results in to list call even
//		
//		System.out.println(even);
	}

}
