package kz.sapasoft.services;

import kz.sapasoft.model.PurchaseRequisition;

public class PurchaseRequisitionManager {

    private PurchaseRequisitionManager() {
    }

    public static PurchaseRequisition getPurchaseRequisition() {
        return DefaultPurchaseRequisition.DEFAULT_PURCHASE_REQUISITION;
    }

    private static class DefaultPurchaseRequisition {
        public static final PurchaseRequisition DEFAULT_PURCHASE_REQUISITION = PurchaseRequisition.newBuilder()
                .setAppNumber(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("app.number"))
                .setProviderPrice(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("provider.price"))
                .setRuText(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("ruText"))
                .setKzText(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("kzText"))
                .setExperience(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("work.experience"))
                .setExpTRU(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("exp.tru"))
                .setExcelFilePath(PropertyDataReader.getProperties(System.getProperty("purchase.requisition.scenario")).getProperty("excel.file.path"))
                .build();
    }
}
