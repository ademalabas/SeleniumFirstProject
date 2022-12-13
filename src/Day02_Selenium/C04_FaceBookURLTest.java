package Day02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FaceBookURLTest {

    public static void main(String[] args) {
        // Invoke Chrome Driver
// Navigate to Facebook homepage URL: https://www.facebook.com/
// Verify expected equals actual URL.
// Verify expected contains Facebook Word.




        //  Driver imizin yolunu javaya tanittik.
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        //Driver objemizi olusturuyoruz
        WebDriver driver = new ChromeDriver();

        //Facebook sayfamiza gidiyoruz
        driver.get("https://www.facebook.com/");
        // Url testi yaptik
        System.out.println("URL testi Yapiliyor");
        String expectedURL = "https://www.facebook.com/";
        String actualURL = "https://www.facebook.com/";

        if (expectedURL.equals(actualURL)){
            System.out.println("URL testi Passed");

        }else{
            System.out.println("URL testi failed");
        }

        //Title Testimizi Yaptik
        String title = driver.getTitle();
        if (title.contains("Facebook")) {
            System.out.println("Title test passed");
        }else System.out.println("Title test failed");

        // Driveri Kapattik
        driver.quit();

    }

}
