package review1;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test
    public void firstTestCase(){
        System.out.println("This is my first Test Case");
    }

    @Test (priority = 1)
    public void secondTestCase(){
        System.out.println("This is another Test Case");
    }

}
