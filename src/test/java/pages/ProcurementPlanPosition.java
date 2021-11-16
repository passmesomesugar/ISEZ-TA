package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {

    public String positionProcurementTestingScenario = System.getProperty("position.scenario");
    public String positionProcurementMethod = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.method");
    private SelenideElement procurementScheme = element(Selectors.byXpath("//select[contains(.,'" + positionProcurementMethod + "')]"));// Поменять на способ закупок


    public void clickOnSelectionAndSelectProcurementScheme() {
        procurementScheme.click();
        element(Selectors.byXpath("//select[contains(.,'" + positionProcurementMethod + "')]")).selectOptionContainingText(positionProcurementMethod);
    }
}
