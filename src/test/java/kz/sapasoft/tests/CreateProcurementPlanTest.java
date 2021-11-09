package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.nio.channels.SelectableChannel;

import static com.codeborne.selenide.Selenide.*;

public class CreateProcurementPlanTest extends BasicTestConditions {
    public String SEARCH_QUERY_PROCUREMENT_CODE = "101315.930.000000";
    int tempTimeout = 1000;

    @Test(groups = "this")
    void createProcurementPlanAndPositionTest() {
        openHomeAndLogin();
        open(PERSONAL_CABINET);
        element(Selectors.byXpath("//span[text()='План закупок']")).click();
        sleep(tempTimeout);
        element(Selectors.byXpath("//span[text()='Создать план закупок']")).click();
        sleep(tempTimeout);
        element(Selectors.byXpath("//select[contains(.,'Основной план')]")).selectOptionContainingText("Основной план");
        sleep(tempTimeout);
        element(Selectors.byXpath("//select[contains(.,'Годовой')]")).selectOptionContainingText("Годовой");
        element(Selectors.byXpath("//span[text()='Сохранить']")).click();
        sleep(tempTimeout);
        element(Selectors.byXpath("//button[text()='Действия']")).click();
        sleep(tempTimeout);
        element(Selectors.byXpath("//button[text()='Посмотреть пункты плана']")).click();
        sleep(tempTimeout);
        element(Selectors.byXpath("//span[text()='Создать строку плана']")).click();
        actions().click(element(Selectors.byXpath("//label[contains(.,'Код ЕНС ТРУ')]/span"))).build().perform();
        //element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).setValue(SEARCH_QUERY_PROCUREMENT_CODE).pressEnter();
        actions().click(element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]"))).build().perform();
        //actions().click(element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input"))).build().perform(); // клик до ипнута
        Selenide.clipboard().setText(SEARCH_QUERY_PROCUREMENT_CODE);
        actions().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        actions().click(element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]"))).build().perform();
        sleep(8000);
    }


}
