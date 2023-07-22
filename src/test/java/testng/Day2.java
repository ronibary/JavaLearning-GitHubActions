package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @Test(groups={"Smoke"})
    public void myTestDemo1(){

        System.out.println("hello test demo 1 ...");
    }

    @BeforeTest
    public void prerequisite(){
        System.out.println("this will execute first ... ,");
    }

}
