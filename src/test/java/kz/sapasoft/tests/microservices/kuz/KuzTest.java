package kz.sapasoft.tests.microservices.kuz;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class KuzTest extends BasicTestConditions {

    @Test(groups= "test")
    public void kuzTest(){
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openCMP();
        getPersonalCabinetPage().openSupplierSelection();
        checkIfPageBodyHasTableWithData();
        checkIfNoErrorIsDisplayed();
        getHomePage().logOut();

    }
}
