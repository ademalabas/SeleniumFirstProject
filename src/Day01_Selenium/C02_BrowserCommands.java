package Day01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
    /*
     Create main method
 Set Path
 Create chrome driver
 Open google home page: https://www.google.com
 Get Title on page
 Get Current URL on page
 Close/Quit the browser
     */
    public static void main(String[] args) {
        //1. adim Crome pathini belirledik
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");
        // 2. adim driver bjesini nolusturduk
        WebDriver driver=new ChromeDriver();

        //3. adim
        driver.get("https://www.google.com/");//
        String pageTitle= driver.getTitle();
        String currentURL =driver.getCurrentUrl();

        System.out.println("pageTitle = " + pageTitle);
        System.out.println("currentURL = " + currentURL);

        driver.quit();
    }



}
