package annotationDemo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FristName
{
    @BeforeTest
    public void before_test()
    {
        System.out.println("My Name");
    }

    @Test
    public void fristname()
    {
        System.out.println("Shankar");
    }
    @Test
    public void frist_name()
    {
        System.out.println("Madhavi");
    }
}