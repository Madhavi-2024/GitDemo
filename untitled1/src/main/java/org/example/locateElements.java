package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.example.launchChrome_Demo;


//import org.openqa.selenium.microsoftedge.MicroSoftedgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;

public class locateElements
{

    public void elements(String[] arg)
    {
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AXo7B7WKxwPh_jnUQ-h3o92CCwYHO9VLzHD_NhEhv6LFGmW5_mBPNP71qJjniK_NESi1NW-vXoyZng&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.xpath("//dive[text()='Forgot email?']")).click();


        //System.setProperty("webdriver.edge.Driver","C:\\WebDrivers\\microsoftedge.exe");
        //WebDriver driver = new MicrosoftedgeDriver();
        //driver.get("https://www.google.com/");

        //launchChrome_Demo a = new launchChrome_Demo();
        // a.chromeDemo();





    }
}