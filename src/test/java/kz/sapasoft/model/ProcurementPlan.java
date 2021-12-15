package kz.sapasoft.model;

public class ProcurementPlan {
    private String year;
    private String planType;
    private String timeFrame;

    public String getYear() {
        return year;
    }

    public String getPlanType() {
        return planType;
    }

    public String getTimeFrame() {
        return timeFrame;
    }

    public static ProcurementPlan.ProcurementPlanBuilder newBuilder() {
        return new ProcurementPlan().new ProcurementPlanBuilder();
    }


    public class ProcurementPlanBuilder {
        public ProcurementPlanBuilder() {
        }

        public ProcurementPlanBuilder setYear(String year) {
            ProcurementPlan.this.year = year;
            return this;
        }

        public ProcurementPlanBuilder setPlanType(String planType) {
            ProcurementPlan.this.planType = planType;
            return this;
        }

        public ProcurementPlanBuilder setTimeFrame(String timeFrame) {
            ProcurementPlan.this.timeFrame = timeFrame;
            return this;
        }

        public ProcurementPlan build() {
            return ProcurementPlan.this;
        }
    }
}
