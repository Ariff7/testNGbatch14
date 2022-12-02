package review1;

import org.testng.annotations.*;

public class AnnotationsTestNg {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod : I will execute before each @Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod : I will execute after each @Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass : I will execute before Class" );
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass : I will execute after Class");
    }

    @Test
    public void actualTestCase(){
        System.out.println("This is my actual TestCase");
    }

    @Test
    public void secondTestCase(){
        System.out.println("This is my actual TestCase");
    }





}
