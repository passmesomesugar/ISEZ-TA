package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.elements;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class ListsAndRegisters extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void requests() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openListsRegisters();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().clickListsRegistersRequests();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().listsRegistersRequestsTitle.shouldHave(Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().clickOrders();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().ordersTitle.shouldHave(Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().clickSupplierManagement();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().supplierManagementTitle.shouldHave(Condition.visible);
        checkIfPageBodyHasTable();
        getPersonalCabinetPage().openListsRegisters();

        getPersonalCabinetPage().clickGWSCodesManagement();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
        ElementsCollection tabs = elements(Selectors.byAttribute("role", "tab"));
        tabs.get(1).click();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
        tabs.get(2).click();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
        tabs.get(3).click();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();
        tabs.get(0).click();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openListsRegisters();
        getPersonalCabinetPage().clickGWSCodesUnlockApplications();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().GWSCodesUnlockApplicationsTitle.shouldHave(Condition.visible);
        checkIfPageBodyHasTable();
    }
}
