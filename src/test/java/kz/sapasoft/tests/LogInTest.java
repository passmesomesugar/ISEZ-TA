package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LogInTest extends BasicTestConditions {
    @Test(groups = "smoke")
    public void openMain() {
        open(MAIN_URL);
        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
        dismiss(); // дабы убрать предупреждение об отсутствии NCA layer
        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue("777777777797_777777777797");
        element(Selectors.byXpath("//*[@type='password']")).setValue("123456");
        element(Selectors.byXpath("//*[@type='submit']")).click();
        logger.info("some info");
        //Selenide.element(Selectors.byXpath("//*[@type='submit']")).should(Condition.exist);

    }
}
