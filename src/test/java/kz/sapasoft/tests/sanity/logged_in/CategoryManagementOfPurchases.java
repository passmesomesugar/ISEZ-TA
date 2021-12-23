package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class CategoryManagementOfPurchases extends BasicTestConditions {
    @Test(groups = "smoke")
    void categoryManagementOfPurchasesSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openCMP();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openListOfCategories();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openZKS();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().GWSCodesManagement();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openDocumentsApproval();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openMethodology();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openSupplierSelection();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
    }
}
