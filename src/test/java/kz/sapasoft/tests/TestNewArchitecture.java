package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.PersonalCabinet;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class TestNewArchitecture extends BasicTestConditions {
    public String PROCUREMENT_CODE = PropertyDataReader.getProperties("customer").getProperty("procurement.code");

    @Test(groups = "this")
    void createProcurementPlanAndPositionTest() {
        openHomeAndLogin();
        logger.info("Execution started for:" + this.getClass().toString());
        open(PERSONAL_CABINET);
        PersonalCabinet personalCabinet = new PersonalCabinet();
        personalCabinet.openProcurementPlan();

        getProcurementPlan().createNewPlan();
        getProcurementPlan().setYear();
        getProcurementPlan().setProcurementPlanType();
        getProcurementPlan().setProcurementPlanTimeFrame();
        getProcurementPlan().savePlan();
        getProcurementPlan().pressActions();
        getProcurementPlan().reviewProcurementPositions();
        getProcurementPlan().createPlanPosition();

        while (!element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            actions().click(element(Selectors.byXpath("//label[contains(.,'Код ЕНС ТРУ')]/span"))).build().perform();
        }

        while (!element(Selectors.byXpath("//*[contains(@class, 'autocomplete__layout')]")).has(Condition.visible)) {
            sleep(MINI_LOAD_PAUSE);
            element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).setValue(PROCUREMENT_CODE);
        }
        element(Selectors.byXpath("//div[contains(@class, 'modal')]//label[contains(.,'Код ЕНС ТРУ')]/..//input")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        sleep(5000);
    }
}

