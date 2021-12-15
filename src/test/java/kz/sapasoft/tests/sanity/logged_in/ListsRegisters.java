package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class ListsRegisters extends BasicTestConditions {
    @Test(groups = "ready", description = "")
    void requests() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openListRegister();

        getPersonalCabinetPage().clickGWSCodesManagement();
        getPersonalCabinetPage().randomCSS_ContainsTable_in_ClassName.shouldHave(Condition.exist);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);

        getPersonalCabinetPage().clickRequests();
        getPersonalCabinetPage().randomCSS_ContainsTable_in_ClassName.shouldHave(Condition.exist);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);

        getPersonalCabinetPage().clickOrders();
        getPersonalCabinetPage().randomCSS_ContainsTable_in_ClassName.shouldHave(Condition.exist);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);

        getPersonalCabinetPage().clickGWSCodesUnlockApplications();
        getPersonalCabinetPage().randomCSS_ContainsTable_in_ClassName.shouldHave(Condition.exist);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);

        /*Unsolved mystery
        sleep(8000);
        getPersonalCabinetPage().clickSupplierManagement();
        element(Selectors.byAttribute("jhitranslate", "supplier.title")).hover();
        actions().moveToElement(element(Selectors.byAttribute("jhitranslate", "supplier.title"))).click().perform();
        element(Selectors.byAttribute("jhitranslate", "supplier.title")).click(ClickOptions.usingJavaScript());
        getPersonalCabinetPage().randomCSS_ContainsTable_in_ClassName.shouldHave(Condition.exist);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
        sleep(8000);*/

    }
}
