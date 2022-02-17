package kz.sapasoft.tests.microservices.analytics;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Analytics extends BasicTestConditions {

    @Test(groups= "test")
    public void analyticsTest(){
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openpriceCatalog();
        checkIfPageBodyHasTableWithData();
        checkIfNoErrorIsDisplayed();
        getHomePage().logOut();

    }
}
