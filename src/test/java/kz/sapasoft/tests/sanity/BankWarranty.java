package kz.sapasoft.tests.sanity;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerOne;

public class BankWarranty extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void procurementPlanAccess() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openBankWarranty();
        getPersonalCabinetPage().openBankWarrantyList();
        getPersonalCabinetPage().title.shouldHave(Condition.visible);
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.clear")).shouldHave(Condition.visible, Condition.enabled);
        element(Selectors.byAttribute("data-cname", "textbox")).shouldHave(Condition.visible, Condition.enabled);
        element(Selectors.byAttribute("data-cname", "select")).shouldHave(Condition.visible, Condition.enabled);
    }
}
