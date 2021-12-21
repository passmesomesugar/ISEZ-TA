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

    public SelenideElement registrationRequestsTitle = element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.companyRegRequest.home.title"));
    public SelenideElement manageUsersTitle = element(Selectors.byAttribute("jhitranslate", "userManagement.home.title"));
    ;

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

    public void openRegistrationRequests() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.companyRegRequest")).click();
    }

    public void openAdministration() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.admin.main")).click();
    }

    public void openManagingUsers() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.admin.userManagement")).click();
    }

    public void openManagePlanning() {
        element(Selectors.byAttribute("jhitranslate", "plan.planManagement.title")).click();
    }

    public void openManageCompanies() {
        element(Selectors.byAttribute("jhitranslate", "company.title")).click();
    }

    public void openCalendar() {
        element(Selectors.byAttribute("jhitranslate", "weekendHoliday.title")).click();
    }

    public void openTaskExecutionDate() {
        element(Selectors.byAttribute("jhitranslate", "pko.deadline.title")).click();
    }

    public void openReferences() {
        element(Selectors.byAttribute("jhitranslate", "dictionaryEditor.title")).click();

    }

    public void openSupplierManagement() {
        element(Selectors.byAttribute("jhitranslate", "supplier.title")).click();

    }

    public void openProcedureTransfer() {
        element(Selectors.byAttribute("jhitranslate", "advert.management.title")).click();
    }

    public void openTransferredProcurements() {
        element(Selectors.byAttribute("jhitranslate", "advert.management.transfer")).click();
    }

    public void openNotificationsSettings() {
        element(Selectors.byAttribute("jhitranslate", "customizeNotifications.shorTitle")).click();
    }

    public void OpenUnifiedNomenclatureDirectoryofGoodsWorksServices() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.admin.ensTru")).click();
    }

    public void openApproval() {
        element(Selectors.byAttribute("jhitranslate", "workFlow.document.title")).click();
    }

    public void openApprovalRoutesTemplates() {
        element(Selectors.byAttribute("jhitranslate", "workFlow.template.title")).click();
    }


    public void openDocumentsApproval() {
        element(Selectors.byAttribute("jhitranslate", "workFlow.title")).click();
    }

    public void openContracts() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.title")).click();
    }

    public void openContractsGlobalTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.contractGlobalTemplate")).click();
    }

    public void openCustomersIndividualTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.individualCustomerTemplate")).click();
    }


    public void openContractTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.contractTemplate")).click();
    }

    public void openListOfContracts() {
        element(Selectors.byAttribute("jhitranslate", "contractCard.title")).click();
    }

    public void openListOfActs() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.actList")).click();
    }

    public void openCompanysUsers() {
        element(Selectors.byAttribute("jhitranslate", "userManagement.home.companyUsersTitle")).click();
    }

    public void openCompanysProfile() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.companyProfile")).click();
    }

    public void openPurchasingCategorySystemPositions() {
        element(Selectors.byAttribute("jhitranslate", "zksSetting.menu")).click();
    }

    public void openDocuments() {
        element(Selectors.byXpath("//*[@id='company-profile-menu']//..//li//*[@jhitranslate='eProcGatewayApp.tenderDocument.mydocuments']")).click();
    }

    public void openOrganizer() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.organizer")).click();
    }

    public void openPlaceOfProcurementAndDelivery() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.companyProcurementAddress")).click();
    }


    public void openRegistrationData() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.companyRegistrationData")).click();
    }


    public void openOrganizationalStructure() {
        element(Selectors.byAttribute("jhitranslate", "divisions.title")).click();
    }


    public void openBranchOffices() {
        element(Selectors.byAttribute("jhitranslate", "layouts.branches")).click();
    }

    public void openAddNonResident() {
        element(Selectors.byAttribute("jhitranslate", "layouts.addNoResident")).click();
    }

    public void openPriceManagement() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.title")).click();
    }

    public void openPriceList() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.priceList.title")).click();
    }

    public void openMarketingConclusions() {
        element(Selectors.byAttribute("jhitranslate", "marketingСonclusions.title")).click();
    }

    public void openPriceBase() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.priceBase.title")).click();
    }

    public void openReportOnProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.exceededPrice.shortTitle")).click();
    }

    public void openProcurementPlanCorrections() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.economyPrice.shortTitle")).click();
    }

    public void openReportOnPriceList() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.reports.title")).click();
    }

    public void openPriceListCorrections() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.edit.title")).click();
    }

    public void openConsolidatedProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.consolidated-procurement-plan.title")).click();
    }

    public void openRegisterOfPriceSuppliersAndTheirNomenclature() {
        element(Selectors.byAttribute("jhitranslate", "priceNomenclature.title")).click();
    }


    public void openGWSgroups() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.title")).click();
    }


    public void openCommercialOffersOfSuppliers() {
        element(Selectors.byAttribute("jhitranslate", "commercialOffers.suppliersTitle")).click();
    }

    public void openPriceManagementReports() {
        element(Selectors.byAttribute("jhitranslate", "priceNomenclature.reports")).click();
    }

    public void openUnifiedListGWS() {
        element(Selectors.byAttribute("jhitranslate", "unifiedTruList.title")).click();
    }


    public void openFinancialQuotas() {
        element(Selectors.byAttribute("jhitranslate", "commercialOffers.title")).click();
    }

    public void openListOfApplicationsForInclusionInTheUnifiedList() {
        element(Selectors.byAttribute("jhitranslate", "unifiedTruList.applicationList.title")).click();
    }


    public void openpriceCatalog() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.priceCatalog.title")).click();
    }

    public void openPricesCatalogueReport() {
        element(Selectors.byAttribute("jhitranslate", "priceListReport.title")).click();
    }

    public void openReceivedPriceInformation() {
        element(Selectors.byAttribute("jhitranslate", "receivedPricesInformation.title")).click();
    }

    public void openPriceAnalyticsByTimeAndCompany() {
        element(Selectors.byAttribute("jhitranslate", "priceAnalyticsReport.title")).click();
    }

    public void openAccessToTheGWSPriceCatalog() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.priceCatalog.accessTitle")).click();
    }

    public void openInflationIndex() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.priceAnalytics.inflationIndex")).click();
    }
}
