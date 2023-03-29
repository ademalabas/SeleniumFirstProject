package Day02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class C05_PageSourceTest {
    public static void main(String[] args) {

        // Go to the Amazon URL: https://www.amazon.com/
        // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.


        //  Driver imizin yolunu javaya tanittik.
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        //Driver objemizi olusturuyoruz
        WebDriver driver = new ChromeDriver();


        //amazon sayfamiza gidiyoruz
        driver.get("https://www.amazon.com/");
        // page sorcu aldik
        String pageSource = driver.getPageSource();
        // page source testimizi yaptik
        System.out.println("Page test source testi yapiliyor");
      //  System.out.println("driver.getPageSource() = " + driver.getPageSource());
        if (pageSource.contains("Performance Matrics") && pageSource.contains("MEOW")){
            System.out.println("test passed");
        }else System.out.println("test failed");


        // driverimizi kapattik
       // driver.quit();



    }


}
