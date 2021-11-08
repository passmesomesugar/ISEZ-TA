package kz.sapasoft.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.PropertyDataReader;

public class BasicTestConditions {
    protected static final Logger logger = LogManager.getLogger(BasicTestConditions.class);
    public String MAIN_URL = "http://dev10.sapasoft.kz/#/int/register";
    public String currentEnv = System.getProperty("env");

    public String userName = PropertyDataReader.getProperties(currentEnv).getProperty("user.name");
    public String password = PropertyDataReader.getProperties(currentEnv).getProperty("user.password");

}
