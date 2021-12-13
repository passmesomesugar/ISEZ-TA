package kz.sapasoft.tests.sanity;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.UserManager.getCustomerOne;

public class CustomerFeedbackForm extends BasicTestConditions {
    @Test(groups = "smoke", description = "")
    void feedbackForm() {
        getHomePage().logIn(getCustomerOne().getName(), getCustomerOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        element(Selectors.byAttribute("jhitranslate", "eProcGatewayApp.button-title")).shouldHave(Condition.visible);
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
    }
}
