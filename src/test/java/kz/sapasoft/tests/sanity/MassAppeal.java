package kz.sapasoft.tests.sanity;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerOne;

public class MassAppeal extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void appealList() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeal();
        getPersonalCabinetPage().openListOfAppeals();
        element(Selectors.byAttribute("jhitranslate", "appeal.title")).shouldHave(Condition.exist, Condition.visible);
    }

    @Test(groups = "smoke", description = "")
    void appealRequests() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeal();
        getPersonalCabinetPage().openListOfRequests();
        element(Selectors.byAttribute("jhitranslate", "npa.title")).shouldHave(Condition.exist, Condition.visible);
    }

    @Test(groups = "smoke", description = "")
    void clarifications() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeal();
        getPersonalCabinetPage().openClarifications();
        element(Selectors.byAttribute("jhitranslate", "npa.title")).shouldHave(Condition.exist, Condition.visible);
    }
}
