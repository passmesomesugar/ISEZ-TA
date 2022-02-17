package kz.sapasoft.tests.microservices.notification;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NotificationTest extends BasicTestConditions {

    @Test(groups = "test")
    public void openNews(){
        open(MAIN_URL);
        getHomePage().openNews();
        getHomePage().newsRow.shouldBe(Condition.exist);
        checkIfNoErrorIsDisplayed();



    }
}
