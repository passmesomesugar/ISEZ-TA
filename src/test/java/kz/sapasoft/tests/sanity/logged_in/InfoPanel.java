package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class InfoPanel extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void infoPanelSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        checkIfNoErrorIsDisplayed();
    }
}
