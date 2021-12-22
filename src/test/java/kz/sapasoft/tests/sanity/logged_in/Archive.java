package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Archive extends BasicTestConditions {

    @Test(groups = "smoke")
    void archiveSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openArchive();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openArchiveProcurementPlan();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openArchiveContracts();
        checkIfNoErrorIsDisplayed();
    }
}
