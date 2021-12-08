package kz.sapasoft.model;

public class PurchaseRequisition {
    private String appNumber;
    private String providerPrice;
    private String ruText;
    private String kzText;
    private String workExperience;
    private String expTRU;
    private String filePath;

    public String getAppNumber() {
        return appNumber;
    }

    public String getProviderPrice() {
        return providerPrice;
    }

    public String getRuText() {
        return ruText;
    }

    public String getKzText() {
        return kzText;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public String getExpTRU() {
        return expTRU;
    }

    public String getFilePath() {
        return filePath;
    }

    public static PurchaseRequisitionBuilder newBuilder() {
        return new PurchaseRequisition().new PurchaseRequisitionBuilder();
    }

    public class PurchaseRequisitionBuilder {
        public PurchaseRequisitionBuilder() {
        }

        public PurchaseRequisitionBuilder setAppNumber(String appNumber) {
            PurchaseRequisition.this.appNumber = appNumber;
            return this;
        }

        public PurchaseRequisitionBuilder setProviderPrice(String price) {
            PurchaseRequisition.this.providerPrice = price;
            return this;
        }

        public PurchaseRequisitionBuilder setRuText(String text) {
            PurchaseRequisition.this.ruText = text;
            return this;
        }

        public PurchaseRequisitionBuilder setKzText(String text) {
            PurchaseRequisition.this.kzText = text;
            return this;
        }

        public PurchaseRequisitionBuilder setExperience(String workExperience) {
            PurchaseRequisition.this.workExperience = workExperience;
            return this;
        }

        public PurchaseRequisitionBuilder setExpTRU(String exp) {
            PurchaseRequisition.this.expTRU = exp;
            return this;
        }

        public PurchaseRequisitionBuilder setExcelFilePath(String path) {
            PurchaseRequisition.this.filePath = path;
            return this;
        }

        public PurchaseRequisition build() {
            return PurchaseRequisition.this;
        }

    }
}

