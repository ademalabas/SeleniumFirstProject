package Day02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_FirefoxTest {
    public static void main(String[] args) {
//        Invoke FireFox Driver
//        Go to https://www.youtube.com/
//        Verify the page title contains the word video.
//        Close the driver.

        System.setProperty("webdriver.gecko.driver", "Dependencies/drivers/geckodriver.exe");


        WebDriver driver = new FirefoxDriver();




    }
}
