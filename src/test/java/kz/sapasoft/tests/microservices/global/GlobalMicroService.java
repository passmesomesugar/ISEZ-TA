package kz.sapasoft.tests.microservices.global;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.elements;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class GlobalMicroService extends BasicTestConditions {
    @Test(groups = "this1")
    void globalTest() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProcurementPlan();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openBankWarranty();
        getPersonalCabinetPage().openBankWarrantyList();
        checkIfNoErrorIsDisplayed();
        ElementsCollection warrantyReportStatusDropdownElements = elements(Selectors.byXpath("//*[@jhitranslate='components.select.selectItem']/../*"));
        logger.info("warrantyReportStatusDropdownElements:" + warrantyReportStatusDropdownElements.size());
        Random random = new Random();
        warrantyReportStatusDropdownElements.get(random.nextInt(warrantyReportStatusDropdownElements.size())).click();
        getPersonalCabinetPage().clickSearchInBankWarranty();
        checkIfPageBodyHasTable();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openBankWarrantyReport();

    }
}
