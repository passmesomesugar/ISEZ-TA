package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class BankWarranty extends BasicTestConditions {
    @Test(groups = "ready", description = "smoke testing of bank warranty section display")
    void bankWarranty() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openBankWarranty();
        getPersonalCabinetPage().openBankWarrantyList();
        getPersonalCabinetPage().warrantyTitle.shouldHave(Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().openBankWarrantyReport();
        getPersonalCabinetPage().warrantyReportTitle.shouldHave(Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        getPersonalCabinetPage().randomCSS_ContainsTable_in_ClassName.shouldHave(Condition.exist);
    }
}
