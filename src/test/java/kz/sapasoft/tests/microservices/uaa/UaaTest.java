package kz.sapasoft.tests.microservices.uaa;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class UaaTest extends BasicTestConditions {
    @Test(groups = "test")
    public void uaaTest() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getHomePage().clickCompanyInfo();
        getPersonalCabinetPage().loginFromCompanyInfoPanel.shouldHave(Condition.text(getCustomerTwo().getName()));
        getHomePage().logOut();
    }
}
