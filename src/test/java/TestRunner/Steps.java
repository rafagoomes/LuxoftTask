package TestRunner;

import PageObjects.HomePage;
import PageObjects.UBSInSocietyPage;
import PageObjects.WealthManagementPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.DriverWrapper;

import java.util.List;
import java.util.Map;
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

    @And("^I Search for '(.*?)' content$")
    public void searchForCountry(String country) {
        usp.searchForCountry(country);
    }

    @Then("^I check if search results has '(.*?)'$")
    public void checkSearchResult(String expectedResult){
        usp.validateResultsFound(expectedResult);
    }

    @When("UBS in Society page is opened")
    public void validateUbsInSocietyPageIsOpened(){
        usp = new UBSInSocietyPage();
        usp.validateUbsInSocietyPageIsOpen();
    }

    @When("I fulfill form fields")
    public void fillForm(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);

        for (Map<String, String> rows : list) {

            wmp.openHelpYouDropdown();
            wmp.selectHelpYouDropdown(rows.get("Dropdown1"));
            wmp.selectMyInvestibleDropdown(rows.get("Dropdown2"));
            wmp.writeRequestMessage(rows.get("DescriptionField"));
            wmp.checkMrRadioButton();
            wmp.fillFirstName(rows.get("FirstName"));
            wmp.fillLastName(rows.get("LastName"));
            wmp.fillEmail(rows.get("Email"));
            wmp.checkCallYouRadioButton();
            wmp.openCountryResidenceDropdown();
            wmp.selectCountryResidenceDropdown(rows.get("Country"));
            wmp.clickUnderstandCheckbox();
            wmp.clickMarketingCheckbox();
        }

    }

    @Then("I click on reset button")
    public void resetFillForm() throws InterruptedException {
        wmp.clickResetButton();
    }

    @After()
    public void closeBrowser(){
        DriverWrapper.getDriver().quit();
    }
}
