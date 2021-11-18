package pages;

import com.codeborne.selenide.Selectors;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {

    public String positionProcurementTestingScenario = System.getProperty("position.scenario");
    public String positionProcurementMethodProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.method");
    public String procurementPriorityProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.priority");
    public String localContentRatio = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("local.content.ratio");
    public String dateProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.date");


    public void chooseProcurementMethod() {
        element(Selectors.byXpath("//*[@name='tenderType']//select//option[contains(@value,'" + positionProcurementMethodProp + "')]")).click();
    }

    public void setProcurementPriority() {
        element(Selectors.byXpath("//*[@name='tenderPriority']//select//option[contains(@value,'" + procurementPriorityProp + "')]")).click();
    }

    public void setLocalContentRatio() {
        element(Selectors.byXpath("//*[@name='localContent']//input")).setValue(localContentRatio);
    }

    public void setProcurementDate() {
        element(Selectors.byXpath("//*[@name='durationMonth']//input")).setValue(dateProp);
    }

    public void setProcurementLocation() {
        element(Selectors.byXpath("//*[@name='kato']//input")).click();
    }


}
