package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class PersonalCabinet extends PagesManager {

    private SelenideElement procurementPlan = element(element(Selectors.byXpath("//span[text()='План закупок']")));// Поменять на способ закупок xpath
    public String PERSONAL_CABINET =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("personal.cabinet");

    public void openProcurementPlan() {
        procurementPlan.click();
    }

    public void openPersonalCabinet() {
        open(PERSONAL_CABINET);
    }
}
