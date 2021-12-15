package kz.sapasoft.services;

import kz.sapasoft.model.Tender;

import static kz.sapasoft.pages.PagesManager.TEST_DATA_FILE_NAME;

public class TenderManager {

    private TenderManager() {
    }

    public static Tender getOpenTender() {
        return OpenTender.OPEN_TENDER;
    }

    private static class OpenTender {
        public static final Tender OPEN_TENDER = Tender.newBuilder()
                .setProcurementCode(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.code"))
                .setProcurementMethod(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.method"))
                .setProcurementPriority(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.priority"))
                .setLocalContentRatio(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("local.content.ratio"))
                .setDate(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.date"))
                .setProcurementAddress(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.address"))
                .setTenderAddress(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.tender.address"))
                .setDeliveryCountry(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.delivery.country"))
                .setDeliveryAddress(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("procurement.delivery.address"))
                .setIncoterms(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("incoterms"))
                .setSchedulePeriod(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("schedule.period"))
                .setEndDate(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("end.date"))
                .setPrepay(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("prepay"))
                .build();
    }
}

