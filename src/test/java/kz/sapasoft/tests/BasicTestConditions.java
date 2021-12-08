package kz.sapasoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import kz.sapasoft.pages.PagesManager;

import java.util.logging.Level;

public class BasicTestConditions extends PagesManager {

    @BeforeTest
    void setTimeOut() {
        Configuration.timeout = 40000;
    }

    @BeforeSuite(alwaysRun = true)
    void genesis() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 30000;
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


