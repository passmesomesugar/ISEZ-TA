package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Contracts extends BasicTestConditions {

    @Test(groups = "smoke")
    void contractsSanityTesting() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openContracts();

        getPersonalCabinetPage().openContractsGlobalTemplates();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openCustomersIndividualTemplates();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openContractTemplates();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openListOfContracts();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openListOfActs();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
    }
}
