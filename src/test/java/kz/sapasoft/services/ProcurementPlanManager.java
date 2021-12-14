package kz.sapasoft.services;

import kz.sapasoft.model.ProcurementPlan;

import static kz.sapasoft.pages.PagesManager.TEST_DATA_FILE_NAME;

/*
 * ProcurementList ~ перечень закупок
 * ProcurementPLan ~  план закупок
 * LONG TERM - ДОЛГОСРОЧНЫЙ
 * MAIN - ОСНОВНОЙ
 * */
public class ProcurementPlanManager {

    private ProcurementPlanManager() {
    }

    public static ProcurementPlan getProcurementList() {
        return ProcurementList.LIST_LONG_TERM;
    }

    public static ProcurementPlan getProcurementPlanMainAnnual() {
        return ProcurementMain.ANNUAL_MAIN;
    }

    private static class ProcurementList {
        public static final ProcurementPlan LIST_LONG_TERM = ProcurementPlan.newBuilder()
                .setYear(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.plan.list.year"))
                .setPlanType(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.plan.list.type"))
                .setTimeFrame(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.list.time.frame"))
                .build();
    }

    private static class ProcurementMain {
        public static final ProcurementPlan ANNUAL_MAIN = ProcurementPlan.newBuilder()
                .setYear(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.plan.main.year"))
                .setPlanType(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.plan.main.type"))
                .setTimeFrame(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.main.time.frame"))
                .build();
    }
}
