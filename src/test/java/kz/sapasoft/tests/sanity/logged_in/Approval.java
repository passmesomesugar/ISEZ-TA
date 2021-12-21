package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Approval extends BasicTestConditions {
    @Test(groups = "1")
    void checkApproval() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openApproval();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openApprovalRoutesTemplates();
        //title check
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openDocumentsApproval();
        checkIfNoErrorIsDisplayed();
    }
}
