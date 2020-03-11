package TestRunner;

import PageObjects.HomePage;
import PageObjects.UBSInSocietyPage;
import PageObjects.WealthManagementPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.DriverWrapper;

import java.util.concurrent.TimeUnit;

public class Steps {

    HomePage hp = new HomePage();
    WealthManagementPage wmp = new WealthManagementPage();
    UBSInSocietyPage usp = new UBSInSocietyPage();

    public Steps(){
        DriverWrapper.initializeDriver();
        DriverWrapper.getDriver().manage().window().maximize();
        DriverWrapper.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("Open Chrome and launch the application")
    public void navigateToUrl() {
        DriverWrapper.getDriver().get("https://www.ubs.com");
    }

    @When("I open Wealth Management page")
    public void clickOnWealthManagement(){
        hp = new HomePage();
        hp.clickWealthManagementMenuLabel();
        hp.clickMultiFamilyOption();
    }

    @Then("Multi Family Page is opened")
    public void validateMultiFamilyPageIsOpened(){
        wmp = new WealthManagementPage();
        wmp.validateMultiFamilyPageIsOpen();
    }

    @Given("Navigate to Get In Touch Form")
    public void navigateToGetInTouch(){
        wmp = new WealthManagementPage();
        wmp.clickGetInTouchButton();
    }

    @Given("Navigate to UBS In Society")
    public void navigateToUbsInSociety(){
        hp = new HomePage();
        hp.clickAboutUsMenuLabel();
        hp.clickUbsInSocietyOption();
    }

    @And("I Search for Brazil content")
    public void searchForBrazilContent() throws InterruptedException {
        usp.searchForBrazilContent();
    }

    @Then("I check if search results has expected result")
    public void checkSearchResult(){
        usp.validateResultsFound();
        usp.validateArticleFoundTitle();
    }

    @When("UBS in Society page is opened")
    public void validateUbsInSocietyPageIsOpened(){
        usp = new UBSInSocietyPage();
        usp.validateUbsInSocietyPageIsOpen();
    }

    @When("I fulfill form fields")
    public void fillForm() {
        wmp.openHelpYouDropdown();
        wmp.selectHelpYouDropdown("General question");
        wmp.selectMyInvestibleDropdown("USD 2 million+");
        wmp.writeRequestMessage("This is a test!");
        wmp.checkMrRadioButton();
        wmp.fillFirstName("Rafael");
        wmp.fillLastName("Gomes");
        wmp.fillEmail("rafaelgomes@email.com");
        wmp.checkCallYouRadioButton();
        wmp.openCountryResidenceDropdown();
        wmp.selectCountryResidenceDropdown("Brazil");
        wmp.clickUnderstandCheckbox();
        wmp.clickMarketingCheckbox();
    }

    @Then("I click on reset button")
    public void resetFillForm() {
        wmp.clickResetButton();
    }

    @After()
    public void closeBrowser(){
        DriverWrapper.getDriver().quit();
    }
}
