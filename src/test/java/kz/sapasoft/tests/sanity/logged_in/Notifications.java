package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Notifications extends BasicTestConditions {

    @Test(groups = "smoke", description = "")
    void notificationsSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openNotifications();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
    }
}
