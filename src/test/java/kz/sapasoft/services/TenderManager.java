package kz.sapasoft.services;

import kz.sapasoft.model.Tender;

public class TenderManager {

    private TenderManager() {
    }

    public static Tender getOpenTender() {
        return OpenTender.OPEN_TENDER;
    }

    private static class OpenTender {
        public static final Tender OPEN_TENDER = Tender.newBuilder()
                .setProcurementCode(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.code"))
                .setProcurementMethod(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.method"))
                .setProcurementPriority(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.priority"))
                .build();
    }
}

