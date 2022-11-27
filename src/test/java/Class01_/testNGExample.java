package Class01_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {

 /*  ---Test1----
 Go to syntax Hrms
 Enter the username and password, verifgy that you logged in
 close the browser
  */

    public static WebDriver driver;

//writing down all the pre conditions for a test case
    @BeforeMethod(alwaysRun = true)
    public void SetUpBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

//post conditions for test case
    @AfterMethod(alwaysRun = true)
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    /*  ---Test1----
     Go to syntax Hrms
     Enter the username and password, verifgy that you logged in
     close the browser
      */

    @Test(groups = "smoke")
    public void LoginFunctionality(){
        WebElement userName = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        logIn.click();
    }

/* ---Test2----
goto syntax Hrms
verify the login button is there
 */
    @Test
    public void LoginBtnVerfication(){
        WebElement logIn = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        logIn.click();
    }

/*---Test3---
    verify password is there

 */
    @Test
    public void PsswordBoxVerification() {
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(password.isDisplayed());
    }




}
