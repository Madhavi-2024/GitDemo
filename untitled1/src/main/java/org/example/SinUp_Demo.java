package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

class SingUp_Demo
{
    @Test
    public void FirstName()
    {
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");
        String baseURL = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Madhavi");
        driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Jaini");
        int count = 33498;

        driver.findElement(By.id("RESULT_TextField-3")).sendKeys(""+count);
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
        driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Hyderabad");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("test1@gmail.com");
        Select drpTime = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
        
        drpTime.selectByVisibleText("Morning");


    }

}
