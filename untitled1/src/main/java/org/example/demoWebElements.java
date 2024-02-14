package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class demoWebElements

{
    public void demoWebElements()
    {
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
        driver.get(baseUrl);
        //To get the Webelement to the email text field
        WebElement email = driver.findElement(By.id("ap_email"));

        //To get the WebElement to the continue button
        WebElement Continue = driver.findElement(By.id("continue"));

        //Sending keys
        email.sendKeys("test@gmail.com");
        System.out.println("Text Field Set");

        //To click continue button
        Continue.click();

        //To get the Webelement to the password text field
        WebElement password = driver.findElement(By.name("password"));

        //Sending the keys
        password.sendKeys("abcde");
        System.out.println("Text Field Set");

        // to clear all the fields
        // email.clear();
        //password.clear();
        // System.out.println("Text Field Cleared");

        //To get SingIn button
        WebElement singIn = driver.findElement(By.id("signInSubmit"));

        //To click the SingIn button
        singIn.submit();
        System.out.println("SingIn Done with Click");

        driver.get(baseUrl);
        driver.findElement(By.id("ap_email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("continue"));
        driver.findElement(By.name("password")).sendKeys("abcde");
        driver.findElement(By.id("signInSubmit")).click();
        System.out.println("SingIn Done with Submit");
    }
}



