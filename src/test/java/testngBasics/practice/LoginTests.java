package testngBasics.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testngBasics.pages.LoginPage;

public class LoginTests {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


//    @Test
//    public void testPomPattern(){
//        // to access the elements of login page we will do the following:
//        // Create an object of the page that you need
//        LoginPage loginPage = new LoginPage(driver);
//
//        // Type the username in username input box
//        // WebElement use = driver.findElement(By.id(""));
//        loginPage.usernameInputBox.sendKeys("yoll-student");
//        loginPage.passwordInputBox.sendKeys("Bootcamp5#");
//        loginPage.loginButton.click();
//    }

    @Test
    public void testEncapsulatedPomPattern() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("yoll-student");
        Thread.sleep(1000);
        loginPage.enterPassword("Bootcamp5#");
        Thread.sleep(1000);
        loginPage.clickLoginButton();
        Thread.sleep(1000);
    }

}
