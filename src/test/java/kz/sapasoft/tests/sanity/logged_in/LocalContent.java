package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class LocalContent extends BasicTestConditions {
    @Test(groups = "smoke")
    void localContentSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openLocalContent();
        checkIfNoErrorIsDisplayed();
    }
}
