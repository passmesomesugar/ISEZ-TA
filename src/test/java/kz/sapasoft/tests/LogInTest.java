package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LogInTest extends BasicTestConditions {
    @Test(groups = "smoke")
    public void logIn() {
//        openHome();
//        logger.info("Execution started for:" + this.getClass().toString());
//        element(Selectors.byXpath("//span//*[text()='зарегистрироваться']")).click();
//        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
//        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue(userName);
//        element(Selectors.byXpath("//*[@type='password']")).setValue(password);
//        element(Selectors.byXpath("//*[@type='submit']")).click();
//        Selenide.element(Selectors.byId("logout")).should(Condition.exist);
//        Selenide.element(Selectors.byId("logout")).click();
//        Selenide.element(Selectors.byId("logout")).shouldNotHave(Condition.exist);
//        logger.info("Execution ended for:" + this.getClass().toString());
    }
}
