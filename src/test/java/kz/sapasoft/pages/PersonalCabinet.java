package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import kz.sapasoft.services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class PersonalCabinet extends PagesManager {

    public String PERSONAL_CABINET =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("personal.cabinet");

    public SelenideElement title = element(Selectors.byAttribute("jhitranslate", "bankWarranty.titleFull"));

    public SelenideElement search = element(Selectors.byAttribute("jhitranslate", "bankWarranty.search"));


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

    public void openClarifications() {
        element(Selectors.byAttribute("jhitranslate", "criterias.tasks.titleNotSkb")).click();
    }

    public void logOut() {
        open(PERSONAL_CABINET);
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.logout")).click();
        logger.info("log out for:" + this.getClass().toString());
    }
}
