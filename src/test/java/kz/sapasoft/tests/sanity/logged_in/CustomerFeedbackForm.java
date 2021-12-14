package kz.sapasoft.tests.sanity.logged_in;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerTwo;

public class CustomerFeedbackForm extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void feedbackForm() {
        getHomePage().logIn(getCustomerTwo().getName(), getCustomerTwo().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.button-title")).shouldHave(Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
    }
}
