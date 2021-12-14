package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class MassAppeal extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void appealList() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeal();
        getPersonalCabinetPage().openListOfAppeals();
        getPersonalCabinetPage().appealTitle.shouldHave(Condition.exist, Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().openListOfRequests();
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().openClarificationsForNPA();
        element(Selectors.byAttribute("jhitranslate", "npa.title")).shouldHave(Condition.exist, Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().logOut();
    }
}
