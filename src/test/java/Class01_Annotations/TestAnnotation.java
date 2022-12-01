package Class01_Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestAnnotation {

    @BeforeTest
    public void BT(){
        System.out.println("I am before the mf Test -------------");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("I am beforeSuite :)");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am afterSuite :) ");
    }

    @AfterTest
    public void AT(){
        System.out.println("I am after the mf Test  -------------");
    }

}
