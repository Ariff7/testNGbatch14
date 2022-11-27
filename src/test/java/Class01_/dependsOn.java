package Class01_;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void Login(){
        System.out.println(6/0);
    }

    @Test(dependsOnMethods = {"Login"})
    public void DashBoardVerfication(){
        System.out.println("After login in, I am verifying the dashboard page");
    }

}
