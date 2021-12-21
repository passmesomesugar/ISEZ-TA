package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Procurements extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void procurementAccess() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().clickProcurements();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().clickProcurementsGraph();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().procurementGraphTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().clickProcurementsList();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().procurementListsTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().clickProcurementTemplates();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().procurementTemplatesTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().clickElectronicShopOrders();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().electronicShopOrdersTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();
    }
}
