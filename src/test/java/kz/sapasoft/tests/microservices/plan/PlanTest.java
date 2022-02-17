package kz.sapasoft.tests.microservices.plan;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class PlanTest extends BasicTestConditions {

    @Test(groups = "test")
    public void planTest(){
        open(MAIN_URL);
        getHomePage().openSearchPlans();
        getHomePage().exportPlans();
        getHomePage().exportInfo.shouldBe(Condition.visible);
        checkIfNoErrorIsDisplayed();
    }

}
