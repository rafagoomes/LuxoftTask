package PageObjects;

import Utilities.DriverWrapper;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;

public class UBSInSocietyPage {

    public UBSInSocietyPage() {
        PageFactory.initElements(DriverWrapper.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//div/a/span[text()='UBS in Society']")
    private WebElement ubsInSocietyHeader;
    @FindBy(how = How.XPATH, using = "//div//input[@name = 'searchKeyword']")
    private WebElement searchTextField;
    @FindBy(how = How.XPATH, using = "//span[@class = 'sdactivitystream__filterResultsTxt']")
    private WebElement resultsFound;

    public void validateUbsInSocietyPageIsOpen() {
        ExpectedConditions.visibilityOf(ubsInSocietyHeader);
        Assert.assertEquals("UBS in Society", ubsInSocietyHeader.getText());
    }

    public void searchForCountry(String country){
        ExpectedConditions.visibilityOf(searchTextField);
        searchTextField.sendKeys(country);
        searchTextField.sendKeys(Keys.RETURN);
    }

    public void validateResultsFound(String expectedValue){
        ExpectedConditions.visibilityOf(resultsFound);
        Assert.assertEquals(expectedValue, resultsFound.getText());
    }
}
