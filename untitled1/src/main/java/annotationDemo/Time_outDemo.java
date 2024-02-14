package annotationDemo;
import org.testng.annotations.Test;

public class Time_outDemo
{
    @Test(timeOut = 2000) // time in milliseconds
    public void PassTest() throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("This test was successful");
    }

    @Test(timeOut = 4000)
    public void FailTest() throws InterruptedException
    {
        Thread.sleep(5000);
        System.out.println("This test fails");
    }
}
