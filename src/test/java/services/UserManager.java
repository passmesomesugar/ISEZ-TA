package services;

import java.util.Properties;

public class UserManager {
    public String currentUserEnv = System.getProperty("user");
    private static Properties properties = PropertyDataReader.getProperties(System.getProperty("user"));
    public String userName = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.name");
}
