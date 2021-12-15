package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import kz.sapasoft.services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class PersonalCabinet extends PagesManager {

    public String PERSONAL_CABINET =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("personal.cabinet");

    public SelenideElement warrantyTitle = element(Selectors.byAttribute("jhitranslate", "bankWarranty.titleFull"));

    public SelenideElement warrantyReportTitle = element(Selectors.byAttribute("jhitranslate", "bankWarranty.report.report1.title"));

    public SelenideElement appealTitle = element(Selectors.byAttribute("jhitranslate", "appeal.title"));

    public SelenideElement search = element(Selectors.byAttribute("jhitranslate", "bankWarranty.search"));

    public SelenideElement randomCSS_ContainsTable_in_ClassName = element(Selectors.byXpath("//div[contains(@class, 'table')]"));

    public void openProcurementPlan() {
        element(Selectors.byAttribute("jhitranslate", "layouts.planAdvert")).click();
    }

    public void openPersonalCabinet() {
        open(PERSONAL_CABINET);
    }

    public void openBankWarranty() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.title")).click();
    }

    public void openBankWarrantyList() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.list")).click();
    }

    public void openAppeal() {
        element(Selectors.byAttribute("jhitranslate", "appeal.title")).click();
    }

    public void openListOfAppeals() {
        element(Selectors.byAttribute("jhitranslate", "appeal.listOfAppeal")).click();
    }

    public void openListOfRequests() {
        element(Selectors.byAttribute("jhitranslate", "criterias.tasks.titleNotSkb")).click();
    }

    public void openClarificationsForNPA() {
        element(Selectors.byAttribute("jhitranslate", "npa.clarifications")).click();
    }

    public void openListRegister() {
        element(Selectors.byAttribute("jhitranslate", "nsi.title")).click();
    }

    public void clickRequests() {
        element(Selectors.byAttribute("jhitranslate", "nsi.subTitle1")).click();
    }

    public void clickOrders() {
        element(Selectors.byAttribute("jhitranslate", "nsi.decree.titleShort")).click();
    }

    public void clickSupplierManagement() {
        element(Selectors.byAttribute("jhitranslate", "supplier.title")).click();
    }

    public void clickGWSCodesUnlockApplications() {
        element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.truCodeApplications")).click();
    }

    public void clickProcurements() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advert")).click();
    }

    public void clickProcurementsGraph() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advertSchedule")).click();
    }

    public void clickProcurementsList() {
        element(Selectors.byAttribute("jhitranslate", "layouts.advertList")).click();
    }

    public void clickProcurementTemplates() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.entities.commissionTemplate")).click();
    }

    public void clickESOrders() {
        element(Selectors.byAttribute("jhitranslate", "eshopOrder.title")).click();
    }

    public void logOut() {
        open(PERSONAL_CABINET);
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.logout")).click();
        logger.info("log out for:" + this.getClass().toString());
    }

    public void openBankWarrantyReport() {
        element(Selectors.byAttribute("jhitranslate", "bankWarranty.report.title")).click();
    }

    public void clickGWSCodesManagement() {
        element(Selectors.byAttribute("jhitranslate", "nsi.truCodeManagement.title")).click();
        //<span _ngcontent-lnc-c15="" jhitranslate="nsi.truCodeManagement.title">Управление кодами ЕНС ТРУ</span>
    }
}
