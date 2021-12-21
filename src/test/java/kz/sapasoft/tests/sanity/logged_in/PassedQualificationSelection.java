package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class PassedQualificationSelection extends BasicTestConditions {
    @Test(groups = "smoke")
    void qualifiedCheck() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openQualified();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openApplications();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().applicationsTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openRequestsForCommercialOffers();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().requestsForCommercialOffersTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();
    }
}
