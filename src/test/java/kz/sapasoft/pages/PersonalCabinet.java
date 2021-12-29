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

    public SelenideElement aboutCompany = element(Selectors.byAttribute("jhitranslate", "layouts.aboutCompany"));

    public void openProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "layouts.planAdvert")).click();
    }

    public void openPersonalCabinet() {
        open(PERSONAL_CABINET);
        logger.info("openPersonalCabinet");
    }

    public void openBankWarranty() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.title")).click();
        logger.info("openBankWarranty");
    }

    public void openBankWarrantyList() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.list")).click();
        logger.info("openBankWarrantyList");
    }

    public void openAppeals() {
        element(Selectors.byAttribute("jhitranslate", "appeal.title")).click();
        logger.info("openAppeals");
    }

    public void openListOfAppeals() {
        element(Selectors.byAttribute("jhitranslate", "appeal.listOfAppeal")).click();
        logger.info("openListOfAppeals");
    }

    public void openListOfRequests() {
        element(Selectors.byAttribute("jhitranslate", "criterias.tasks.titleNotSkb")).click();
        logger.info("openListOfRequests");
    }

    public void openClarificationsForNPA() {
        element(Selectors.byAttribute("jhitranslate", "npa.clarifications")).click();
        logger.info("openClarificationsForNPA");
    }

    public void openListsRegisters() {
        element(Selectors.byAttribute("jhitranslate", "nsi.title")).click();
        logger.info("openListsRegisters");
    }

    public void clickListsRegistersRequests() {
        element(Selectors.byAttribute("jhitranslate", "nsi.subTitle1")).click();
        logger.info("clickListsRegistersRequests");
    }

    public void clickOrders() {
        element(Selectors.byAttribute("jhitranslate", "nsi.decree.titleShort")).click();
        logger.info("clickOrders");
    }

    public void clickSupplierManagement() {
        element(Selectors.byXpath("//*[contains(@routerlink,'nsi')]//*[@jhitranslate='supplier.title']")).click();
        logger.info("clickSupplierManagement");
    }

    public void clickGWSCodesUnlockApplications() {
        element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.truCodeApplications")).click();
        logger.info("clickGWSCodesUnlockApplications");
    }

    public void clickProcurements() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advert")).click();
        logger.info("clickProcurements");
    }

    public void clickProcurementsGraph() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advertSchedule")).click();
        logger.info("clickProcurementsGraph");
    }

    public void clickProcurementsList() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advertList")).click();
        logger.info("clickProcurementsList");
    }

    public void clickProcurementTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.commissionTemplate")).click();
        logger.info("clickProcurementTemplates");
    }

    public void clickElectronicShopOrders() {
        element(Selectors.byAttribute("jhitranslate", "eshopOrder.title")).click();
        logger.info("clickElectronicShopOrders");
    }

    public void logOut() {
        open(PERSONAL_CABINET);
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.logout")).click();
        logger.info("log out for:" + this.getClass().toString());
    }

    public void openBankWarrantyReport() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.report.title")).click();
        logger.info("openBankWarrantyReport");
    }

    public void clickGWSCodesManagement() {
        element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.title")).click();
        logger.info("clickGWSCodesManagement");
    }

    public void openAppealReports() {
        element(Selectors.byAttribute("jhitranslate", "appeal.reportTitle")).click();
        logger.info("openAppealReports");
    }

    public void openCriteriaSettings() {
        element(Selectors.byAttribute("jhitranslate", "criterias.setting.settingMCTitleShort")).click();
        logger.info("openCriteriaSettings");
    }

    public void openProcurementMonitoringAndAnalysis() {
        element(Selectors.byAttribute("jhitranslate", "criterias.monitoring.title")).click();
        logger.info("openProcurementMonitoringAndAnalysis");
    }

    public void openAppealsTaskList() {
        element(Selectors.byXpath("//li//*[@jhitranslate='criterias.tasks.title']")).click();
        logger.info("openAppealsTaskList");
    }

    public void openProposals() {
        element(Selectors.byAttribute("jhitranslate", "layouts.bid")).click();
        logger.info("openProposals");
    }

    public void openSuggestionsAndRemarks() {
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.discussion.home.user-title")).click();
        logger.info("openSuggestionsAndRemarks");
    }

    public void openListOfProposals() {
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.participation.title")).click();
        logger.info("openListOfProposals");
    }

    public void openListOfProposalsForSelection() {
        element(Selectors.byAttribute("jhitranslate", "applications.title")).click();
        logger.info("openListOfProposalsForSelection");
    }

    public void openQualified() {
        element(Selectors.byAttribute("jhitranslate", "pko.title")).click();
        logger.info("openQualified");
    }

    public void openApplications() {
        element(Selectors.byAttribute("jhitranslate", "pko.application.title")).click();
        logger.info("openApplications");
    }

    public void openRequestsForCommercialOffers() {
        element(Selectors.byAttribute("jhitranslate", "pko.commercialOffer.title")).click();
        logger.info("openRequestsForCommercialOffers");
    }

    public void openQualifiedNew() {
        element(Selectors.byAttribute("jhitranslate", "newPko.title")).click();
        logger.info("openQualifiedNew");
    }

    public void openTasks() {
        element(Selectors.byAttribute("jhitranslate", "newPko.executions.title")).click();
        logger.info("openTasks");
    }

    public void openSupplierRecord() {
        element(Selectors.byAttribute("jhitranslate", "pkoSupplierExclusion.title")).click();
        logger.info("openSupplierRecord");
    }

    public void openAuditorsAssessment() {
        element(Selectors.byAttribute("jhitranslate", "newPko.auditorRating.title")).click();
        logger.info("openAuditorsAssessment");
    }

    public void openReports() {
        element(Selectors.byAttribute("jhitranslate", "newPko.reports.title")).click();
        logger.info("openReports");
    }

    public void openMonitoring() {
        element(Selectors.byAttribute("jhitranslate", "newPko.monitoring.title")).click();
        logger.info("openMonitoring");
    }

    public void openQualificationSelectionCabinet() {
        element(Selectors.byAttribute("jhitranslate", "newPko.cabinet")).click();
        logger.info("openQualificationSelectionCabinet");
    }

    public void openRegistrationRequests() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.companyRegRequest")).click();
        logger.info("openRegistrationRequests");
    }

    public void openAdministration() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.admin.main")).click();
        logger.info("openAdministration");
    }

    public void openManagingUsers() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.admin.userManagement")).click();
        logger.info("openManagingUsers");
    }

    public void openManagePlanning() {
        element(Selectors.byAttribute("jhitranslate", "plan.planManagement.title")).click();
        logger.info("openManagePlanning");
    }

    public void openManageCompanies() {
        element(Selectors.byAttribute("jhitranslate", "company.title")).click();
        logger.info("openManageCompanies");
    }

    public void openCalendar() {
        element(Selectors.byAttribute("jhitranslate", "weekendHoliday.title")).click();
        logger.info("openCalendar");
    }

    public void openTaskExecutionDate() {
        element(Selectors.byAttribute("jhitranslate", "pko.deadline.title")).click();
        logger.info("openTaskExecutionDate");
    }

    public void openReferences() {
        element(Selectors.byAttribute("jhitranslate", "dictionaryEditor.title")).click();
        logger.info("openReferences");

    }

    public void openSupplierManagement() {
        element(Selectors.byAttribute("jhitranslate", "supplier.title")).click();
        logger.info("openSupplierManagement");

    }

    public void openProcedureTransfer() {
        element(Selectors.byAttribute("jhitranslate", "advert.management.title")).click();
        logger.info("openProcedureTransfer");
    }

    public void openTransferredProcurements() {
        element(Selectors.byAttribute("jhitranslate", "advert.management.transfer")).click();
        logger.info("openTransferredProcurements");
    }

    public void openNotificationsSettings() {
        element(Selectors.byAttribute("jhitranslate", "customizeNotifications.shorTitle")).click();
        logger.info("openNotificationsSettings");
    }

    public void OpenUnifiedNomenclatureDirectoryofGoodsWorksServices() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.admin.ensTru")).click();
        logger.info("OpenUnifiedNomenclatureDirectoryofGoodsWorksServices");
    }

    public void openApproval() {
        element(Selectors.byAttribute("jhitranslate", "workFlow.document.title")).click();
        logger.info("openApproval");
    }

    public void openApprovalRoutesTemplates() {
        element(Selectors.byAttribute("jhitranslate", "workFlow.template.title")).click();
        logger.info("openApprovalRoutesTemplates");
    }


    public void openDocumentsApproval() {
        element(Selectors.byXpath("//*[@id='kuz-menu']//..//*[@jhitranslate='workFlow.title']")).click();
        logger.info("openDocumentsApproval");
    }

    public void openContracts() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.title")).click();
        logger.info("openContracts");
    }

    public void openContractsGlobalTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.contractGlobalTemplate")).click();
        logger.info("openContractsGlobalTemplates");
    }

    public void openCustomersIndividualTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.individualCustomerTemplate")).click();
        logger.info("openCustomersIndividualTemplates");
    }

    public void openContractTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.contractTemplate")).click();
        logger.info("openContractTemplates");
    }

    public void openListOfContracts() {
        element(Selectors.byAttribute("jhitranslate", "contractCard.title")).click();
        logger.info("openListOfContracts");
    }

    public void openListOfActs() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.contract.actList")).click();
        logger.info("openListOfActs");
    }

    public void openCompanysUsers() {
        element(Selectors.byAttribute("jhitranslate", "userManagement.home.companyUsersTitle")).click();
        logger.info("openCompanysUsers");
    }

    public void openCompanysProfile() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.companyProfile")).click();
        logger.info("openCompanysProfile");
    }

    public void openPurchasingCategorySystemPositions() {
        element(Selectors.byAttribute("jhitranslate", "zksSetting.menu")).click();
        logger.info("openPurchasingCategorySystemPositions");
    }

    public void openDocuments() {
        element(Selectors.byXpath("//*[@id='company-profile-menu']//..//li//*[@jhitranslate='eProcGatewayApp.tenderDocument.mydocuments']")).click();
        logger.info("openDocuments");
    }

    public void openOrganizer() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.organizer")).click();
        logger.info("openOrganizer");
    }

    public void openPlaceOfProcurementAndDelivery() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.companyProcurementAddress")).click();
        logger.info("openPlaceOfProcurementAndDelivery");
    }


    public void openRegistrationData() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.companyRegistrationData")).click();
        logger.info("openRegistrationData");
    }


    public void openOrganizationalStructure() {
        element(Selectors.byAttribute("jhitranslate", "divisions.title")).click();
        logger.info("openOrganizationalStructure");
    }


    public void openBranchOffices() {
        element(Selectors.byAttribute("jhitranslate", "layouts.branches")).click();
        logger.info("openBranchOffices");
    }


    public void openAddNonResident() {
        element(Selectors.byAttribute("jhitranslate", "layouts.addNoResident")).click();
        logger.info("openAddNonResident");
    }

    public void openPriceManagement() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.title")).click();
        logger.info("openPriceManagement");
    }

    public void openPriceList() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.priceList.title")).click();
        logger.info("openPriceList");
    }

    public void openMarketingConclusions() {
        element(Selectors.byAttribute("jhitranslate", "marketingСonclusions.title")).click();
        logger.info("openMarketingConclusions");
    }

    public void openPriceBase() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.priceBase.title")).click();
        logger.info("openPriceBase");
    }

    public void openReportOnProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.exceededPrice.shortTitle")).click();
        logger.info("openReportOnProcurementPlan");
    }

    public void openProcurementPlanCorrections() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.economyPrice.shortTitle")).click();
        logger.info("openProcurementPlanCorrections");
    }

    public void openReportOnPriceList() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.reports.title")).click();
        logger.info("openReportOnPriceList");
    }

    public void openPriceListCorrections() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.edit.title")).click();
        logger.info("openPriceListCorrections");
    }

    public void openConsolidatedProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "priceManagement.consolidated-procurement-plan.title")).click();
        logger.info("openConsolidatedProcurementPlan");
    }

    public void openRegisterOfPriceSuppliersAndTheirNomenclature() {
        element(Selectors.byAttribute("jhitranslate", "priceNomenclature.title")).click();
        logger.info("openRegisterOfPriceSuppliersAndTheirNomenclature");
    }


    public void openGWSgroups() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.title")).click();
        logger.info("openGWSgroups");
    }


    public void openCommercialOffersOfSuppliers() {
        element(Selectors.byAttribute("jhitranslate", "commercialOffers.suppliersTitle")).click();
        logger.info("openCommercialOffersOfSuppliers");
    }

    public void openPriceManagementReports() {
        element(Selectors.byAttribute("jhitranslate", "priceNomenclature.reports")).click();
        logger.info("openPriceManagementReports");
    }

    public void openUnifiedListGWS() {
        element(Selectors.byAttribute("jhitranslate", "unifiedTruList.title")).click();
        logger.info("openUnifiedListGWS");
    }


    public void openFinancialQuotas() {
        element(Selectors.byAttribute("jhitranslate", "commercialOffers.title")).click();
        logger.info("openFinancialQuotas");
    }

    public void openListOfApplicationsForInclusionInTheUnifiedList() {
        element(Selectors.byAttribute("jhitranslate", "unifiedTruList.applicationList.title")).click();
        logger.info("openListOfApplicationsForInclusionInTheUnifiedList");
    }

    public void openpriceCatalog() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.priceCatalog.title")).click();
        logger.info("openpriceCatalog");
    }

    public void openPricesCatalogueReport() {
        element(Selectors.byAttribute("jhitranslate", "priceListReport.title")).click();
        logger.info("openPricesCatalogueReport");
    }

    public void openReceivedPriceInformation() {
        element(Selectors.byAttribute("jhitranslate", "receivedPricesInformation.title")).click();
        logger.info("openReceivedPriceInformation");
    }

    public void openPriceAnalyticsByTimeAndCompany() {
        element(Selectors.byAttribute("jhitranslate", "priceAnalyticsReport.title")).click();
        logger.info("openPriceAnalyticsByTimeAndCompany");
    }

    public void openAccessToTheGWSPriceCatalog() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.priceCatalog.accessTitle")).click();
        logger.info("openAccessToTheGWSPriceCatalog");
    }

    public void openInflationIndex() {
        element(Selectors.byAttribute("jhitranslate", "truGroup.priceAnalytics.inflationIndex")).click();
        logger.info("openInflationIndex");
    }

    public void openCMP() {
        element(Selectors.byAttribute("jhitranslate", "kuz.title")).click();
        logger.info("openCMP");
    }

    public void openListOfCategories() {
        element(Selectors.byAttribute("jhitranslate", "kuz.ppk.title")).click();
        logger.info("openListOfCategories");
    }

    public void openZKS() {
        element(Selectors.byAttribute("jhitranslate", "kuz.strategies.title")).click();
        logger.info("openZKS");
    }

    public void GWSCodesManagement() {
        element(Selectors.byAttribute("jhitranslate", "kuz.locks.title")).click();
        logger.info("GWSCodesManagement");
    }

    public void openMethodology() {
        element(Selectors.byAttribute("jhitranslate", "kuz.regulation.title")).click();
        logger.info("openMethodology");
    }

    public void openSupplierSelection() {
        element(Selectors.byAttribute("jhitranslate", "announcement.title")).click();
        logger.info("openSupplierSelection");
    }

    public void openPersonalCabinetReports() {
        element(Selectors.byAttribute("jhitranslate", "reports.reports")).click();
        logger.info("openPersonalCabinetReports");
    }

    public void openReportsExports() {
        element(Selectors.byAttribute("jhitranslate", "reports.titleExport")).click();
        logger.info("openReportsExports");
    }

    public void openReportSubmissionDeadline() {
        element(Selectors.byAttribute("jhitranslate", "reports.titleDeadlines")).click();
        logger.info("openReportSubmissionDeadline");
    }

    public void openReportSubmission() {
        element(Selectors.byAttribute("jhitranslate", "reports.titleSubmission")).click();
        logger.info("openReportSubmission");
    }

    public void openPlanExecutionReport() {
        element(Selectors.byAttribute("jhitranslate", "layouts.planExecutionReport")).click();
        logger.info("openPlanExecutionReport");
    }

    public void openArchive() {
        element(Selectors.byAttribute("jhitranslate", "mzso.title")).click();
        logger.info("openArchive");
    }

    public void openArchiveProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "mzso.plan.title")).click();
        logger.info("openArchiveProcurementPlan");
    }

    public void openArchiveContracts() {
        element(Selectors.byAttribute("jhitranslate", "mzso.contract.title")).click();
        logger.info("openArchiveContracts");
    }

    public void openPQSAdministration() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.pko-administration")).click();
        logger.info("openPQSAdministration");
    }

    public void openConstructor() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.pkoAdministration.constructor")).click();
        logger.info("openConstructor");
    }

    public void openCategoryReference() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.pkoAdministration.categoryDictionary")).click();
        logger.info("openCategoryReference");
    }

    public void openRequirementsReference() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.pkoAdministration.requirementsDictionary")).click();
        logger.info("openRequirementsReference");
    }

    public void openAttributeReference() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.pkoAdministration.attributesDictionary")).click();
        logger.info("openAttributeReference");
    }

    public void changeOfRate() {
        element(Selectors.byAttribute("jhitranslate", "pko.tariff.title")).click();
        logger.info("changeOfRate");
    }

    public void openStrategicPartnersList() {
        element(Selectors.byAttribute("jhitranslate", "strategicPartners.title")).click();
        logger.info("openStrategicPartnersList");
    }

    public void openTaskExecutionPeriod() {
        element(Selectors.byAttribute("jhitranslate", "newPko.deadlineControl.title")).click();
        logger.info("openTaskExecutionPeriod");
    }

    public void openReferencesInAdministration() {
        element(Selectors.byXpath("//*[@id='pko-administration-menu']//..//..//*[@jhitranslate='dictionaryEditor.title']"));
        logger.info("openReferencesInAdministration");
    }

    public void openSurvey() {
        element(Selectors.byAttribute("jhitranslate", "poll.title")).click();
        logger.info("openSurvey");
    }

    public void openQuestionnaire() {
        element(Selectors.byAttribute("jhitranslate", "poll.questionnaire.title")).click();
        logger.info("openQuestionnaire");
    }

    public void openLocalContent() {
        element(Selectors.byAttribute("jhitranslate", "kmz.title")).click();
        logger.info("openLocalContent");
    }

    public void openNotifications() {
        element(Selectors.byAttribute("jhitranslate", "layouts.notifications")).click();
        logger.info("openNotifications");
    }

    public void openProfileSettings() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.settings")).click();
        logger.info("openProfileSettings");
    }

    public void openPassword() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.password")).click();
        logger.info("openPassword");
    }

    public void openDocumentsInPersonalCabinet() {
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.tenderDocument.mydocuments")).click();
        logger.info("openDocumentsInPersonalCabinet");
    }

    public void openAboutCompany() {
        element(Selectors.byAttribute("jhitranslate", "layouts.aboutCompany")).click();
        logger.info("openAboutCompany");
    }

    public void openDocumentsApprovalForApproval() {
        element(Selectors.byXpath("//*[@id='purchase-menu']//..//..//*[@jhitranslate='workFlow.title']")).click();
        logger.info("openDocumentsApprovalForApproval");
    }
}
