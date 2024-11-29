package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import java.util.List;

public class _04_DatatableOrnek {
    @When("write username {string}")
    public void writeUsernam(String username) {
        System.out.println(username);
    }

    @When("write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println(username + " " + password);
    }

    @And("Write username as Datatable")
    public void writeUsernameAsDatatable(DataTable dtUserlar) {
        List<String> listUserlar = dtUserlar.asList(String.class);

        for (String user : listUserlar)
            System.out.println(user);
    }

    @And("Write username and password as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable dtUserPass) {
        List< List<String> > lisUserPass = dtUserPass.asLists(String.class);

        for (int i = 0; i < lisUserPass.size(); i++) {

            System.out.println(lisUserPass.get(i).get(0)+" "+
                              lisUserPass.get(i).get(1));
        }

    }
}
