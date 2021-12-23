package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class DocumentsSanity extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void profileSettings() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openDocumentsInPersonalCabinet();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

    }
}

