package Day01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {

    /*
    Invoke Chrome Browser
Navigate to URL: https://clarusway.com/
Navigate to URL: http://amazon.com/
Come back to the Clarusway using the back command.
Again go back to the amazon website using forward command
Refresh the Browser using refresh command.
Close the Browser.

     */
    public static void main(String[] args) {

        // Crome driveri uyandirdik
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();


        // Clarusway sitesine gittik
        driver.navigate().to("https://clarusway.com/");
        // amazon sitesine gittik
        driver.navigate().to("https://amazon.com/");

        // geri tusuyla claruswaye geri dnduk
        driver.navigate().back();

        // Sayfamizi amazona geri dondurduk
        driver.navigate().forward();
        // Sayfamizi Yeniledik
        driver.navigate().refresh();
        // Sayfamizi Kapattik
        driver.close();


    }

}
