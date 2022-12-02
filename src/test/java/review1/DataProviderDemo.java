package review1;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo {

    @DataProvider
    public Object[][]loginData(){
        Object[][]login=new Object[4][2];
        login[0][0]="Admin";
        login[0][1]="Hum@nhrm123";
        login[1][0]="Admin";
        login[1][1]="Hum@nhrm123";
        login[2][0]="admin123";
        login[2][1]="Hum@nhhrm";
        login[3][0]="Admin";
        login[3][1]="Hum@nhrm123";
      return login;
    }

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void launchTheWebsite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test(dataProvider = "loginData")
    public void validLogin(String UserName, String PassWord) throws InterruptedException {
//username
        WebElement userName = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys(UserName);
//password
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys(PassWord);
//loginBtn
        WebElement logIn = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        logIn.click();

        Thread.sleep(2000);
        WebElement welcomeMsg=driver.findElement(By.id("welcome"));
        Assert.assertTrue(welcomeMsg.isDisplayed());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
