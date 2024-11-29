package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _06_ApachePOISteps {
    DialogContent dc=new DialogContent();

    @When("User Create citizenship with ApachePOI")
    public void userCreateCitizenshipWithApachePOI() {
        //Excelden oku okuduklarını sırasıyla gönder kaydet

        ArrayList<ArrayList<String>> tablo= ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen",
                2
        );  // tablodan 2 sutunu al

        //her bir satırı citizenship olarak kaydet
        for(ArrayList<String> satir: tablo)
        {
            dc.myClick(dc.addButton);
            dc.mySendKeys(dc.name, satir.get(0));
            dc.mySendKeys(dc.shortName, satir.get(1));
            dc.myClick(dc.saveButton);
            dc.verifyMessageContainsText("success");
        }
    }

    @Then("User Delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
        //Excelden oku okuduklarını sırasıyla gönder sil
        ArrayList<ArrayList<String>> tablo= ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen",
                1
        );  // tablodan 1 sutunu al

        //her bir satırı citizenship adını al ve sil
        for(ArrayList<String> satir: tablo)
        {
            dc.deleteItem(satir.get(0));
            dc.verifyMessageContainsText("success");
        }


    }
}
