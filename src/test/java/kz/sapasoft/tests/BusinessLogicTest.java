package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class BusinessLogicTest extends BasicTestConditions {
    /*This is used for the sake of example*/
    @Test(groups = "1")
    public void someBusinessLogicScenario() {
        openHomeAndLogin();
        Selenide.element(Selectors.byXpath("//span[text()='На главную']")).click();
        Selenide.element(Selectors.by("placeholder", "Слово для поиска или номер закупки")).setValue("11111111");
        logOut();
    }
}
