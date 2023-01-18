package proj2orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {  //main method
        String baseurl = "https://opensource-demo.orangehrmlive.com/";   //storing base url
        System.setProperty("webdriver.Edge.driver","src/drivers/msedgedriver.exe");  //setting webdriver
        WebDriver driver = new EdgeDriver();  //creating object of edge driver
        driver.get(baseurl);   //method to involve url
        driver.manage().window().maximize();  //maximize page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout session
        String title = driver.getTitle();  //storing title
        System.out.println("---------------Title : "+title +"-------------");    //printing the title
        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url ; "+url); //printing current url
        String Source = driver.getPageSource();  //storing page source
        System.out.println("Page Source : " +Source);  //printing source page
        //  driver.findElement(By.name("username")).click();  //clicking on username field
        WebElement username = driver.findElement(By.name("username"));  //storing username
        username.sendKeys("shivam123");  // sending keys to username
        WebElement pass = driver.findElement(By.name("password")); //storing password field
        pass.sendKeys("123456");  //send key to password field
        // driver.close();  //closing browser
    }
}