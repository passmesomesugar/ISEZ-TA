package kz.sapasoft.services;

import kz.sapasoft.model.Tender;

public class TenderManager {
    public String positionProcurementTestingScenario = System.getProperty("position.scenario");
    public static String testingScenario = System.getProperty("procurement.plan.scenario");

    private TenderManager() {
    }

    public static Tender getOpenTender() {
        return OpenTender.OPEN_TENDER;
    }

    private static class OpenTender {
        public static final Tender OPEN_TENDER = Tender.newBuilder().setYear(PropertyDataReader.getProperties(testingScenario).getProperty("procurement.plan.year")).build();
    }
}

