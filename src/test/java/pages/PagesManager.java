package pages;

import org.testng.annotations.BeforeClass;

public class PagesManager {
    public String testingScenario = System.getProperty("scenario");
    private ProcurementPlan procurementPlan;
    private PersonalCabinet personalCabinet;
    private ProcurementPlanPosition procurementPlanPosition;

    public ProcurementPlan getProcurementPlan() {
        return procurementPlan;
    }

    public PersonalCabinet getPersonalCabinet() {
        return personalCabinet;
    }

    public ProcurementPlanPosition getProcurementPlanPosition() {
        return procurementPlanPosition;
    }


    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
        procurementPlan = new ProcurementPlan();
        personalCabinet = new PersonalCabinet();
        procurementPlanPosition = new ProcurementPlanPosition();
    }

}
