package kz.sapasoft.tests.microservices.uaa;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class LogInLogOut extends BasicTestConditions {
    @Test(groups = "this")
    public void logInLogOut() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getHomePage().clickCompanyInfo();
        //getHomePage().loginFromCompanyInfoPanel.shouldHave(Condition.text(getCustomerTwo().getName()));
        getHomePage().logOut();
    }
}
