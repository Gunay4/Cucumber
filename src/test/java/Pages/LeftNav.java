package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement states;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fees;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    public WebElement cities;

    @FindBy(xpath = "(//span[text()='Inventory'])[1]")
    public WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    public WebElement setupUnderTheInventory;

    @FindBy(xpath = "(//span[text()='Item Categories'])[1]")
    public WebElement ItemCategories;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement setupUnderTheEntranceExams;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement entranceExams2;


    public WebElement getWebElement(String strElementName){

        switch (strElementName)
        {
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "countries": return this.countries;
            case "citizenship":return this.citizenship;
            case "states": return this.states;
            case "nationalities" : return this.nationalities;
            case "fees" : return this.fees;
            case "cities": return this.cities;
            case "inventory": return this.inventory;
            case "setupUnderTheInventory": return this.setupUnderTheInventory;
            case "ItemCategories": return this.ItemCategories;
            case "entranceExams": return this.entranceExams;
            case "setupUnderTheEntranceExams": return this.setupUnderTheEntranceExams;
            case "entranceExams2": return this.entranceExams2;
        }
        return null;
    }

}
