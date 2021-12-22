package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.elements;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class PriceManagement extends BasicTestConditions {
    @Test(groups = "smoke")
    void priceManagementSanity() {

        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openPriceManagement();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPriceList();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openMarketingConclusions();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openPriceBase();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openReportOnProcurementPlan();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openProcurementPlanCorrections();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openReportOnPriceList();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openPriceListCorrections();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openConsolidatedProcurementPlan();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openRegisterOfPriceSuppliersAndTheirNomenclature();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();


        getPersonalCabinetPage().openGWSgroups();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openCommercialOffersOfSuppliers();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openPriceManagementReports();
        ElementsCollection reportMenuDropdownElements = elements(Selectors.byXpath("//*[@jhitranslate='priceAnalyticsReport.title']//../a"));

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(0).click();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(1).click();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();


        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(2).click();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(3).click();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(4).click();
        checkIfNoErrorIsDisplayed();


        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(5).click();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(6).click();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openPriceManagementReports();
        reportMenuDropdownElements.get(7).click();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPriceManagement();
        getPersonalCabinetPage().openUnifiedListGWS();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();


        getPersonalCabinetPage().openFinancialQuotas();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openListOfApplicationsForInclusionInTheUnifiedList();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openpriceCatalog();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openAccessToTheGWSPriceCatalog();
        checkIfNoErrorIsDisplayed();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openInflationIndex();
        checkIfNoErrorIsDisplayed();
    }
}
