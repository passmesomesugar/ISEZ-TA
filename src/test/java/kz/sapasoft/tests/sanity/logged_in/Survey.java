package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Survey extends BasicTestConditions {

    @Test(groups = "smoke")
    void pollSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openSurvey();
        getPersonalCabinetPage().openQuestionnaire();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
    }
}
