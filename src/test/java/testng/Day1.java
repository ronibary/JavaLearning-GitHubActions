package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {


    @AfterTest
    public void lastExecution(){
        System.out.println("I will execute last ...");
    }

    @Test
    public void Demo(){

        System.out.println("hello");

        // fail the test in purpose
        // Assert.assertTrue(false);
    }

    @Test
    public void SecondTest(){
        System.out.println("bye");
    }


}
