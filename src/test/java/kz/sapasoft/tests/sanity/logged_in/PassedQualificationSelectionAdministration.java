package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class PassedQualificationSelectionAdministration extends BasicTestConditions {
    @Test(groups = "smoke")
    void pqsSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openPQSAdministration();

        getPersonalCabinetPage().openConstructor();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openCategoryReference();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openRequirementsReference();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openAttributeReference();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().changeOfRate();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openStrategicPartnersList();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openReferencesInAdministration();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openTaskExecutionPeriod();
        checkIfNoErrorIsDisplayed();
    }
}
