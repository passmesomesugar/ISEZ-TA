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
    public String procurementAddressProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.address");
    public String tenderAddressProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.tender.address");
    public String deliveryCountryProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.delivery.country");
    public String deliveryAddressProp = PropertyDataReader.getProperties(positionProcurementTestingScenario).getProperty("procurement.delivery.address");


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
        element(Selectors.byXpath("//span[contains(text(),'" + procurementAddressProp + "')]")).click();
    }

    public void setTenderAddress() {
        element(Selectors.byXpath("//*[@name='tenderLocation']//input")).setValue(tenderAddressProp);
    }

    public void setCountry() {
        element(Selectors.byXpath("//*[@name='deliveryCountry']//input")).setValue(deliveryCountryProp);
    }

    public void setDeliveryAddress() {
        element(Selectors.byXpath("//*[@name='deliveryKato']//input")).click();
        element(Selectors.byXpath("//span[contains(text(),'" + deliveryAddressProp + "')]")).click();
    }

}
