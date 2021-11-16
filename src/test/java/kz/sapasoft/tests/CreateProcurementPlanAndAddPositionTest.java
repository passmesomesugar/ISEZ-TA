package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;

public class CreateProcurementPlanAndAddPositionTest extends BasicTestConditions {

    public String PROCUREMENT_CODE = PropertyDataReader.getProperties("customer").getProperty("procurement.code");

    //String PLAN_URL = PropertyDataReader.getProperties(currentTestingEnv).getProperty("procurement.plan.url");

    @Test(groups = "1")
    void createProcurementPlanAndPositionTest() {
//        openHomeAndLogin();
//        logger.info("Execution started for:" + this.getClass().toString());
//        open(PERSONAL_CABINET);
//        element(Selectors.byXpath("//span[text()='План закупок']")).click();
//        element(Selectors.byXpath("//span[text()='Создать план закупок']")).click();
//        element(Selectors.byXpath("//select[contains(.,'Основной план')]")).selectOptionContainingText("Основной план");
//        element(Selectors.byXpath("//select[contains(.,'Годовой')]")).selectOptionContainingText("Годовой");
//        element(Selectors.byXpath("//span[text()='Сохранить']")).click();
//        element(Selectors.byXpath("//button[text()='Действия']")).click();
//        element(Selectors.byXpath("//button[text()='Посмотреть пункты плана']")).click();
//        element(Selectors.byXpath("//span[text()='Создать строку плана']")).click();
//        actions().click(element(Selectors.byXpath("//label[contains(.,'Код ЕНС ТРУ')]/span"))).build().perform();
//        while (!element(Selectors.byXpath("//*[contains(@class, 'autocomplete__layout')]")).has(Condition.visible)) {
//            sleep(MICRO_LOAD_PAUSE);
//            element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).setValue(PROCUREMENT_CODE);
//        }
//        element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//        element(Selectors.byXpath("//label[contains(.,'Способ закупок')]/..//select")).selectOptionContainingText("Открытый");
//        element(Selectors.byXpath("//label[contains(.,'Приоритет закупок')]/..//select")).selectOptionContainingText("холдинга");
//        element(Selectors.byXpath("//label[contains(.,'Прогноз местного содержания')]/..//input")).setValue("100");
//        element(Selectors.byXpath("//label[contains(.,'Месяц закупок')]/..//input")).click();
//        element(Selectors.byXpath("//button[contains(.,'ноя.')]")).click();
//        element(Selectors.byXpath("//label[contains(.,'Место закупок')]/..//input")).click();
//        element(Selectors.byXpath("//span[contains(.,'Алматы')]")).click();
//        element(Selectors.byXpath("//label[contains(.,'Адрес закупок')]/..//input")).setValue("Геодезистов,28");
//        element(Selectors.byXpath("//label[contains(.,'Страна поставки')]/..//input")).setValue("КАЗАХСТАН");
//        element(Selectors.byXpath("//label[contains(.,'Место поставки')]/..//input")).click();
//        element(Selectors.byXpath("//span[contains(.,'Алматы')]")).click();
//        element(Selectors.byXpath("//label[contains(.,'Адрес поставки')]//..//textarea")).setValue("Геодезистов,29");
//        element(Selectors.byXpath("//label[contains(.,'ИНКОТЕРМС')]")).scrollIntoView(true);
//        element(Selectors.byXpath("//label[contains(.,'ИНКОТЕРМС')]//..//select")).selectOptionContainingText("FCA");




        // Remove to keep the system clean
//        open(PLAN_URL);
//        element(Selectors.byXpath("//button[text()='Действия']")).shouldHave(Condition.visible);
//        element(Selectors.byXpath("//button[text()='Действия']")).click();
//        element(Selectors.byXpath("//button[text()='Удалить']")).click();
//        element(Selectors.byXpath("//span[text()='Удалить']")).click();
//        logger.info("Execution ended for:" + this.getClass().toString());
    }
}
