package proj3herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {   //declaring all variable as static
    static String browser = "Chrome";   // selecting browser
    static String baseURL = "http://the-internet.herokuapp.com/login";    //storing base url
    static WebDriver driver;

    public static void main(String[] args) {    //Main method
        if( browser.equalsIgnoreCase("Chrome")) {       //if condition match input then system will enter this block
            System.setProperty("webdriver.Chrome.driver","src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {    //if condition match input then system will enter this block
            System.setProperty("webdriver.Firefox.driver","src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {    //if condition match input then system will enter this block
            System.setProperty("webdriver.Edge.driver","src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {       // if all condition not match input system will enter this block
            System.out.println("Not valid Browser");
        }
        driver.get(baseURL); //method to involve url
        driver.manage().window().maximize();  // maximize page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //timeout session
        String title =driver.getTitle();     // storing title
        System.out.println("---------------Title : "+title +"-------------");    //printing the title
        String url = driver.getCurrentUrl();   //storing url
        System.out.println("current url : " + url);    //printing url
        String Source = driver.getPageSource();    //storing page source
        System.out.println("Page source : " + Source);    //printing source page
        driver.findElement(By.id("username")).click();  //clicking on username field
        WebElement username = driver.findElement(By.id("username"));   //storing username field
        username.sendKeys("shivam123");  //sending keys to username field
        WebElement pass = driver.findElement(By.id("password"));  //storing password field
        pass.sendKeys("123456"); //sending keys to password field
        //driver.close();  //closing browser
    }
}
