package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class PersonalCabinet extends PagesManager {

    private SelenideElement procurementScheme = element(element(Selectors.byXpath("//span[text()='План закупок']")));// Поменять на способ закупок
    public String PERSONAL_CABINET =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("personal.cabinet");

    public void openProcurementPlan() {
        procurementScheme.click();
    }

    public void openPersonalCabinet() {
        open(PERSONAL_CABINET);
    }
}
