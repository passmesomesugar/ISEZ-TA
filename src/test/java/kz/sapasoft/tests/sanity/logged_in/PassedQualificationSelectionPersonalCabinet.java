package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.elements;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class PassedQualificationSelectionPersonalCabinet extends BasicTestConditions {
    @Test(groups = "smoke")
    void passedQualificationSelectionCabinetCheck() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openQualificationSelectionCabinet();
        ElementsCollection sideBarElements = elements(Selectors.byXpath("//button[contains(@class, 'sidebar')]"));

        sideBarElements.get(0).click();
        checkIfNoErrorIsDisplayed();

        sideBarElements.get(1).click();
        checkIfNoErrorIsDisplayed();

        sideBarElements.get(2).click();
        checkIfNoErrorIsDisplayed();

        sideBarElements.get(3).click();
        checkIfNoErrorIsDisplayed();
    }
}
