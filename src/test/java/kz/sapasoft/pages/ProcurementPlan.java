package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import kz.sapasoft.services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlan extends PagesManager {


    private SelenideElement createNewPlanButton =
            element(Selectors.byXpath("//span[text()='Создать план закупок']"));

    public void createNewPlan() {
        createNewPlanButton.click();
    }

    public void setYear(String year) {
        element(Selectors.byXpath("//select[contains(.,'" + year + "')]")).selectOptionContainingText(year);
    }

    public void setProcurementPlanType(String planType) {
        element(Selectors.byXpath("//select[contains(.,'" + planType + "')]")).selectOptionContainingText(planType);
    }

    public void setProcurementPlanTimeFrame(String planTimeFrame) {
        element(Selectors.byXpath("//select[contains(.,'" + planTimeFrame + "')]")).selectOptionContainingText(planTimeFrame);
    }

    public void savePlan() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.save")).click();
    }

    public void pressActions(String planType) {
        element(Selectors.byXpath("//td[contains(.,'" + planType + "')]/../*//*[@jhitranslate='plan.actions']")).click();
    }

    public void reviewProcurementPositions(String planType) {
        element(Selectors.byXpath("//td[contains(.,'" + planType + "')]/../*//*[@jhitranslate='plan.viewPlanItem']")).click();
    }

    public void pressRemovePlan() {
        element(Selectors.byAttribute("jhitranslate", "plan.delete")).click();
    }

    public void approveRemovalOfPlan() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.delete")).click();
    }
}
