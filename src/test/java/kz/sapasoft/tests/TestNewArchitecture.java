package kz.sapasoft.tests;

import org.testng.annotations.Test;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;

public class TestNewArchitecture extends BasicTestConditions {
    public String PROCUREMENT_CODE = PropertyDataReader.getProperties("customer").getProperty("procurement.code");

    @Test(groups = "this")
    void createProcurementPlanAndPositionTest() {
        logger.info("Execution started for:" + this.getClass().toString());
        getHomePage().logIn();
        getPersonalCabinetPage().openPersonalCabinet();
        getPersonalCabinetPage().openProcurementPlan();
        getProcurementPlanPage().createNewPlan();
        getProcurementPlanPage().setYear();
        getProcurementPlanPage().setProcurementPlanType();
        getProcurementPlanPage().setProcurementPlanTimeFrame();
        getProcurementPlanPage().savePlan();
        getProcurementPlanPage().pressActions();
        getProcurementPlanPage().reviewProcurementPositions();
        getProcurementPlanPage().createPlanPosition();
        getProcurementPlanPage().attemptClickGWS();
        getProcurementPlanPage().attemptInputGWS(PROCUREMENT_CODE);
    }
}

