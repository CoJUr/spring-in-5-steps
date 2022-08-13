package com.mins.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl();
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//works bc SortAlgorithm is a dependency of BinarySearchImpl
//		is there a way to avoid needing to create a new instance of SortAlgorithm and BinarySearchImpl?

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);

//		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}


}
