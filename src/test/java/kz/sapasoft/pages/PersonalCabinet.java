package kz.sapasoft.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import kz.sapasoft.services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class PersonalCabinet extends PagesManager {

    public String PERSONAL_CABINET =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("personal.cabinet");

    public SelenideElement warrantyTitle = element(Selectors.byAttribute("jhitranslate", "bankWarranty.titleFull"));

    public SelenideElement warrantyReportTitle = element(Selectors.byAttribute("jhitranslate", "bankWarranty.report.report1.title"));

    public SelenideElement appealTitle = element(Selectors.byAttribute("jhitranslate", "appeal.title"));

    public SelenideElement search = element(Selectors.byAttribute("jhitranslate", "bankWarranty.search"));

    public SelenideElement randomCSS_ContainsTable_in_ClassName = element(Selectors.byXpath("//div[contains(@class, 'table')]"));

    public SelenideElement appealReportsTitle = element(Selectors.byAttribute("jhitranslate", "appeal.reportTitle"));

    public SelenideElement criteriaSettingsTitle = element(Selectors.byAttribute("jhitranslate", "criterias.setting.settingMCTitle"));

    public SelenideElement procurementMonitoringAndAnalysisTitle = element(Selectors.byAttribute("jhitranslate", "criterias.monitoring.title"));

    public SelenideElement appealsTaskListTitle = element(Selectors.byXpath("//h2//span[@jhitranslate='criterias.tasks.title']"));

    public SelenideElement npaTitle = element(Selectors.byAttribute("jhitranslate", "npa.title"));

    public SelenideElement listsRegistersRequestsTitle = element(Selectors.byAttribute("jhitranslate", "nsi.claim.title"));

    public SelenideElement ordersTitle = element(Selectors.byAttribute("jhitranslate", "nsi.decree.title"));

    public SelenideElement supplierManagementTitle = element(Selectors.byXpath("//h2/span[@jhitranslate='supplier.title']"));

    public SelenideElement GWSCodesUnlockApplicationsTitle = element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.truCodeApplications"));

    public SelenideElement suggestionsAndRemarksTitle = element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.discussion.home.user-title"));

    public SelenideElement listOfProposalsTitle = element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.participation.title"));

    public SelenideElement listOfProposalsForSelectionTitle = element(Selectors.byAttribute("jhitranslate", "applications.title"));

    public SelenideElement applicationsTitle = element(Selectors.byAttribute("jhitranslate", "pko.application.title"));

    public SelenideElement requestsForCommercialOffersTitle = element(Selectors.byAttribute("jhitranslate", "pko.commercialOffer.title"));

    public SelenideElement tasksTitle = element(Selectors.byAttribute("jhitranslate", "newPko.executions.title"));

    public SelenideElement potentialSupplierSatisfactionRate = element(Selectors.byAttribute("jhitranslate", "pkoCabinet.supplierRate.title"));

    public SelenideElement reportsTitle = element(Selectors.byAttribute("jhitranslate", "pko.absent.title"));

    public SelenideElement monitoringTitle = element(Selectors.byAttribute("jhitranslate", "newPko.monitoring.fullTitle"));

    public SelenideElement procurementGraphTitle = element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.procurementSchedule.title"));

    public SelenideElement procurementListsTitle = element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.advert.home.title-adverts"));

    public SelenideElement procurementTemplatesTitle = element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.commissionTemplate.home.title"));

    public SelenideElement electronicShopOrdersTitle = element(Selectors.byAttribute("jhitranslate", "eshopOrder.title"));

    public void openProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "layouts.planAdvert")).click();
    }

    public void openPersonalCabinet() {
        open(PERSONAL_CABINET);
    }

    public void openBankWarranty() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.title")).click();
    }

    public void openBankWarrantyList() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.list")).click();
    }

    public void openAppeals() {
        element(Selectors.byAttribute("jhitranslate", "appeal.title")).click();
    }

    public void openListOfAppeals() {
        element(Selectors.byAttribute("jhitranslate", "appeal.listOfAppeal")).click();
    }

    public void openListOfRequests() {
        element(Selectors.byAttribute("jhitranslate", "criterias.tasks.titleNotSkb")).click();
    }

    public void openClarificationsForNPA() {
        element(Selectors.byAttribute("jhitranslate", "npa.clarifications")).click();
    }

    public void openListsRegisters() {
        element(Selectors.byAttribute("jhitranslate", "nsi.title")).click();
        logger.info("openListRegister");
    }

    public void clickListsRegistersRequests() {
        element(Selectors.byAttribute("jhitranslate", "nsi.subTitle1")).click();
    }

    public void clickOrders() {
        element(Selectors.byAttribute("jhitranslate", "nsi.decree.titleShort")).click();
    }

    public void clickSupplierManagement() {
        element(Selectors.byXpath("//*[contains(@routerlink,'nsi')]//*[@jhitranslate='supplier.title']")).click();
    }

    public void clickGWSCodesUnlockApplications() {
        element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.truCodeApplications")).click();
    }

    public void clickProcurements() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advert")).click();
    }

    public void clickProcurementsGraph() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advertSchedule")).click();
    }

    public void clickProcurementsList() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advertList")).click();
    }

    public void clickProcurementTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.commissionTemplate")).click();
    }

    public void clickElectronicShopOrders() {
        element(Selectors.byAttribute("jhitranslate", "eshopOrder.title")).click();
    }

    public void logOut() {
        open(PERSONAL_CABINET);
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.logout")).click();
        logger.info("log out for:" + this.getClass().toString());
    }

    public void openBankWarrantyReport() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.report.title")).click();
    }

    public void clickGWSCodesManagement() {
        element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.title")).click();
    }

    public void openAppealReports() {
        element(Selectors.byAttribute("jhitranslate", "appeal.reportTitle")).click();
    }

    public void openCriteriaSettings() {
        element(Selectors.byAttribute("jhitranslate", "criterias.setting.settingMCTitleShort")).click();
    }

    public void openProcurementMonitoringAndAnalysis() {
        element(Selectors.byAttribute("jhitranslate", "criterias.monitoring.title")).click();
    }

    public void openAppealsTaskList() {
        element(Selectors.byXpath("//li//*[@jhitranslate='criterias.tasks.title']")).click();
    }

    public void openProposals() {
        element(Selectors.byAttribute("jhitranslate", "layouts.bid")).click();
    }

    public void openSuggestionsAndRemarks() {
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.discussion.home.user-title")).click();
    }

    public void openListOfProposals() {
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.participation.title")).click();
    }

    public void openListOfProposalsForSelection() {
        element(Selectors.byAttribute("jhitranslate", "applications.title")).click();
    }

    public void openQualified() {
        element(Selectors.byAttribute("jhitranslate", "pko.title")).click();
    }

    public void openApplications() {
        element(Selectors.byAttribute("jhitranslate", "pko.application.title")).click();
    }

    public void openRequestsForCommercialOffers() {
        element(Selectors.byAttribute("jhitranslate", "pko.commercialOffer.title")).click();
    }

    public void openQualifiedNew() {
        element(Selectors.byAttribute("jhitranslate", "newPko.title")).click();
    }

    public void openTasks() {
        element(Selectors.byAttribute("jhitranslate", "newPko.executions.title")).click();
    }

    public void openSupplierRecord() {
        element(Selectors.byAttribute("jhitranslate", "pkoSupplierExclusion.title")).click();
    }

    public void openAuditorsAssessment() {
        element(Selectors.byAttribute("jhitranslate", "newPko.auditorRating.title")).click();
    }

    public void openReports() {
        element(Selectors.byAttribute("jhitranslate", "newPko.reports.title")).click();
    }

    public void openMonitoring() {
        element(Selectors.byAttribute("jhitranslate", "newPko.monitoring.title")).click();
    }

    public void openQualificationSelectionCabinet() {
        element(Selectors.byAttribute("jhitranslate", "newPko.cabinet")).click();
    }
}
