package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;

public class NegativeLogInTest extends BasicTestConditions {
    String nonExistentUserName = "null";
    String randomPassword = "null";

    @Test(groups = "smoke")
    public void attemptLogIn() {
//        openHome();
//        logger.info("Execution started for:" + this.getClass().toString());
//        element(Selectors.byXpath("//span//*[text()='зарегистрироваться']")).click();
//        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
//        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue(nonExistentUserName);
//        element(Selectors.byXpath("//*[@type='password']")).setValue(randomPassword);
//        element(Selectors.byXpath("//*[@type='submit']")).click();
//        Selenide.element(Selectors.byId("loginWithoutEds")).should(Condition.exist);
//        Selenide.element(Selectors.byXpath("//span[text()='Зарегистрироваться']")).should(Condition.exist);
//        logger.info("Execution ended for:" + this.getClass().toString());
//        sleep(10000);
    }
}
