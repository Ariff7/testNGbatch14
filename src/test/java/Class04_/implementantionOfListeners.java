package Class04_;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class implementantionOfListeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test case has successfully passed "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test case has FAILED BOZO "+result.getName());
    }


}
