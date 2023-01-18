package proj1nopcomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String base = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.Firefox.driver", "src/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //creating object pf chrome webdriver
        driver.get(base);     //method to involve url
        driver.manage().window().maximize();  // maximize page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //timeout session
        String title =driver.getTitle();     // storing title
        System.out.println("---------------Title : "+title +"-------------");    //printing the title
        String url = driver.getCurrentUrl();   //storing url
        System.out.println("current url : " + url);    //printing url
        String Source = driver.getPageSource();    //storing page source
        System.out.println("Page source : " + Source);    //printing source page
        driver.findElement(By.className("ico-login")).click();     // clicking on login link
        WebElement emailIdField = driver.findElement(By.id("Email"));    // storing emailfield
        emailIdField.sendKeys("shivamnopcomm@gmail.com");    // sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password"));    // stroring password field
        passwordField.sendKeys("Shivam@27897");    // sendkeys to password field
        //  driver.close();// closing browser
    }
}