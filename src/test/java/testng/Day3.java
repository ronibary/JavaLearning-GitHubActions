package testng;

import org.testng.annotations.*;

public class Day3 {

    @BeforeSuite
    public void beforeSuiteExecution(){
        System.out.println("execution before all tests start (all tests folders) ... ");
    }


    @AfterSuite
    public void afterSuiteExecution(){
        System.out.println("execution after all tests finished (all tests folders) ... ");
    }

    @BeforeMethod
    public void beforeEachTest(){
        System.out.println("... -> before each test method ... ");
    }


    @AfterMethod
    public void afterEachTest(){
        System.out.println("... [after each test method] ... ");
    }

    @BeforeClass
    public void beforeClassExecution(){
        System.out.println("...  before executing any method in the class\n");
    }

    @AfterClass
    public void afterClassExecution(){
        System.out.println("...  after executing any method in the class\n");
    }


    @Parameters({"URL","APIKey/username"})
    @Test
    public void mobileRegistrationCarLoan(String siteUrl,String key)
    {
        // selenium
        System.out.println("start of mobileRegistrationCarLoan ...");
        System.out.println("car loan URL: " +  siteUrl);
        System.out.println("username APiKey: " +  key);
        System.out.println("Mobile login ...");
    }


    @Test(timeOut = 4000)                  // give 4sec timeout for the test
    public void mobileLoginCarLoan()
    {
        // selenium
        System.out.println("Mobile login ...");
    }

    @Test(groups={"Smoke"},enabled=false)      // the way to skip a test with false
    public void mobileSigninCarLoan()
    {
        // Appium
        System.out.println("Mobile Sign in ...");
    }

    //@Test
    @Test(dependsOnMethods={"mobileLoginCarLoan"},enabled=true)    // mobileLoginCarLoan will run first
    public void mobileAPICarLoan()
    {
        // rest api
        System.out.println("Mobile API car loan ...");
    }

    // example how to pass data set using data provider to Test method

    @Test(dataProvider = "getData")
    public void mobileSignoutCarLoan(String username, String password)
    {

        System.out.println("Mobile Sign out ...");
        System.out.println(username);
        System.out.println(password);
    }


    @DataProvider
    public Object[][] getData()
    {

        //1st combination - username password - good credit history
        //2nd - username password - no credit history
        //3nd - fraud credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "FirstSetUsername";
        data[0][1] = "password";

        //columns in the row are nothing but values for that particular combination(row)

        //2nd set
        data[1][0] = "SecondSetUsername";
        data[1][1] = "secondPassword";

        //3nd set
        data[2][0] = "ThirdSetUsername";
        data[2][1] = "thirdPassword";

        return data;
    }

}
