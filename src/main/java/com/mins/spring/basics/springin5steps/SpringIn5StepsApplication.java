package com.mins.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl();
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); spring does this automatically now

		//works bc SortAlgorithm is a dependency of BinarySearchImpl
//		is there a way to avoid needing to create a new instance of SortAlgorithm and BinarySearchImpl? yes; Spring


//		spring Application Context will maintain all beans. get beans from context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); //get bean from context, assign local var
		//picked up bean from context, not new instance of BinarySearchImpl

//		use the bean to execute the binary search
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);

//spring now managing the lifecycle of beans.


	}


}
