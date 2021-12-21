package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Appeals extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void appealsCheck() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeals();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openListOfAppeals();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().appealTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openAppealReports();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().appealReportsTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openCriteriaSettings();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().criteriaSettingsTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openProcurementMonitoringAndAnalysis();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().procurementMonitoringAndAnalysisTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openAppealsTaskList();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().appealsTaskListTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openClarificationsForNPA();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().npaTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();
    }
}
