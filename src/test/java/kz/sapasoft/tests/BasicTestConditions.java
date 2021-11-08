package kz.sapasoft.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.open;

public class BasicTestConditions {
    protected static final Logger logger = LogManager.getLogger(BasicTestConditions.class);
    public String MAIN_URL = "http://dev10.sapasoft.kz/#/int/register";
    public String currentEnv = System.getProperty("env");

    public String userName = PropertyDataReader.getProperties(currentEnv).getProperty("user.name");
    public String password = PropertyDataReader.getProperties(currentEnv).getProperty("user.password");

    public void openHome() {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
    }


}
