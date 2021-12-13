package kz.sapasoft.tests.sanity;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerOne;

public class ProcurementPlanAccess extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void procurementPlanAccess() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProcurementPlan();
        element(Selectors.byAttribute("jhitranslate", "plan.plan")).shouldHave(Condition.visible);
        element(Selectors.byAttribute("jhitranslate", "plan.createNewPlan")).shouldHave(Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'table')]")).shouldHave(Condition.visible);
    }
}
