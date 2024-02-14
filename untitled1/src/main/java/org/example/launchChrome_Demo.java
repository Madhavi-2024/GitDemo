package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import java.util.Set;
        public class launchChrome_Demo
        {
            public void chromeDemo()
            {
                System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.geeksforgeeks.org/");
                // driver.findElement(By.className("ant-input ant-input-lg")).sendKeys("test");
                driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[1]/div[1]/div[2]/span/span/span[1]/input")).sendKeys("test");
        String pageTitle = driver.getTitle();
        System.out.println("Title page ="+pageTitle);
    }


    }

