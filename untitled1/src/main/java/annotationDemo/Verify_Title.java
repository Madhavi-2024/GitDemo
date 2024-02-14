package annotationDemo;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify_Title
{
    public WebDriver driver;
    @Test(priority =-1)
    public void Verify()
    {
        System.setProperty("webdriver.chrome.Driver","C:\\WebDrivers\\chrome.exe");
        driver = new ChromeDriver();
    }
    @Test(priority = 0)
    public void launchBrowser()
    {
        String expectedTitle = "Hello, What Do You Want To Learn?";
        driver.get("https://www.geeksforgeeks.org/");
        String actualTitle = driver.getTitle();
        if(actualTitle == expectedTitle)
            System.out.println("Same as Actual Title");
        else
            System.out.println("Not same as Actual Title");
        //Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dependsOnMethods = {"launchBrowser"}, priority =3)

    public void closeBrowser()
    {
        driver.close();

    }

}


