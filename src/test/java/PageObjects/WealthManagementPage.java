package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.DriverWrapper;
import org.openqa.selenium.support.ui.Select;

public class WealthManagementPage {

    public WealthManagementPage() {
        PageFactory.initElements(DriverWrapper.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//div/a/span[text()='Multi-Family Office Brazil']")
    private WebElement multiFamilyHeader;
    @FindBy(how = How.XPATH, using = "//span[text()='Get in touch']")
    private WebElement getInTouchButton;
    @FindBy(how = How.ID, using = "Helpyou")
    private WebElement helpYouDropdown;
    @FindBy(how = How.ID, using = "Wmamount")
    private WebElement myInvestible;
    @FindBy(how = How.ID, using = "Noninvest")
    private WebElement requestMessage;
    @FindBy(how = How.XPATH, using = "//li/label[@for= 'Sex_2']")
    private WebElement mrRadioButton;
    @FindBy(how = How.ID, using = "Firstname")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "Lastname")
    private WebElement lastName;
    @FindBy(how = How.ID, using = "Email")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//li/label[@for= 'Callby_1']")
    private WebElement callYouRadioButton;
    @FindBy(how = How.ID, using = "Residence")
    private WebElement countryResidence;
    @FindBy(how = How.ID, using = "Confirmation_1")
    private WebElement confirmUnderstandCheckbox;
    @FindBy(how = How.ID, using = "Marketingusage_1")
    private WebElement confirmMarketingCheckbox;
    @FindBy(how = How.XPATH, using = "//button//span[text()='Reset']")
    private WebElement resetButton;

    public void validateMultiFamilyPageIsOpen() {
        ExpectedConditions.visibilityOf(multiFamilyHeader);
        Assert.assertEquals("Multi-Family Office Brazil", multiFamilyHeader.getText());
    }

    public void clickGetInTouchButton() {
        ExpectedConditions.visibilityOf(getInTouchButton);
        getInTouchButton.click();
    }

    public void openHelpYouDropdown() {
        ExpectedConditions.visibilityOf(helpYouDropdown);
        helpYouDropdown.click();
    }

    public void selectHelpYouDropdown(String dropdownValue) {
        Select se = new Select(helpYouDropdown);
        se.selectByValue(dropdownValue);
    }

    public void selectMyInvestibleDropdown(String dropdownValue) {
        Select se = new Select(myInvestible);
        se.selectByValue(dropdownValue);
    }

    public void writeRequestMessage(String message) {
        ExpectedConditions.visibilityOf(requestMessage);
        requestMessage.sendKeys(message);
    }

    public void checkMrRadioButton() {
        ExpectedConditions.visibilityOf(mrRadioButton);
        mrRadioButton.click();
    }

    public void checkCallYouRadioButton() {
        ExpectedConditions.visibilityOf(callYouRadioButton);
        callYouRadioButton.click();
    }

    public void fillFirstName(String value) {
        ExpectedConditions.visibilityOf(firstName);
        firstName.sendKeys(value);
    }

    public void fillLastName(String value) {
        ExpectedConditions.visibilityOf(lastName);
        lastName.sendKeys(value);
    }

    public void fillEmail(String value) {
        ExpectedConditions.visibilityOf(email);
        email.sendKeys(value);
    }

    public void openCountryResidenceDropdown() {
        ExpectedConditions.visibilityOf(countryResidence);
        countryResidence.click();
    }

    public void selectCountryResidenceDropdown(String dropdownValue) {
        Select se = new Select(countryResidence);
        se.selectByValue(dropdownValue);
    }

    public void clickUnderstandCheckbox(){
        ExpectedConditions.visibilityOf(confirmUnderstandCheckbox);
        confirmUnderstandCheckbox.click();
    }

    public void clickMarketingCheckbox(){
        ExpectedConditions.visibilityOf(confirmMarketingCheckbox);
        confirmMarketingCheckbox.click();
    }

    public void clickResetButton() throws InterruptedException {
        ExpectedConditions.visibilityOf(resetButton);
        resetButton.click();

    }
}
