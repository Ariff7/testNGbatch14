package Class3_Annotations_and_DataProviders_and_Listeners;

import org.testng.annotations.*;

public class Annotations {

   @BeforeTest
   public void beforeTest(){
       System.out.println("I am before Test");
   }

   @AfterTest
   public void afterTest(){
       System.out.println("I am after test");
   }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" I am a Before Method");
    }

    @Test
    public void AFirstTest(){
        System.out.println("I am A 1 Test");
    }

    @Test
    public void BSecondtTest(){
        System.out.println("I am B 2 Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am an After Method ");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }




}
