package testngBasics.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomePage {
    public  void homePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img [@alt = 'Expedia logo']")
    public WebElement logoImage;

    @FindBy(xpath = "//span[text() = 'Flights']")
    public WebElement flightsOption;

    @FindBy(xpath = "//input[@data-stid = 'origin_select-dialog-input']")
    public WebElement leavingFormInbox;

    @FindBy(xpath = "//input[@data-stid = 'destination_select-dialog-input']")
    public WebElement goingInbox;

    @FindBy(xpath = "//button[@data-stid = 'open-room-picker']")
    public WebElement travelersCountInbox;

    @FindBy(xpath = "//button[@name = 'EGDSDateRange-date-selector-trigger']")
    public WebElement datesInbox;

    @FindBy(xpath = "//button[@ id = 'search_button']")
    public WebElement searchButton;
}
