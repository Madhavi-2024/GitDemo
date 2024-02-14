package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropDown
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chromedriver", "C:\\WebDrivers\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        int i = 1;

        while (i < 5)
        {

            driver.findElement(By.id("hrefIncAdt")).click();

            i++;

        }

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
