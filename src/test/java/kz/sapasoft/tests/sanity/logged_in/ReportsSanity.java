package kz.sapasoft.tests.sanity.logged_in;

import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class ReportsSanity extends BasicTestConditions {
    @Test(groups = "smoke")
    void reportsSanity() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openPersonalCabinetReports();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openReportsExports();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openReportSubmissionDeadline();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openReportSubmission();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openPlanExectuionReport();
        checkIfNoErrorIsDisplayed();
    }
}
