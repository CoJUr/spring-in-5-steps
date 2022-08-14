package com.mins.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component //now marked as a bean and IOC container will manage it from creation to destruction
//@Scope("prototype") //singleton is default. prototype is for creating new instances every time. however, bad practice
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //do it this way instead of @Scope("prototype")
public class BinarySearchImpl {

    //sort the array, then search it, then return the res index     - understanding tight/loose coupling

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired //marking this as a dependency. technically setter injection as well
    @Qualifier("bubble") //qualifer takes precedence over @Primary
    private SortAlgorithm sortAlgorithm;

//    setter injection with constructor optional if using Autowired. rule of thumb: setter if "optional" dependency, constructor if not
//    public BinarySearchImpl(SortAlgorithm quickSortAlgorithm) {
//        this.quickSortAlgorithm = quickSortAlgorithm;
//    }
    public BinarySearchImpl() {}

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        //implementing sorting logic - bubble sort is tightly coupled to the binary search implementation.
        // not great, may want to change to quick sort or something else sometime. start implementing algorithm outside class

        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
//        int[] sortedNumbers= bubbleSort.sort(numbers);   CANCELED
//        want to be able to dynamically change the algorithm used to sort the array. How? quickSortAlgorithm dependency injection

        //have now separated the BinarySearchImpl from the quickSortAlgorithm.
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println(sortAlgorithm);


        //return the index of the number in the array
        return 3;
    }


    @PostConstruct //this method allows you to run code only after bean is created.
    public void postConstruct() {
//        will be called when dependencys are injected, before other methods. useful for initializing content of bean as soon as dependency is available
        logger.info("postConstruct");
    }

    @PreDestroy //just before bean is removed from context, this method is called. used to notify the instance is being removed by container
    public void preDestroy() {
        logger.info("preDestroy");
    }

}
