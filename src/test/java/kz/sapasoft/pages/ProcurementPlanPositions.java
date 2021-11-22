package kz.sapasoft.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class ProcurementPlanPositions extends PagesManager {

    public void createProcurementPlanPosition() {
        element(Selectors.byAttribute("jhitranslate", "planItem.createPlanItem")).click();
    }

    public void createNewProcurementPlanPosition() {
        while (!element(Selectors.byAttribute("data-cname", "completerRemote")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            actions().click(element(Selectors.byAttribute("data-cname", "enstru"))).build().perform();
        }
    }

    public void attemptClickGWS() {
        while (!element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            actions().click(element(Selectors.byAttribute("data-cname", "completerRemote"))).build().perform();
        }
    }

    public void attemptInputGWS(String procurementCode) {
        while (!element(Selectors.byXpath("//*[contains(@class, 'autocomplete__layout')]")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            element(Selectors.byXpath("//input[contains(@data-cname, 'completer')]")).setValue(procurementCode);
        }
        element(Selectors.byXpath("//input[contains(@data-cname, 'completer')]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }
}