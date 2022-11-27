package Class01_;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnotations {

    //our first test case
    @Test
    public void AfirstTestCase(){
        System.out.println("I am the first test case, Dont forget about me :(");
    }

    @Test
    public void BsecondTestCase(){
        System.out.println("I am the second test case");
    }

    @Test
    public void ThirdTestCase(){
        System.out.println("I am third test case");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am a before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println(" Hi.. I Am AfterMethod");
    }

}
