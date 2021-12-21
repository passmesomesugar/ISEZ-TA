package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.elements;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class PassedQualificationSelectionNew extends BasicTestConditions {
    @Test(groups = "smoke")
    void passedQualificationSelectionNewCheck() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openQualifiedNew();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openTasks();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().tasksTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openSupplierRecord();
        checkIfNoErrorIsDisplayed();

        getPersonalCabinetPage().openAuditorsAssessment();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().potentialSupplierSatisfactionRate.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openReports();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().reportsTitle.shouldHave(Condition.exist, Condition.visible);
        ElementsCollection elementsCollection = elements(Selectors.byXpath("//*[@jhitranslate='components.select.selectItem']/../*"));
        elementsCollection.get(1).click();
        checkIfPageBodyHasTable();
        elementsCollection.get(2).click();
        checkIfPageBodyHasTable();
        elementsCollection.get(3).click();
        checkIfPageBodyHasTable();
        elementsCollection.get(5).click();
        checkIfPageBodyHasTable();
        elementsCollection.get(6).click();
        checkIfPageBodyHasTable();
        elementsCollection.get(7).click();
        checkIfPageBodyHasTable();

        getPersonalCabinetPage().openMonitoring();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().monitoringTitle.shouldHave(Condition.exist, Condition.visible);
        checkIfPageBodyHasTable();
    }
}
