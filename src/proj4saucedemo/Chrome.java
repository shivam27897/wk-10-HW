package proj4saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {  //main method
        String baseurl = "https://www.saucedemo.com/";  //storing base url
        System.setProperty("webdriver.Chrome.driver","src/drivers/chromedriver.exe");  //setting webdriver
        WebDriver driver = new ChromeDriver();  //creating object of chrome webdriver
        driver.get(baseurl);
        driver.manage().window().maximize();  // maximize page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //timeout session
        String title =driver.getTitle();     // storing title
        System.out.println("---------------Title : "+title +"-------------");    //printing the title
        String url = driver.getCurrentUrl();   //storing url
        System.out.println("current url : " + url);    //printing url
        String Source = driver.getPageSource();    //storing page source
        System.out.println("Page source : " + Source);    //printing source page
        driver.findElement(By.id("user-name")).click();  //clicking on username field
        WebElement username = driver.findElement(By.id("user-name"));  //storing username field
        username.sendKeys("shivam123");  //sending keys to username field
        WebElement pass = driver.findElement(By.id("password"));  //storing password field
        pass.sendKeys("123456"); //sending keys to password field
        //driver.close(); //closing browser
    }
}
