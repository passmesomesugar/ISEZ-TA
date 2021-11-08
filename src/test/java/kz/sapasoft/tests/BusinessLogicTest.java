package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class BusinessLogicTest extends BasicTestConditions {

    @Test(groups = "this")
    public void someBusinessLogicScenario() {
        openHomeAndLogin();
        Selenide.sleep(3000);
        Selenide.element(Selectors.byXpath("//span[text()='На главную']")).click();
        Selenide.element(Selectors.byXpath("//*[text()='Личный кабинет']")).click();
        Selenide.sleep(3000);
        logOut();
    }
}
