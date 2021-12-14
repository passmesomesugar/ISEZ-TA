package kz.sapasoft.services;

import kz.sapasoft.model.PurchaseRequisition;

import static kz.sapasoft.pages.PagesManager.TEST_DATA_FILE_NAME;

public class PurchaseRequisitionManager {

    private PurchaseRequisitionManager() {
    }

    public static PurchaseRequisition getPurchaseRequisition() {
        return DefaultPurchaseRequisition.DEFAULT_PURCHASE_REQUISITION;
    }

    private static class DefaultPurchaseRequisition {
        public static final PurchaseRequisition DEFAULT_PURCHASE_REQUISITION = PurchaseRequisition.newBuilder()
                .setAppNumber(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("app.number"))
                .setProviderPrice(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("provider.price"))
                .setRuText(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("ruText"))
                .setKzText(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("kzText"))
                .setExperience(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("work.experience"))
                .setExpTRU(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("exp.tru"))
                .setExcelFilePath(PropertyDataReader.getProperties(TEST_DATA_FILE_NAME).getProperty("excel.file.path"))
                .build();
    }
}
