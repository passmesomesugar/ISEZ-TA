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
                .setLocalContentRatio(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("local.content.ratio"))
                .setDate(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.date"))
                .setProcurementAddress(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.address"))
                .setTenderAddress(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.tender.address"))
                .setDeliveryCountry(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.delivery.country"))
                .setDeliveryAddress(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("procurement.delivery.address"))
                .setIncoterms(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("incoterms"))
                .setSchedulePeriod(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("schedule.period"))
                .setEndDate(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("end.date"))
                .setPrepay(PropertyDataReader.getProperties(System.getProperty("procurement.position.scenario")).getProperty("prepay"))
                .build();
    }
}

