package Class01_;

import org.testng.annotations.Test;

public class disableATestCase_ {

    @Test(enabled = false)
    public void Atest(){
        System.out.println("I am A Test");
    }

    @Test
    public void Btest(){
        System.out.println("I am a B Test");
    }

    @Test(enabled = false)
    public void Ctest(){
        System.out.println("I am a C Test");
    }


}
