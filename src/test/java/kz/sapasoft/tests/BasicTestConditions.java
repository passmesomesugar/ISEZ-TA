package kz.sapasoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.PagesManager;
import services.PropertyDataReader;

import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.element;

public class BasicTestConditions extends PagesManager {
    protected static final Logger logger = LogManager.getLogger(BasicTestConditions.class);
    protected static final Logger logger1 = LogManager.getRootLogger(); //?? Test this
    int LOAD_PAUSE = 4000;
    int MINI_LOAD_PAUSE = 1500;
    int MICRO_LOAD_PAUSE = 700;
    public String currentUserEnv = System.getProperty("user");
    public String currentTestingEnv = System.getProperty("env");
    public String PERSONAL_CABINET =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("personal.cabinet");
    public String MAIN_URL =
            PropertyDataReader.getProperties(currentTestingEnv).getProperty("main.url");
    public String userName = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.name");
    public String password = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.password");


    public void openHome() {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
    }

    public void openHomeAndLogin() {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
        element(Selectors.byXpath("//span//*[text()='зарегистрироваться']")).click();
        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue(userName);
        element(Selectors.byXpath("//*[@type='password']")).setValue(password);
        element(Selectors.byXpath("//*[@type='submit']")).click();
        logger.info("User name and password were submitted for:" + this.getClass().toString());
    }

    public void logOut() {
        open(PERSONAL_CABINET);
        Selenide.element(Selectors.byXpath("//span[text()='Выйти']")).click();
        logger.info("Log out has been clicked for:" + this.getClass().toString());
    }


    @BeforeTest
    void setTimeOut() {
        Configuration.timeout = 20000;
    }

    @BeforeSuite(alwaysRun = true)
    void genesis() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().enableLogs(LogType.BROWSER, Level.ALL)
        );
        logger.info("Main session (test suite execution) has started");
    }

    @AfterSuite(alwaysRun = true)
    void loggingEndOfSuite() {
        logger.info("Main session (test suite execution) has ended");
    }
}


