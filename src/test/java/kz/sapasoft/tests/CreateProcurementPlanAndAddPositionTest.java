package kz.sapasoft.tests;

import org.testng.annotations.Test;
import kz.sapasoft.services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.sleep;
import static kz.sapasoft.services.TenderManager.getOpenTender;
import static kz.sapasoft.services.UserManager.getCustomer;
import static kz.sapasoft.services.ProcurementPlanManager.getProcurementList;

public class CreateProcurementPlanAndAddPositionTest extends BasicTestConditions {
    public String positionProcurementTestingScenario = System.getProperty("procurement.position.scenario");
    public String positionProcurementMethodProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.method");
    public String procurementPriorityProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.priority");
    public String localContentRatioProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("local.content.ratio");
    public String dateProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.date");
    public String procurementAddressProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.address");
    public String tenderAddressProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.tender.address");
    public String deliveryCountryProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.delivery.country");
    public String deliveryAddressProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.delivery.address");
    public String incotermsProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("incoterms");
    public String schedulePeriodProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("schedule.period");
    public String planTimeFrame = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.time.frame");

    @Test(groups = "this", description = "")
    void createProcurementPlanAndPositionTest() {
        getHomePage().logIn(getCustomer().getName(), getCustomer().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProcurementPlan();
        getProcurementPlanPage().createNewPlan();
        getProcurementPlanPage().setYear(getProcurementList().getYear());
        getProcurementPlanPage().setProcurementPlanType(getProcurementList().getPlanType());
        getProcurementPlanPage().setProcurementPlanTimeFrame(getProcurementList().getTimeFrame());
        getProcurementPlanPage().savePlan();
        //some assertion here
        getProcurementPlanPage().pressActions(getProcurementList().getPlanType());
        getProcurementPlanPage().reviewProcurementPositions(getProcurementList().getPlanType());
        //
        getProcurementPlanPositionsPage().createProcurementPlanPosition();
        getProcurementPlanPositionsPage().createNewProcurementPlanPosition();
        getProcurementPlanPositionsPage().attemptClickGWS();
        getProcurementPlanPositionsPage().attemptInputGWS(getOpenTender().getProcurementCode());
        getProcurementPlanPositionPage().chooseProcurementMethod(getOpenTender().getProcurementMethod());
        getProcurementPlanPositionPage().setProcurementPriority(procurementPriorityProp);
        getProcurementPlanPositionPage().setLocalContentRatio(localContentRatioProp);
        getProcurementPlanPositionPage().setProcurementDate(dateProp);
        getProcurementPlanPositionPage().setProcurementLocation(procurementAddressProp);
        getProcurementPlanPositionPage().setTenderAddress(tenderAddressProp);
        getProcurementPlanPositionPage().setCountry(deliveryCountryProp);
        getProcurementPlanPositionPage().setDeliveryAddress(deliveryAddressProp);
        getProcurementPlanPositionPage().setINCOTERMS(incotermsProp);
        getProcurementPlanPositionPage().setSchedulePeriod(schedulePeriodProp);
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
