package com.mins.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //now marked as a bean
public class BinarySearchImpl {

    //sort the array, then search it, then return the res index     - understanding tight/loose coupling

    @Autowired //marking this as a dependency. technically setter injection as well
    private SortAlgorithm sortAlgorithm;

//    setter injection with constructor optional if use Autowired. rule of thumb: setter if "optional" dependency, constructor if not
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public BinarySearchImpl() {}

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        //implementing sorting logic - bubble sort is tightly coupled to the binary search implementation.
        // not great, may want to change to quick sort or something else sometime. start implementing algorithm outside class

        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
//        int[] sortedNumbers= bubbleSort.sort(numbers);   CANCELED
//        want to be able to dynamically change the algorithm used to sort the array. How? SortAlgorithm dependency injection
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        //have now separated the BinarySearchImpl from the SortAlgorithm.

        System.out.println(sortAlgorithm);


        //return the index of the number in the array
        return 3;
    }


}
