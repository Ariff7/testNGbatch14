package Class3_Annotations_and_DataProviders_and_Listeners;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
task:
print("P") if test case passed
print("F") if test case failed
 */
public class listeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("The test case has passed TOP g");
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The test case has failed MF");

    }




}
