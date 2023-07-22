package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @Test
    public void webLoginHomeLoan()
    {
        // selenium
        System.out.println("WebLoginHome ...");
    }

    @Parameters({"URL"})
    @Test
    public void webLogoutHomeLoan(String siteUrl)
    {
        // Appium

        System.out.println("personal loan URL: " +  siteUrl);
        System.out.println("First run ... WEB Logout Home loan ...");
    }

    @Test(groups={"Smoke"})
    public void loginAPIHomeLoan()
    {
        // rest api
        System.out.println("APILoginHome ...");
    }


}
