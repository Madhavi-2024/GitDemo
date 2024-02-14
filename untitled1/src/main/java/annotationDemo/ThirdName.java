package annotationDemo;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ThirdName {
    @Test
    public void ThirdName() {
        System.out.println("Madhu");
    }

    @BeforeSuite
    public void before_suite() {
        System.out.println("First method");
    }

}

