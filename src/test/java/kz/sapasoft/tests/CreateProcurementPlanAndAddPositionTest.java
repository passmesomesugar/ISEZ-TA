package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;

public class CreateProcurementPlanAndAddPositionTest extends BasicTestConditions {
    public String SEARCH_QUERY_PROCUREMENT_CODE = "101315.930.000000";
    int LOAD_PAUSE = 4000;
    int MINI_LOAD_PAUSE = 2000;
    String PLAN_URL = PropertyDataReader.getProperties(currentTestingEnv).getProperty("procurement.plan.url");

    @Test(groups = "this")
    void createProcurementPlanAndPositionTest() {
        openHomeAndLogin();
        logger.info("Execution started for:" + this.getClass().toString());
        open(PERSONAL_CABINET);
        element(Selectors.byXpath("//span[text()='План закупок']")).click();
        sleep(MINI_LOAD_PAUSE);
        element(Selectors.byXpath("//span[text()='Создать план закупок']")).click();
        element(Selectors.byXpath("//select[contains(.,'Основной план')]")).selectOptionContainingText("Основной план");
        element(Selectors.byXpath("//select[contains(.,'Годовой')]")).selectOptionContainingText("Годовой");
        element(Selectors.byXpath("//span[text()='Сохранить']")).click();
        element(Selectors.byXpath("//button[text()='Действия']")).click();
        element(Selectors.byXpath("//button[text()='Посмотреть пункты плана']")).click();
        element(Selectors.byXpath("//span[text()='Создать строку плана']")).click();
        sleep(LOAD_PAUSE);
        actions().click(element(Selectors.byXpath("//label[contains(.,'Код ЕНС ТРУ')]/span"))).build().perform();
        sleep(LOAD_PAUSE);
        element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).setValue(SEARCH_QUERY_PROCUREMENT_CODE);
        sleep(LOAD_PAUSE);
        element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        element(Selectors.byXpath("//label[contains(.,'Способ закупок')]/..//select")).selectOptionContainingText("Открытый");
        element(Selectors.byXpath("//label[contains(.,'Приоритет закупок')]/..//select")).selectOptionContainingText("холдинга");
        element(Selectors.byXpath("//label[contains(.,'Прогноз местного содержания')]/..//input")).setValue("100");
        element(Selectors.byXpath("//label[contains(.,'Месяц закупок')]/..//input")).click();
        element(Selectors.byXpath("//button[contains(.,'дек.')]")).click();
        sleep(10000);


//        Remove to keep the system clean
        open(PLAN_URL);
        element(Selectors.byXpath("//button[text()='Действия']")).click();
        element(Selectors.byXpath("//button[text()='Удалить']")).click();
        element(Selectors.byXpath("//span[text()='Удалить']")).click();
        logger.info("Execution ended for:" + this.getClass().toString());
    }
}
