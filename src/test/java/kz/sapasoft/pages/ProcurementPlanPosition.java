package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {


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

    public void setProcurementAddress(String address) {
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

    public void setEndDate(String date) {
        element(Selectors.byXpath("//*[@name='scheduleMonthTo']//input")).setValue(date);
    }

    public void setPrepay(String prepay) {
        element(Selectors.byXpath("//*[@name='PREPAY']//input")).setValue(prepay);
    }

    public void setVolumeMeasurement() {
        element(Selectors.byAttribute("title", "Килограмм")).click();
        //selectOptionContainingText("Грамм")
    }

    public void selectVAT(String VAT) {
        element(Selectors.byAttribute("name", "ndsSize")).click();
        element(Selectors.byXpath("//select[contains(.,'" + VAT + "')]")).selectOptionContainingText(VAT);
    }

    public void setVolumeForYear(String year, String volume) {
        element(Selectors.byXpath("(//*[@id='volumeByYearList']//*[@id='" + year + "']//input)[1]")).setValue(volume);
    }

    public void setPriceForYear(String year, String price) {
        element(Selectors.byXpath("(//*[@id='volumeByYearList']//*[@id='" + year + "']//input)[2]")).setValue(price);
    }

    public void save() {
        element(Selectors.byText("Сохранить")).scrollIntoView(true);
        element(Selectors.byText("Сохранить")).click();
    }
}
