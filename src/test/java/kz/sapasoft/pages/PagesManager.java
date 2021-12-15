package kz.sapasoft.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import kz.sapasoft.services.PropertyDataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.element;

public class PagesManager {
    public final int LOAD_PAUSE = 4000;
    public final int MICRO_LOAD_PAUSE = 700;
    public final int MINI_LOAD_PAUSE = 1500;

    public static final String TEST_DATA_FILE_NAME = "test-data";

    protected static final Logger logger = LogManager.getLogger(PagesManager.class);
    //protected static final Logger logger1 = LogManager.getRootLogger();

    public String currentUserEnv = System.getProperty("user");
    public String testingScenario = System.getProperty("procurement.plan.scenario");
    public String currentTestingEnv = System.getProperty("env");
    public String MAIN_URL = PropertyDataReader.getProperties(currentTestingEnv).getProperty("main.url");

    private ProcurementPlan procurementPlan;
    private PersonalCabinet personalCabinet;
    private ProcurementPlanPosition procurementPlanPosition;
    private HomePage homePage;
    private ProcurementPlanPositions procurementPlanPositions;
    private SubmitPurchaseRequest submitPurchaseRequest;

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

    public ProcurementPlanPositions getProcurementPlanPositionsPage() {
        return procurementPlanPositions;
    }

    public SubmitPurchaseRequest getSubmitPurchaseRequest() {
        return submitPurchaseRequest;
    }


    @BeforeClass(alwaysRun = true)
    public void setUpPages() {
        logger.info("Execution started for:" + this.getClass().toString());
        procurementPlan = new ProcurementPlan();
        personalCabinet = new PersonalCabinet();
        procurementPlanPosition = new ProcurementPlanPosition();
        homePage = new HomePage();
        procurementPlanPositions = new ProcurementPlanPositions();
        submitPurchaseRequest = new SubmitPurchaseRequest();
        logger.info("PageManager set pages:" + this.getClass().toString());
    }

    @AfterClass(alwaysRun = true)
    public void afterClassActions() {
        WebDriverRunner.closeWebDriver();
        logger.info("closeWebDriver() executed");
        logger.info("Execution ended for:" + this.getClass().toString());
    }

    public void checkIfNoErrorIsDisplayed() {
        element(Selectors.byXpath("//div[contains(@class, 'toast-error')]")).shouldNot(Condition.appear);
    }

    public void checkIfSuccessIsDisplayed() {
        element(Selectors.byXpath("//div[contains(@class, 'toast-success')]")).shouldNot(Condition.appear);
    }

    public void checkTableInPageBody() {
        element(Selectors.byXpath("//div[contains(@class, 'table')]")).shouldHave(Condition.exist);
    }
}
