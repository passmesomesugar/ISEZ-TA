package kz.sapasoft.tests;

import org.testng.annotations.Test;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.sleep;

public class CreateProcurementPlanAndAddPositionTest extends BasicTestConditions {

    public String PROCUREMENT_CODE = PropertyDataReader.getProperties("customer").getProperty("procurement.code");

    @Test(groups = "this")
    void createProcurementPlanAndPositionTest() {
        getHomePage().logIn();
        logger.info("Execution started for:" + this.getClass().toString());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProcurementPlan();
        getProcurementPlanPage().createNewPlan();
        getProcurementPlanPage().setYear();
        getProcurementPlanPage().setProcurementPlanType();
        getProcurementPlanPage().setProcurementPlanTimeFrame();
        getProcurementPlanPage().savePlan();
        //some assertion here
        getProcurementPlanPage().pressActions();
        getProcurementPlanPage().reviewProcurementPositions();
        getProcurementPlanPositionsPage().createProcurementPlanPosition();
        getProcurementPlanPositionsPage().createNewProcurementPlanPosition();
        getProcurementPlanPositionsPage().attemptClickGWS();
        getProcurementPlanPositionsPage().attemptInputGWS(PROCUREMENT_CODE);
        getProcurementPlanPositionPage().chooseProcurementMethod();

        sleep(15000);

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
