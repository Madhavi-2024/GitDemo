package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_Demo
{
    public static void main(String[] args)
    {
        WebDriver wd;
        System.setProperty("webdriver.chrome.driver","C:\\\\WebDrivers\\\\chrome.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("http://google.com");
        wd.navigate().to("http://rahulshettyacademy.com");
        wd.navigate().back();
        wd.navigate().forward();

    }
}
