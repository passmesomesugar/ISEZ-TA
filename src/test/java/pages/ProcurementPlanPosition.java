package pages;

import com.codeborne.selenide.Selectors;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {

    public String positionProcurementTestingScenario = System.getProperty("position.scenario");
    public String positionProcurementMethodProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.method");
    public String procurementPriorityProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.priority");


    public void chooseProcurementMethod() {
        element(Selectors.byXpath("//*[@name='tenderType']//select//option[contains(@value,'" + positionProcurementMethodProp + "')]")).click();
    }


    public void setProcurementPriority() {
    }
}
