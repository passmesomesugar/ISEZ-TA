package kz.sapasoft.services;

import kz.sapasoft.model.User;

public class UserManager {
    private static String currentUserEnv = System.getProperty("users");

    private UserManager() {
    }

    public static User getCustomerOne() {
        return Customer.CUSTOMER_ONE;
    }

    public static User getCustomerTwo() {
        return Customer.CUSTOMER_TWO;
    }

    public static User getSupplierOne() {
        return Supplier.SUPPLIER_ONE;
    }

    public static User getSupplierTwo() {
        return Supplier.SUPPLIER_TWO;
    }

    private static class Customer {
        public static final User CUSTOMER_ONE = User.newBuilder()
                .setName(PropertyDataReader.getProperties(currentUserEnv).getProperty("customer.1.name"))
                .setPassword(PropertyDataReader.getProperties(currentUserEnv).getProperty("customer.1.password")).build();

        public static final User CUSTOMER_TWO = User.newBuilder()
                .setName(PropertyDataReader.getProperties(currentUserEnv).getProperty("customer.2.name"))
                .setPassword(PropertyDataReader.getProperties(currentUserEnv).getProperty("customer.2.password")).build();

    }

    private static class Supplier {
        public static final User SUPPLIER_ONE = User.newBuilder()
                .setName(PropertyDataReader.getProperties(currentUserEnv).getProperty("supplier.1.name"))
                .setPassword(PropertyDataReader.getProperties(currentUserEnv).getProperty("supplier.1.password")).build();

        public static final User SUPPLIER_TWO = User.newBuilder()
                .setName(PropertyDataReader.getProperties(currentUserEnv).getProperty("supplier.2.name"))
                .setPassword(PropertyDataReader.getProperties(currentUserEnv).getProperty("supplier.2.password")).build();
    }
}
