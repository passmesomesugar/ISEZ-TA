package kz.sapasoft.tests.microservices.tender;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;
import static kz.sapasoft.services.UserManager.getSupplierOne;

public class TenderMicroService extends BasicTestConditions {

    @Test(groups = "test")
    public  void  tenderTest(){
        getHomePage().logIn(getSupplierOne().getName(), getSupplierOne().getPassword());
        getPersonalCabinetPage().openProposals();
        getPersonalCabinetPage().openListOfProposals();
        checkIfNoErrorIsDisplayed();
    }
}
