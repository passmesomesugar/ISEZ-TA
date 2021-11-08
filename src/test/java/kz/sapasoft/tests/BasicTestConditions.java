package kz.sapasoft.tests;

import com.codeborne.selenide.Selectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.element;

public class BasicTestConditions {
    protected static final Logger logger = LogManager.getLogger(BasicTestConditions.class);
    public String currentEnv = System.getProperty("env");
    public String MAIN_URL =
            PropertyDataReader.getProperties(currentEnv).getProperty("main.url");
    public String userName = PropertyDataReader.getProperties(currentEnv).getProperty("user.name");
    public String password = PropertyDataReader.getProperties(currentEnv).getProperty("user.password");

    public void openHome() {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
    }

    public void openHomeAndLogin() {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
        dismiss(); // дабы убрать предупреждение об отсутствии NCA layer
        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue(userName);
        element(Selectors.byXpath("//*[@type='password']")).setValue(password);
        element(Selectors.byXpath("//*[@type='submit']")).click();
    }


}
