package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class Proposals extends BasicTestConditions {

    @Test(groups = "smoke")
    void proposalsCheck() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProposals();

        getPersonalCabinetPage().openSuggestionsAndRemarks();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().suggestionsAndRemarksTitle.shouldHave(Condition.exist, Condition.visible);
        checkThatPageBodyHasTable();

        getPersonalCabinetPage().openListOfProposals();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().listOfProposalsTitle.shouldHave(Condition.exist, Condition.visible);
        checkThatPageBodyHasTable();

        getPersonalCabinetPage().openListOfProposalsForSelection();
        checkIfNoErrorIsDisplayed();
        getPersonalCabinetPage().listOfProposalsForSelectionTitle.shouldHave(Condition.exist, Condition.visible);
        checkThatPageBodyHasTable();
    }
}
