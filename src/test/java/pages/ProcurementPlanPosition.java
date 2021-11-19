package pages;

import com.codeborne.selenide.Selectors;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {

    //public String positionProcurementTestingScenario = System.getProperty("position.scenario");

    public void chooseProcurementMethod(String procurementMethod) {
        element(Selectors.byXpath("//*[@name='tenderType']//select//option[contains(@value,'" + procurementMethod + "')]")).click();
    }

    public void setProcurementPriority(String priority) {
        element(Selectors.byXpath("//*[@name='tenderPriority']//select//option[contains(@value,'" + priority + "')]")).click();
    }

    public void setLocalContentRatio(String contentRatio) {
        element(Selectors.byXpath("//*[@name='localContent']//input")).setValue(contentRatio);
    }

    public void setProcurementDate(String dateProp) {
        element(Selectors.byXpath("//*[@name='durationMonth']//input")).setValue(dateProp);
    }

    public void setProcurementLocation(String address) {
        element(Selectors.byXpath("//*[@name='kato']//input")).click();
        element(Selectors.byXpath("//span[contains(text(),'" + address + "')]")).click();
    }

    public void setTenderAddress(String address) {
        element(Selectors.byXpath("//*[@name='tenderLocation']//input")).setValue(address);
    }

    public void setCountry(String country) {
        element(Selectors.byXpath("//*[@name='deliveryCountry']//input")).setValue(country);
    }

    public void setDeliveryAddress(String address) {
        element(Selectors.byXpath("//*[@name='deliveryKato']//input")).click();
        element(Selectors.byXpath("//span[contains(text(),'" + address + "')]")).click();
    }

    public void setINCOTERMS(String incoterms) {
        element(Selectors.byXpath("//*[@name='incotermsCondition']//select//option[contains(.,'" + incoterms + "')]")).click();
    }

    public void setSchedulePeriod(String schedule) {
        element(Selectors.byXpath("//*[@name='schedulePeriod']//select//option[contains(@value,'" + schedule + "')]")).click();
    }
}
