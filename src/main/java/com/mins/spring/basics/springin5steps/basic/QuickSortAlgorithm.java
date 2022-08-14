package com.mins.spring.basics.springin5steps.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component //now bubblesortalgorithm will have its component removed because spring only needs 1 SortAlgorithm bean for BinarySearchImpl
//taking away all @components makes the app fail to run because it needed a SortAlgorithm bean
@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {

        //implement logic for quick sort

        //return numbers
        return numbers;
    }
}
