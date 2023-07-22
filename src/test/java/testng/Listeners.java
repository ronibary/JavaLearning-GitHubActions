package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
ITestListener interface implements testng listeners
 */
public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {


    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("I successfully run the test ...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // take screenshot code
        // response if API failed

        System.out.println("The test was failed : test name: " + result.getName() + "  \n ");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
