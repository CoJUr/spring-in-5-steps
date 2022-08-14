package com.mins.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component //now bubblesortalgorithm will have its component removed because spring only needs 1 SortAlgorithm bean for BinarySearchImpl
//or just use @Primary to make it the default one
@Component
@Primary     //with no @Primary annotation, spring will use the first bean it finds with right name ?
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {

        //implementing sorting logic for bubble sort

        //return numbers
        return numbers;
    }
}
