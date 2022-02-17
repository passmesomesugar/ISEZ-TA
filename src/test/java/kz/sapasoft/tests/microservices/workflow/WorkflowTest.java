package kz.sapasoft.tests.microservices.workflow;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class WorkflowTest extends BasicTestConditions {

    @Test (groups = "test")
    public void workflowTest(){
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeals();
        getPersonalCabinetPage().openClarificationsForNPA();
        checkIfPageBodyHasTableWithData();
        getHomePage().logOut();
    }
}
