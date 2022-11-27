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
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertions {

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




//if we want to use soft asserition , we call it from the class SoftAssert by delcaring an instance
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actualError,expectedErrorMsg);
//check if the webelement error Message isDisplayed
        boolean isDisplayed=errorMsg.isDisplayed();
       //assert it now
       soft.assertTrue(isDisplayed);

 //to run TestCase , have to assert all the asertions that have been made
        soft.assertAll();

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }


}
