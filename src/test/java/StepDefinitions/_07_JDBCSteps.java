package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _07_JDBCSteps extends DBUtility {

    DialogContent dc = new DialogContent();

    @And("Send the Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String query) {

       List< List<String > > dbList= DBUtility.getListData(query);

        List<WebElement> UIlist =  dc.nameList;


        for (int i = 0; i < dbList.size(); i++) {

            Assert.assertEquals(dbList.get(i).get(0),
                                UIlist.get(i).getText().trim(),
                                         "Aynı değil");
        }

    }
}
