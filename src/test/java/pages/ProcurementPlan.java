package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;

public class ProcurementPlan extends PagesManager {
    public String year = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.plan.year");
    public String planType = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.plan.type");
    public String planTimeFrame = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.time.frame");

    private SelenideElement createNewPlanButton =
            element(Selectors.byXpath("//span[text()='Создать план закупок']"));

    public void createNewPlan() {
        createNewPlanButton.click();
    }

    public void setYear() {
        element(Selectors.byXpath("//select[contains(.,'" + year + "')]")).selectOptionContainingText(year);
    }

    public void setProcurementPlanType() {
        element(Selectors.byXpath("//select[contains(.,'" + planType + "')]")).selectOptionContainingText(planType);
    }

    public void setProcurementPlanTimeFrame() {
        element(Selectors.byXpath("//select[contains(.,'" + planTimeFrame + "')]")).selectOptionContainingText(planTimeFrame);
    }

    public void savePlan() {
        element(Selectors.byXpath("//span[text()='Сохранить']")).click();
    }

    public void pressActions() {
        element(Selectors.byXpath("//td[contains(.,' " + planType + " ')]/../*//button[text()='Действия']")).click();
    }

    public void reviewProcurementPositions() {
        element(Selectors.byXpath("//button[text()='Посмотреть пункты плана']")).click();
    }

    public void createPlanPosition() {
        element(Selectors.byXpath("//span[text()='Создать строку плана']")).click();
    }

    public void attemptClickGWS() {
        while (!element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            actions().click(element(Selectors.byXpath("//label[contains(.,'Код ЕНС ТРУ')]/span"))).build().perform();
        }
    }

    public void attemptInputGWS(String procurementCode) {
        while (!element(Selectors.byXpath("//*[contains(@class, 'autocomplete__layout')]")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).setValue(procurementCode);
        }
        element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void pressRemovePlan() {
        element(Selectors.byAttribute("jhitranslate", "plan.delete")).click();
    }

    public void approveRemovalOfPlan() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.delete")).click();
    }


}
