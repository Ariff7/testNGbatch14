package Class02_Assertions_andXML;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertions {

//send wrong password and verrify text

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void launchTheWebsite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test(groups = "regression")
    public void invalidCredentials(){
//username
        WebElement userName = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys("admin");
//password
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("WrongPass");
//loginBtn
        WebElement logIn = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        logIn.click();
//Invalid credentials
        WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
        String actualError=errorMsg.getText();
        String expectedErrorMsg="Invalid credentials";

        Assert.assertEquals(actualError,expectedErrorMsg);  //if this fails lined 52-53 wont run

//confirm that the error message is displayed


        boolean isDisplayed=errorMsg.isDisplayed();
        Assert.assertTrue(isDisplayed);

        //System.out.println(isDisplayed);

     /*  no good- case still passes even with wrong expectedErrorMsg
     if(actualError.equalsIgnoreCase(expectedErrorMsg)){
            System.out.println("The error message is there");
        }else{
            System.out.println("Error message is not there");
        } */




    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }



}
