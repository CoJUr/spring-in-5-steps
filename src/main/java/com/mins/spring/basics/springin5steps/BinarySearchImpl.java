package com.mins.spring.basics.springin5steps;

public class BinarySearchImpl {

    //sort the array, then search it, then return the res index     - understanding tight/loose coupling




    public int binarySearch(int[] numbers, int numberToSearchFor) {

        //implementing sorting logic - bubble sort is tightly coupled to the binary search implementation.
        // not great, may want to change to quick sort or something else sometime. start implementing algorithm outside class

        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
        int[] sortedNumbers= bubbleSort.sort(numbers);



        //return the index of the number in the array
        return 3;
    }


}
