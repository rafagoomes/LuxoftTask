package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.DriverWrapper;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(DriverWrapper.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//ul[@id='mainmenu']//span/a[contains(text(),'Wealth Management')]")
    private WebElement wealthManagementMenu;
    @FindBy(how = How.XPATH, using = "//ul[@id='mainmenu']//span/a[contains(text(),'About us')]")
    private WebElement aboutUsMenu;
    @FindBy(how = How.XPATH, using = "//ul[@id='mainmenu']//span/a[contains(text(),'Multi-Family Office Brazil')]")
    private WebElement multiFamilyOption;
    @FindBy(how = How.XPATH, using = "//ul[@id='mainmenu']//span/a[contains(text(),'UBS in society')]")
    private WebElement ubsInSocietyOption;

    public void clickWealthManagementMenuLabel(){
        ExpectedConditions.visibilityOf(wealthManagementMenu);
        wealthManagementMenu.click();
    }

    public void clickMultiFamilyOption(){
        ExpectedConditions.visibilityOf(multiFamilyOption);
        multiFamilyOption.click();
    }

    public void clickAboutUsMenuLabel(){
        ExpectedConditions.visibilityOf(aboutUsMenu);
        aboutUsMenu.click();
    }

    public void clickUbsInSocietyOption(){
        ExpectedConditions.visibilityOf(ubsInSocietyOption);
        ubsInSocietyOption.click();
    }
}

