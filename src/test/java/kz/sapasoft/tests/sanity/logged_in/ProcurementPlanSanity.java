package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class ProcurementPlanSanity extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void procurementPlanAccess() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProcurementPlan();
        element(Selectors.byAttribute("jhitranslate", "plan.plan")).shouldHave(Condition.visible);
        element(Selectors.byAttribute("jhitranslate", "plan.createNewPlan")).shouldHave(Condition.visible);
        checkIfPageBodyHasTable();
        checkIfNoErrorIsDisplayed();
    }
}
