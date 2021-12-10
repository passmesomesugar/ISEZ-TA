package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlan extends PagesManager {


    private SelenideElement createNewPlanButton =
            element(Selectors.byXpath("//span[text()='Создать план закупок']"));

    public void createNewPlan() {
        createNewPlanButton.click();
    }

    public void setYear(String year) {
        element(Selectors.byXpath("//select[contains(.,'" + year + "')]")).selectOptionContainingText(year);
        logger.info("setYear: " + this.getClass().toString());
    }

    public void setProcurementPlanType(String planType) {
        element(Selectors.byXpath("//select[contains(.,'" + planType + "')]")).selectOptionContainingText(planType);
        logger.info("setYear: " + this.getClass().toString());
    }

    public void setProcurementPlanTimeFrame(String planTimeFrame) {
        element(Selectors.byXpath("//select[contains(.,'" + planTimeFrame + "')]")).selectOptionContainingText(planTimeFrame);
        logger.info("setProcurementPlanTimeFrame: " + this.getClass().toString());
    }

    public void savePlan() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.save")).click();
        logger.info("savePlan: " + this.getClass().toString());
    }

    public void pressActions(String planType) {
        element(Selectors.byXpath("//td[contains(.,'" + planType + "')]/../*//*[@jhitranslate='plan.actions']")).click();
        logger.info("pressActions: " + this.getClass().toString());
    }

    public void reviewProcurementPositions(String planType) {
        element(Selectors.byXpath("//td[contains(.,'" + planType + "')]/../*//*[@jhitranslate='plan.viewPlanItem']")).click();
        logger.info("reviewProcurementPositions: " + this.getClass().toString());
    }

    public void pressRemovePlan() {
        element(Selectors.byAttribute("jhitranslate", "plan.delete")).click();
        logger.info("pressRemovePlan: " + this.getClass().toString());
    }

    public void approveRemovalOfPlan() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.delete")).click();
        logger.info("approveRemovalOfPlan: " + this.getClass().toString());
    }
}
