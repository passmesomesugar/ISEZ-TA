package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.element;

public class ProcurementPlanPosition extends PagesManager {


    public void chooseProcurementMethod(String procurementMethod) {
        element(Selectors.byXpath("//*[@name='tenderType']//select//option[contains(@value,'" + procurementMethod + "')]")).click();
        logger.info("chooseProcurementMethod: " + this.getClass().toString());
    }

    public void setProcurementPriority(String priority) {
        element(Selectors.byXpath("//*[@name='tenderPriority']//select//option[contains(@value,'" + priority + "')]")).click();
        logger.info("setProcurementPriority: " + this.getClass().toString());
    }

    public void setLocalContentRatio(String contentRatio) {
        element(Selectors.byXpath("//*[@name='localContent']//input")).setValue(contentRatio);
        logger.info("setLocalContentRatio: " + this.getClass().toString());
    }

    public void setProcurementDate(String dateProp) {
        element(Selectors.byXpath("//*[@name='durationMonth']//input")).setValue(dateProp);
        logger.info("setProcurementDate: " + this.getClass().toString());
    }

    public void setProcurementAddress(String address) {
        element(Selectors.byXpath("//*[@name='kato']//input")).click();

        element(Selectors.byXpath("//span[contains(text(),'" + address + "')]")).click();
        logger.info("setProcurementAddress: " + this.getClass().toString());

    }

    public void setTenderAddress(String address) {
        element(Selectors.byXpath("//*[@name='tenderLocation']//input")).setValue(address);
        logger.info("setTenderAddress: " + this.getClass().toString());
    }

    public void setCountry(String country) {
        element(Selectors.byXpath("//*[@name='deliveryCountry']//input")).setValue(country);
        logger.info("setCountry: " + this.getClass().toString());
    }

    public void setDeliveryAddress(String address) {
        element(Selectors.byXpath("//*[@name='deliveryKato']//input")).click();
        element(Selectors.byXpath("//span[contains(text(),'" + address + "')]")).click();
        logger.info("setDeliveryAddress: " + this.getClass().toString());
    }

    public void setINCOTERMS(String incoterms) {
        element(Selectors.byXpath("//*[@name='incotermsCondition']//select//option[contains(.,'" + incoterms + "')]")).click();
        logger.info("setINCOTERMS: " + this.getClass().toString());
    }

    public void setSchedulePeriod(String schedule) {
        element(Selectors.byXpath("//*[@name='schedulePeriod']//select//option[contains(@value,'" + schedule + "')]")).click();
        logger.info("setSchedulePeriod: " + this.getClass().toString());
    }

    public void setEndDate(String date) {
        element(Selectors.byXpath("//*[@name='scheduleMonthTo']//input")).setValue(date);
        logger.info("setEndDate: " + this.getClass().toString());
    }

    public void setPrepay(String prepay) {
        element(Selectors.byXpath("//*[@name='PREPAY']//input")).setValue(prepay);
        logger.info("setPrepay: " + this.getClass().toString());
    }

    public void setVolumeMeasurementAsKG() {
        element(Selectors.byAttribute("title", "Килограмм")).click();
        logger.info("setVolumeMeasurement: " + this.getClass().toString());
    }

    public void selectVAT(String VAT) {
        element(Selectors.byAttribute("name", "ndsSize")).click();
        element(Selectors.byXpath("//select[contains(.,'" + VAT + "')]")).selectOptionContainingText(VAT);
        logger.info("selectVAT: " + this.getClass().toString());
    }

    public void setVolumeForYear(String year, String volume) {
        element(Selectors.byXpath("(//*[@id='volumeByYearList']//*[@id='" + year + "']//input)[1]")).setValue(volume);
        logger.info("setVolumeForYear: " + this.getClass().toString());
    }

    public void setPriceForYear(String year, String price) {
        element(Selectors.byXpath("(//*[@id='volumeByYearList']//*[@id='" + year + "']//input)[2]")).setValue(price);
        logger.info("setPriceForYear: " + this.getClass().toString());
    }

    public void save() {
        element(Selectors.byAttribute("jhitranslate", "entity.action.save")).scrollIntoView(true);
        element(Selectors.byAttribute("jhitranslate", "entity.action.save")).click();
        logger.info("save: " + this.getClass().toString());
    }
}
