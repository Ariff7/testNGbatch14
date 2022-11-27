package Class01_;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 2, groups = "regression")
    public void Atest(){
        System.out.println("I am A test");
    }

    @Test(priority = 1)
    public void Btest(){
        System.out.println("I am B test");
    }

    @Test (priority = 3)
    public void Ctest(){
        System.out.println("I am C test");
    }

    @Test  //if we dont have priority - default it is 0,
    public void Ktest(){
        System.out.println("I am K test");
    }

    @Test
    public void Gtest(){
        System.out.println("I am G test");
    }



}
