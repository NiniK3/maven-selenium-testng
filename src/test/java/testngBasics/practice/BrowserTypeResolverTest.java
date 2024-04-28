package testngBasics.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BrowserTypeResolverTest {

    private WebDriver driver;

    /*
    * In this case we are utilizing the Parameterization in set up method
    * This is extremely useful for cross browser testing where we need to test our application in different browsers
    * We create a parameter at test level in xml refer to browserTypeResolver.xml, with name browserType and a specific browser we need to use
    * Once we receive the value from xml we have a switch case that will check what type of browser to instantiate
    * */

    @Parameters("browserType")
    @BeforeMethod
    public void setup(@Optional("chrome") String browserType){

        switch (browserType){
            case "firefox" -> driver = new FirefoxDriver();
            case "safari" -> driver = new SafariDriver();
            case "edge" -> driver = new EdgeDriver();
            default -> driver = new ChromeDriver();
        }

//        switch (browserType){
//            case "firefox":
//                driver = new FirefoxDriver();
//                break;
//            case "safari":
//                driver = new SafariDriver();
//                break;
//            case "edge":
//                driver = new EdgeDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//        }

        driver.get("https://www.bestbuy.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void dummyTest(){
        System.out.println(driver.getTitle());
    }

}
