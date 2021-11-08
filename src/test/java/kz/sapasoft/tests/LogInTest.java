package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LogInTest extends BasicTestConditions {
    @Test(groups = "this")
    public void openMain() {
        open(MAIN_URL);
        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
        dismiss(); // дабы убрать предупреждение об отсутствии NCA layer
        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue(userName);
        element(Selectors.byXpath("//*[@type='password']")).setValue(password);
        element(Selectors.byXpath("//*[@type='submit']")).click();
        logger.info("some info");
        Selenide.element(Selectors.byId("logout")).should(Condition.exist);
    }
}
