package kz.sapasoft.services;

import kz.sapasoft.model.User;



public class UserManager {
    private static String currentUserEnv = System.getProperty("user");
    private static String userName = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.name");
    private static String password = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.password");

    private UserManager() {
    }

    public static User getCustomer() {
        return Customer.CUSTOMER;
    }

    private static class Customer {
        public static final User CUSTOMER = User.newBuilder().setName(userName).setPassword(password).build();
    }
}
