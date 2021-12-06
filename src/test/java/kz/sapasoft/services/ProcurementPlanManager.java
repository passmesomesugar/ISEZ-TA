package kz.sapasoft.services;

import kz.sapasoft.model.ProcurementPlan;
/*
* ProcurementList ~ перечень закупок
*
* */
public class ProcurementPlanManager {

    private ProcurementPlanManager() {
    }

    public static ProcurementPlan getProcurementList() {
        return ProcurementList.LIST;
    }

    private static class ProcurementList {
        public static final ProcurementPlan LIST = ProcurementPlan.newBuilder()
                .setYear(PropertyDataReader.getProperties(System.getProperty("procurement.plan.scenario")).getProperty("procurement.plan.year"))
                .setPlanType(PropertyDataReader.getProperties(System.getProperty("procurement.plan.scenario")).getProperty("procurement.plan.type"))
                .setTimeFrame(PropertyDataReader.getProperties(System.getProperty("procurement.plan.scenario")).getProperty("procurement.time.frame"))
                .build();
    }
}
