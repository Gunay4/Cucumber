package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> linkler = dtLinkler.asList();

        for (int i = 0; i < linkler.size(); i++) {
            ln.myClick(ln.getWebElement(linkler.get(i)));

        }

    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButonlar) {
        List<String> butonlar = dtButonlar.asList();

        for (int i = 0; i < butonlar.size(); i++) {

            dc.myClick(dc.getWebElement(butonlar.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtKutuVeYazilar) {
        List<List<String>> kutuVeYazilar = dtKutuVeYazilar.asLists();

        for (int i = 0; i < kutuVeYazilar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilar.get(i).get(0));
            dc.mySendKeys(kutu, kutuVeYazilar.get(i).get(1));
            // kutuya yazıyı gönder
        }

    }

    @And("user delete Element from dialog")
    public void userDeleteElementFromDialog(DataTable dtSilinecekler) {
        List<String > silinecekler=dtSilinecekler.asList();

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItem(silinecekler.get(i));
        }

    }



}
