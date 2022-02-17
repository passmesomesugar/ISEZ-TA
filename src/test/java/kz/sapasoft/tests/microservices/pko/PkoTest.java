package kz.sapasoft.tests.microservices.pko;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class PkoTest extends BasicTestConditions {

    @Test(groups= "test")
    public void pkoTest(){
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openPQSAdministration();
        getPersonalCabinetPage().openConstructor();
        checkIfPageBodyHasTableWithData();
        checkIfNoErrorIsDisplayed();
        getHomePage().logOut();

    }
}
