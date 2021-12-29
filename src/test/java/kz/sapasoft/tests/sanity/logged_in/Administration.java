package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Administration extends BasicTestConditions {
    @Test(groups = "this")
    void checkAdmin() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAdministration();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openManagingUsers();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().manageUsersTitle.shouldHave(Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openManagePlanning();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openManageCompanies();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openCalendar();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openTaskExecutionDate();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openReferences();
        getPersonalCabinetPage().openAdministration();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openSupplierManagement();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openProcedureTransfer();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openTransferredProcurements();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openNotificationsSettings();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().OpenUnifiedNomenclatureDirectoryofGoodsWorksServices();
        checkIfNoErrorIsDisplayed();
    }
}
