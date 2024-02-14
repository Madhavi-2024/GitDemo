package annotationDemo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assert_Demo
{
    WebDriver driver;

    @Test
    public void Test()
    {
        //Setting up Chrome location
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");

        //Setting the driver to chrome driver
        driver = new ChromeDriver();
        String url = "https://www.google.com";
        driver.get(url);
        //Verify the actual title with the expected title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle,expectedTitle);
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Start the browser");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Close the browser");
        driver.quit();
    }
}


