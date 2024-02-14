package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
public class mouseHover1
{
    public static void main(String[] args)
    {
        WebDriver wd;
        System.setProperty("webdriver.chrome.Driver", "C:\\WebDrivers\\chrome.exe");
        wd = new ChromeDriver();
        wd.get("https://www.guru99.com/");
        System.out.println("guru99 webpage Displayed");

        //Maximise browser window
        wd.manage().window().maximize();

        //Adding wait
        wd.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Actions actions = new Actions(wd);

        //Retrieve WebElement 'Tutorials Library' to perform mouse hover
        WebElement slider = wd.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/h1"));

        //Move mouse to x offset 50 i.e. in horizontal direction
        actions.moveToElement(slider,50,0).perform();
        slider.click();
        System.out.println("Moved tutorial Library in horizontal directions");

        // Close the main window
        wd.close();
    }

}

