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
        getPersonalCabinetPage().appealTitle.shouldHave(Condition.exist, Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().logOut();
    }

    @Test(groups = "smoke", description = "")
    void appealRequests() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeal();
        getPersonalCabinetPage().openListOfRequests();
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().logOut();
    }

    @Test(groups = "smoke", description = "")
    void clarifications() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeal();
        getPersonalCabinetPage().openClarificationsForNPA();
        element(Selectors.byAttribute("jhitranslate", "npa.title")).shouldHave(Condition.exist, Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().logOut();
    }
}
