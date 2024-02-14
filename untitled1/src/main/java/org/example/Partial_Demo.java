package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Partial_Demo
{
    @Test
    public void Partial_Demol()
    {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://www.geeksforgeeks.org/");


        // Click on the Link Text using click() command
        driver.findElement(By.partialLinkText("Algorithms")).click();


    }
}