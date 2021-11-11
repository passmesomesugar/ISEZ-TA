package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static services.MrRobot.callRobotAndPaste;

public class SignWithKeysTest extends BasicTestConditions {
    @Test(groups = "this")
    public void test() {
        open(MAIN_URL);
        element(Selectors.byXpath("//span//*[text()='Войти']")).click();
        element(Selectors.byXpath("//button[text()='Выбрать сертификат']")).click();
        callRobotAndPaste(pathToKeys);
        sleep(2000);
        callRobotAndPaste(passToKeys);
        sleep(20000);
    }
}
