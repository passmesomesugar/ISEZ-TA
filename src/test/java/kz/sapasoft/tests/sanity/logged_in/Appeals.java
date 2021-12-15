package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Appeals extends BasicTestConditions {
    @Test(groups = "this", description = "")
    void appealsCheck() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openAppeals();

        getPersonalCabinetPage().openListOfAppeals();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().appealTitle.shouldHave(Condition.exist, Condition.visible);
        checkTableInPageBody();

        getPersonalCabinetPage().openAppealReports();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().appealReportsTitle.shouldHave(Condition.exist, Condition.visible);
        checkTableInPageBody();

        getPersonalCabinetPage().openCriteriaSettings();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().criteriaSettingsTitle.shouldHave(Condition.exist, Condition.visible);
        checkTableInPageBody();

        getPersonalCabinetPage().openProcurementMonitoringAndAnalysis();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().procurementMonitoringAndAnalysisTitle.shouldHave(Condition.exist, Condition.visible);
        checkTableInPageBody();

        getPersonalCabinetPage().openAppealsTaskList();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().appealsTaskListTitle.shouldHave(Condition.exist, Condition.visible);
        checkTableInPageBody();

        getPersonalCabinetPage().openClarificationsForNPA();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().npaTitle.shouldHave(Condition.exist, Condition.visible);
        checkTableInPageBody();

        getPersonalCabinetPage().logOut();
    }
}
