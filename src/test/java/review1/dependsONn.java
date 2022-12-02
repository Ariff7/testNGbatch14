package review1;

import jdk.jfr.Timespan;
import org.testng.annotations.Test;

public class dependsONn {

    @Test(dependsOnMethods = {"login"})
    public void addEmployee(){
        System.out.println("This will add an employee");
    }

    @Test
    public void login(){
        System.out.println("It will do my login");
    }

}
