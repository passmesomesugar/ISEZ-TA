package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class PersonalCabinet extends PagesManager {

    private SelenideElement procurementScheme = element(element(Selectors.byXpath("//span[text()='План закупок']")));// Поменять на способ закупок

    public void openProcurementPlan() {
        procurementScheme.click();
    }


}
