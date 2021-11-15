package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class CreateAndRemoveProcurementPlanTest extends BasicTestConditions {

    public String testingScenario = System.getProperty("scenario");
    public String PLAN_URL = PropertyDataReader.getProperties(currentTestingEnv).getProperty("procurement.plan.url");
    public String year = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.plan.year");
    public String planType = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.plan.type");
    public String planTimeFrame = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.time.frame");

    @Test(groups = "this")
    void createProcurementPlanAndPositionTest() {
        openHomeAndLogin();
        logger.info("Execution started for:" + this.getClass().toString());
        open(PERSONAL_CABINET);
        element(Selectors.byXpath("//span[text()='План закупок']")).click();
        element(Selectors.byXpath("//span[text()='Создать план закупок']")).click();
        element(Selectors.byXpath("//select[contains(.,'" + year + "')]")).selectOptionContainingText(year);
        element(Selectors.byXpath("//select[contains(.,'" + planType + "')]")).selectOptionContainingText(planType);
        element(Selectors.byXpath("//select[contains(.,'" + planTimeFrame + "')]")).selectOptionContainingText(planTimeFrame);
        element(Selectors.byXpath("//span[text()='Сохранить']")).click();

        open(PLAN_URL);
        element(Selectors.byXpath("//button[text()='Действия']")).shouldHave(Condition.visible);
        element(Selectors.byXpath("//button[text()='Действия']")).click();
        element(Selectors.byXpath("//button[text()='Удалить']")).click();
        element(Selectors.byXpath("//span[text()='Удалить']")).click();
        logger.info("Execution ended for:" + this.getClass().toString());
    }
}
