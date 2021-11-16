package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlan extends PagesManager {
    public String year = PropertyDataReader.getProperties(testingScenario).getProperty("procurement.plan.year");
    private SelenideElement createNewPlanButton =
            element(Selectors.byXpath("//span[text()='Создать план закупок']"));

    public void createNewPlan() {
        createNewPlanButton.click();
    }

    public void setYear() {
        element(Selectors.byXpath("//select[contains(.,'" + year + "')]")).selectOptionContainingText(year);
    }

    public void setProcurementPlanType() {
        element(Selectors.byXpath("//select[contains(.,'Основной план')]")).selectOptionContainingText("Основной план");
    }

    public void setProcurementPlanTimeFrame() {
        element(Selectors.byXpath("//select[contains(.,'Годовой')]")).selectOptionContainingText("Годовой");
    }

    public void savePlan() {
        element(Selectors.byXpath("//span[text()='Сохранить']")).click();
    }

}
