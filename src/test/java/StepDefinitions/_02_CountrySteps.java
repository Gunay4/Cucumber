package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {

        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);

    }

    @When("Create a country")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils.randomAlphanumeric(9); // 8 tane karışık harf
        String ulkeKodu= RandomStringUtils.randomNumeric(4); // 4 tane karışık rakam

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name,ulkeAdi);
        dc.mySendKeys(dc.code, ulkeKodu);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("success");
    }


    @When("Create a country name as {string} code as {string}")
    public void createACountryAsCodeAs(String ulkeAdi1, String ulkeKodu1) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.name, ulkeAdi1);
        dc.mySendKeys(dc.code, ulkeKodu1);
        dc.myClick(dc.saveButton);
    }

    @When("user delete Country name as {string}")
    public void userDeleteCountryNameAs(String countryName) {
        dc.deleteItem(countryName);
    }
}
