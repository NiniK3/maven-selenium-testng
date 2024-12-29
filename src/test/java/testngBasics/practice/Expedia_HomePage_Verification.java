package testngBasics.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testngBasics.pages.ExpediaHomePage;

import java.util.List;
import java.util.Set;

public class Expedia_HomePage_Verification {
    private WebDriver driver;
    Expedia_HomePage_Verification homePageVerification = new Expedia_HomePage_Verification();



    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");
    }
@AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void verifyLoginPage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More";
        System.out.println("Expedia actual title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification FAILED");

    }
@Test
public static void form(){
    ExpediaHomePage homePage = new ExpediaHomePage();
    homePage.flightsOption.click();
    homePage.leavingFormInbox.sendKeys("New York");
    homePage.goingInbox.sendKeys("Paris");

    homePage.searchButton.click();
}

}
//2.Click on Flights on left nav bar
// 3.Fill out form as shown below
// a.Passengers: 2
// b.Departing: New York
// c.On: June 1
// d.Arriving: Paris
// e.Returning: November 6
// f.Business Class
// g.Unified Airlines
// h.Click continue button
// 4.User should be able to see “No Seats Avaialble” message