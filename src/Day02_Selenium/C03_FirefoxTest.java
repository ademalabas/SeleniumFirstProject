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

        //Driver objemizi olusturuyoruz
        WebDriver driver = new FirefoxDriver();


        //https://www.youtube.com/ adresini ziyaret ettik
        driver.get("https://www.youtube.com/");
        System.out.println("Title testi yapiliyor");
        String pageTitle = driver.getTitle();


        if (pageTitle.contains("You")) {
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }


        //driver objemizi kapattik
        driver.quit();








    }
}
