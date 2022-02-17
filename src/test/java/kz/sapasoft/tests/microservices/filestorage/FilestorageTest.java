package kz.sapasoft.tests.microservices.filestorage;

import com.codeborne.selenide.Condition;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FilestorageTest extends BasicTestConditions {

    @Test(groups = "test")
    public void fileStrageTest(){
        open(MAIN_URL);
        getHomePage().openSearchPlans();
        getHomePage().exportPlans();
        getHomePage().exportInfo.shouldBe(Condition.visible);
        getHomePage().downloadPlan.click();
        checkIfNoErrorIsDisplayed();
    }
}
