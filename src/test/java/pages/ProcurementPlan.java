package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

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
        element(Selectors.byAttribute("jhitranslate", "entity.action.save")).click();
    }

    public void pressActions() {
        element(Selectors.byXpath("//td[contains(.,'" + planType + "')]/../*//*[@jhitranslate='plan.actions']")).click();
    }

    public void reviewProcurementPositions() {
        element(Selectors.byXpath("//td[contains(.,'" + planType + "')]/../*//*[@jhitranslate='plan.viewPlanItem']")).click();

    }

    public void pressRemovePlan() {
        element(Selectors.byAttribute("jhitranslate", "plan.delete")).click();
    }

    public void approveRemovalOfPlan() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.delete")).click();
    }
}
