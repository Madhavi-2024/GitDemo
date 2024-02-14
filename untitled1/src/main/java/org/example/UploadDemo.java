package org.example;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UploadDemo
{
    public static void main(String args[])
    {
        WebDriver wd;
        System.setProperty("webdriver.chrome.Driver", "C:\\WebDrivers\\chrome.exe");
        wd = new ChromeDriver();
        wd.get("https://demo.guru99.com/test/upload/");

        // Maximize the browser
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Locating upload button
        WebElement upload = wd.findElement(By.id("uploadfile_0"));

        //Upload the file
        upload.sendKeys("C:\\SeleniumTraining\\Test_Resume.docx");

        //Selecting a checkbox
        WebElement checkBox = wd.findElement(By.id("terms"));
        checkBox.click();

        //Click on submit button
        WebElement submitButton = wd.findElement(By.id("submitbutton"));
        submitButton.click();

        //Upload the file
        upload.sendKeys("C:\\SeleniumTraining\\Test_Resume.docx");

        // close the browser
        wd.close();
    }
}

