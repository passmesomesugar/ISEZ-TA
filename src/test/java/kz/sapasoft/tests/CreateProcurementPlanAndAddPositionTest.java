package kz.sapasoft.tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static kz.sapasoft.services.ProcurementPlanManager.getProcurementList;
import static kz.sapasoft.services.TenderManager.getOpenTender;
import static kz.sapasoft.services.UserManager.getCustomer;

public class CreateProcurementPlanAndAddPositionTest extends BasicTestConditions {

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
        getProcurementPlanPositionPage().setProcurementPriority(getOpenTender().getProcurementPriority());
        getProcurementPlanPositionPage().setLocalContentRatio(getOpenTender().getLocalContentRatio());
        getProcurementPlanPositionPage().setProcurementDate(getOpenTender().getDate());
        getProcurementPlanPositionPage().setProcurementAddress(getOpenTender().getProcurementAddress());
        getProcurementPlanPositionPage().setTenderAddress(getOpenTender().getTenderAddress());
        getProcurementPlanPositionPage().setCountry(getOpenTender().getDeliveryCountry());
        getProcurementPlanPositionPage().setDeliveryAddress(getOpenTender().getDeliveryAddress());
        getProcurementPlanPositionPage().setINCOTERMS(getOpenTender().getIncoterms());
        getProcurementPlanPositionPage().setSchedulePeriod(getOpenTender().getSchedulePeriod());
        sleep(15000);


        // Remove to keep the system clean
//        open(PLAN_URL);
//        element(Selectors.byXpath("//button[text()='Действия']")).shouldHave(Condition.visible);
//        element(Selectors.byXpath("//button[text()='Действия']")).click();
//        element(Selectors.byXpath("//button[text()='Удалить']")).click();
//        element(Selectors.byXpath("//span[text()='Удалить']")).click();

    }
}
