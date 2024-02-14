package annotationDemo;
import org.testng.annotations.Test;

public class SkipException_Demo
{
    Boolean data = false;

    @Test(enabled = false)
    public void skipTest1()
    {
        System.out.println("Skip this test it is not implemented");
    }

    @Test
    public void skipTest2()
    {
        System.out.println("Skip this test case forcefully");
        throw new org.testng.SkipException("Skipping this test case");
    }

    @Test
    public void skipTest3()
    {
        System.out.println("Skip this test case based on the condition");
        if (data == true)
        {
            System.out.println("Execute this test case");
        } else
        {
            System.out.println("Do not execute this step");
            throw new org.testng.SkipException("Do not execute this test ");
        }

    }
}
