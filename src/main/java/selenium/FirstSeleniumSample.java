package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class FirstSeleniumSample {

    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        //WebDriver driver = WebDriverManager.edgedriver().create();
        //WebDriver driver = WebDriverManager.firefoxdriver().create();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}
