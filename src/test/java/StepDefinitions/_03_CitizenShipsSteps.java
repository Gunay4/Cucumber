package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipsSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenships() {

        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);

    }

    @When("Create a CitizenShip")
    public void createACitizenship() {
        String citizenShipName= RandomStringUtils.randomAlphabetic(8); // 8 tane karışık harf
        String citizenShipShortName= RandomStringUtils.randomNumeric(4);// 4 tane karışık rakam
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name,citizenShipName);
        dc.mySendKeys(dc.shortName,citizenShipShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a Citizenship name as {string} shortName as {string}")
    public void createACitizenshipNameAsCodeAs(String name, String code) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name,name);
        dc.mySendKeys(dc.shortName,code);
        dc.myClick(dc.saveButton);

    }

    @Then("already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("exists");
    }

    @When("user delete Citizenship name as {string}")
    public void deleteCitizenshipName(String deletename) {
      dc.deleteItem(deletename);

    }



}
