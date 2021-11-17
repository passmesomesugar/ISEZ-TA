package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {

    public String positionProcurementTestingScenario = System.getProperty("position.scenario");
    public String positionProcurementMethod = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.method");
    private SelenideElement procurementScheme = element(Selectors.byXpath("//select[contains(.,'" + positionProcurementMethod + "')]"));

    public void clickOnSelectionAndSelectProcurementScheme() {
        procurementScheme.click();
        element(Selectors.byXpath("//select[contains(.,'" + positionProcurementMethod + "')]")).selectOptionContainingText(positionProcurementMethod);
    }


    public void chooseProcurementMethod() {
        element(Selectors.byXpath("//*/..//select//*[contains(@value, '" + positionProcurementMethod + " ')]//..")).click();
        element(Selectors.byXpath("//label[contains(.,'Способ закупок')]/..//select//*[contains(@value, '" + positionProcurementMethod + "')]")).click();
    }


}
