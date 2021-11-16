package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import services.PropertyDataReader;

import java.util.logging.Level;

public class PagesManager {
    protected static final Logger logger = LogManager.getLogger(PagesManager.class);
    public String testingScenario = System.getProperty("scenario");
    private ProcurementPlan procurementPlan;
    private PersonalCabinet personalCabinet;
    private ProcurementPlanPosition procurementPlanPosition;
    private HomePage homePage;

    public final int LOAD_PAUSE = 4000;
    public final int MICRO_LOAD_PAUSE = 700;
    public final int MINI_LOAD_PAUSE = 1500;


    public String currentTestingEnv = System.getProperty("env");

    public String MAIN_URL = PropertyDataReader.getProperties(currentTestingEnv).getProperty("main.url");

    public ProcurementPlan getProcurementPlanPage() {
        return procurementPlan;
    }

    public PersonalCabinet getPersonalCabinetPage() {
        return personalCabinet;
    }

    public ProcurementPlanPosition getProcurementPlanPositionPage() {
        return procurementPlanPosition;
    }

    public HomePage getHomePage() {
        return homePage;
    }


    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
        procurementPlan = new ProcurementPlan();
        personalCabinet = new PersonalCabinet();
        procurementPlanPosition = new ProcurementPlanPosition();
        homePage = new HomePage();
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
