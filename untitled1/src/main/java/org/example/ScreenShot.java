package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
public class ScreenShot
{
    @Test
    public void testBStackTakeScreenShot() throws Exception
    {
        WebDriver driver ;
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");
        driver = new ChromeDriver();
//goto url
        driver.get("http://www.google.co.in");
//Call take screenshot function
        this.takeSnapShot(driver, "C://Users//sivas//OneDrive//Documents//test.png") ;
    }
    /**
     * This function will take screenshot
     * webdriver
     * fileWithPath
     *  Exception
     */
    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File(fileWithPath);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }

}