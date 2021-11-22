package kz.sapasoft.model;

public class Tender {

    private String procurementCode;
    private String procurementMethod;
    private String procurementPriority;
    private String localContentRatio;
    private String date;
    private String procurementAddress;
    private String tenderAddress;
    private String deliveryCountry;
    private String deliveryAddress;
    private String incoterms;
    private String schedulePeriod;

    public String getProcurementCode() {
        return procurementCode;
    }

    public String getProcurementMethod() {
        return procurementMethod;
    }

    public String getProcurementPriority() {
        return procurementPriority;
    }

    public String getLocalContentRatio() {
        return localContentRatio;
    }

    public String getDate() {
        return date;
    }

    public String getProcurementAddress() {
        return procurementAddress;
    }

    public String getTenderAddress() {
        return tenderAddress;
    }

    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getIncoterms() {
        return incoterms;
    }

    public String getSchedulePeriod() {
        return schedulePeriod;
    }

    public static TenderBuilder newBuilder() {
        return new Tender().new TenderBuilder();
    }


    public class TenderBuilder {
        public TenderBuilder() {
        }


        public TenderBuilder setProcurementCode(String procurementCode) {
            Tender.this.procurementCode = procurementCode;
            return this;
        }

        public TenderBuilder setProcurementMethod(String procurementMethod) {
            Tender.this.procurementMethod = procurementMethod;
            return this;

        }

        public TenderBuilder setProcurementPriority(String procurementPriority) {
            Tender.this.procurementPriority = procurementPriority;
            return this;

        }

        public TenderBuilder setLocalContentRatio(String localContentRatio) {
            Tender.this.localContentRatio = localContentRatio;
            return this;

        }

        public TenderBuilder setDate(String date) {
            Tender.this.date = date;
            return this;

        }

        public TenderBuilder setProcurementAddress(String procurementAddress) {
            Tender.this.procurementAddress = procurementAddress;
            return this;

        }

        public TenderBuilder setTenderAddress(String tenderAddress) {
            Tender.this.tenderAddress = tenderAddress;
            return this;

        }

        public TenderBuilder setDeliveryCountry(String deliveryCountry) {
            Tender.this.deliveryCountry = deliveryCountry;
            return this;

        }

        public TenderBuilder setDeliveryAddress(String deliveryAddress) {
            Tender.this.deliveryAddress = deliveryAddress;
            return this;

        }

        public TenderBuilder setIncoterms(String incoterms) {
            Tender.this.incoterms = incoterms;
            return this;

        }

        public TenderBuilder setSchedulePeriod(String schedulePeriod) {
            Tender.this.schedulePeriod = schedulePeriod;
            return this;

        }

        public Tender build() {
            return Tender.this;
        }

    }

}
