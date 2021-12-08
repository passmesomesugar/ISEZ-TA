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
        getProcurementPlanPage().pressActions(getProcurementList().getPlanType());
        getProcurementPlanPage().reviewProcurementPositions(getProcurementList().getPlanType());
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
        getProcurementPlanPositionPage().setEndDate(getOpenTender().getEndDate());
        getProcurementPlanPositionPage().setPrepay(getOpenTender().getPrepay());
        getProcurementPlanPositionPage().setVolumeMeasurement();
        getProcurementPlanPositionPage().selectVAT("Без НДС");
        getProcurementPlanPositionPage().setVolumeForYear("2021", "1");
        getProcurementPlanPositionPage().setVolumeForYear("2022", "2");
        getProcurementPlanPositionPage().setPriceForYear("2021", "1");
        getProcurementPlanPositionPage().setPriceForYear("2022", "1");
        getProcurementPlanPositionPage().save();
        sleep(20000);
    }
}
