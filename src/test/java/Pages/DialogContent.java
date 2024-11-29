package Pages;


import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement name;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement code;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Country successfully created']")
    public WebElement successMessage;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//ms-text-field[contains (@placeholder,'FIELD.NAME')]/input")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement trahIcon;

    @FindBy(xpath = "//button[@color='accent']/span[@class='mdc-button__label']")
    public WebElement deleteButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveClose;

    @FindBy(css = "[formcontrolname='id']")
    public WebElement countrySelect;

    @FindBy(xpath = "//*[@class='cdk-overlay-pane']/div/mat-option")
    public WebElement selectCity;

    @FindBy(css = "[formcontrolname='roles'] input")
    public WebElement userType;

    @FindBy(css = "[role='option']")
    public WebElement selectUserType;

    @FindBy(xpath = "//mat-label[text()='Academic Period']")
    public WebElement academicPeriod;

    @FindBy(xpath = "//mat-option/span")
    public WebElement academicPeriodSelect;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']//span")
    public WebElement gradeLevel;

    @FindBy(xpath = "//mat-option/span")
    public WebElement gradeLevelSelect;

    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> nameList;


    public void verifyMessageContainsText(String value) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"), 0));
        Assert.assertTrue(this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

    }

    public void deleteItem(String deletename) {
        mySendKeys(searchInput, deletename);
        wait.until(ExpectedConditions.invisibilityOf(this.messageBox));
        myClick(searchButton);

        //sayfa yenilenene kadar, arama sonuçlarına kadar bekle.
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));

        myClick(trahIcon);
        myClick(deleteButton);
    }

    public WebElement getWebElement(String strElementName) {

        switch (strElementName) {
            case "addButton": return this.addButton;
            case "saveButton": return this.saveButton;
            case "name": return this.name;
            case "code": return this.code;
            case "shortName": return this.shortName;
            case "integrationCode": return this.integrationCode;
            case "priorityCode": return this.priorityCode;
            case "toggleBar": return this.toggleBar;
            case "saveClose": return this.saveClose;
            case "countrySelect": return this.countrySelect;
            case "selectCity": return this.selectCity;
            case "userType": return this.userType;
            case "selectUserType": return this.selectUserType;
            case "academicPeriod": return this.academicPeriod;
            case "academicPeriodSelect": return this.academicPeriodSelect;
            case "gradeLevel": return this.gradeLevel;
            case "gradeLevelSelect": return this.gradeLevelSelect;

        }
        return null;
    }
}
