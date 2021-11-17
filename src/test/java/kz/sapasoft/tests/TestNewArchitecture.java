package kz.sapasoft.tests;

import org.testng.annotations.Test;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.*;

public class TestNewArchitecture extends BasicTestConditions {
    public String PROCUREMENT_CODE = PropertyDataReader.getProperties("customer").getProperty("procurement.code");

    @Test(groups = "1")
    void createProcurementPlanAndPositionTest() {

    }
}

