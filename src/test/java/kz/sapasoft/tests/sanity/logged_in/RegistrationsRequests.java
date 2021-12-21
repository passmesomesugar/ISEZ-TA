package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class RegistrationsRequests extends BasicTestConditions {

    @Test(groups = "smoke")
    void test() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openRegistrationRequests();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().registrationRequestsTitle.shouldHave(Condition.visible);
        checkIfPageBodyHasTable();
    }
}
