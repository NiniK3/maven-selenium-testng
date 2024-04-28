package testngBasics.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
* POM - Page Object Model suggests that replicate real web pages with Java classes
- We will store related webElements and reusable methods to those classes
- Then in the tests we will simply reuse the properties and methods from that class object.
* Some other examples: LoginPage, HomePage, LandingPage, DahsboardPage, AdminPage etc...
*
* Currently we have findElement in each case for locators,
* When we will create an object of that page it will actually initialize and locate all at once
*
* PageFactory - it will give us an alternative for findElements
* - Lazy initialization - the elements will be initialized when they are used.
*
* What each object is represented by:
*
* - state
* - behaviour
*
* POM can be structured in 2 ways
* - public state
* - encapsulating the elements
*
* */



// Version with Encapsulation
public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // new way of locating elements
    @FindBy(id = "txtUsername") // locators id, css, xpath, className, linkedText
    private WebElement usernameInputBox;

    @FindBy(css = "#txtPassword")
    private WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id = 'btnLogin']")
    private WebElement loginButton;


    // Older way - Legacy
//    WebElement usernameInputBox = driver.findElement(By.id("txtUsername"));
//    WebElement passwordInputBox = driver.findElement(By.id("txtPassword"));
//    WebElement loginButton = driver.findElement(By.id("btnLogin"));

    public void enterUsername(String username){
        usernameInputBox.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInputBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
