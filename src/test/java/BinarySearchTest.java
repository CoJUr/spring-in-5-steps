

import com.mins.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.mins.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//above, run the context with @RunWith
//load the context
@ContextConfiguration(classes= SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

    //get this bean from the context, can use autowired after loading the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        //launch entire application context, get binarysearchimpl from context
        //call method on binarySearch, check if value is correct
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(3, actualResult);
        //check if value is correct, we hardcoded it to return 3

    }
}
