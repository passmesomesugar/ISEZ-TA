package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class CompanysProfile extends BasicTestConditions {

    @Test(groups = "smoke")
    void companysProfileSanityTesting() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openCompanysProfile();
        checkIfNoErrorIsDisplayed();
        //Add title checks

        getPersonalCabinetPage().openCompanysUsers();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openPurchasingCategorySystemPositions();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openDocuments();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openOrganizer();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openPlaceOfProcurementAndDelivery();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openRegistrationData();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openOrganizationalStructure();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openBranchOffices();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openAddNonResident();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
    }
}
