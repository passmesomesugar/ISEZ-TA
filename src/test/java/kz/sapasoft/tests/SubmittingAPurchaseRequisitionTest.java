package kz.sapasoft.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.element;
import static kz.sapasoft.services.PurchaseRequisitionManager.getPurchaseRequisition;
import static kz.sapasoft.services.UserManager.getSupplierOne;

public class SubmittingAPurchaseRequisitionTest extends BasicTestConditions {

    @Test(groups = "1", description = "")
    void SubmittingAPurchaseRequisitionTest() {
        getHomePage().logIn(getSupplierOne().getName(), getSupplierOne().getPassword());
        getPersonalCabinetPage().openPersonalCabinet();
        getSubmitPurchaseRequest().goToMainPage();
        getSubmitPurchaseRequest().searchApplicationNumber(getPurchaseRequisition().getAppNumber());
        getSubmitPurchaseRequest().openApplication(getPurchaseRequisition().getAppNumber());
        getSubmitPurchaseRequest().chooseLot();
        getSubmitPurchaseRequest().applyButton();
        getSubmitPurchaseRequest().openLotsRequirments();
        getSubmitPurchaseRequest().fillProviderPrice(getPurchaseRequisition().getProviderPrice());
        getSubmitPurchaseRequest().fillDescriptionRu(getPurchaseRequisition().getRuText());
        getSubmitPurchaseRequest().fillDescriptionKz(getPurchaseRequisition().getKzText());
        getSubmitPurchaseRequest().uploadProvidingApplication(new File(getPurchaseRequisition().getFilePath()));
        getSubmitPurchaseRequest().managmentSertification(new File(getPurchaseRequisition().getFilePath()));
        getSubmitPurchaseRequest().fillWorkExperienceTRU(getPurchaseRequisition().getExpTRU(), new File(getPurchaseRequisition().getFilePath()));
        getSubmitPurchaseRequest().consistsInRegistry(new File(getPurchaseRequisition().getFilePath()));
        getSubmitPurchaseRequest().fillWorkExperience(getPurchaseRequisition().getWorkExperience(), new File(getPurchaseRequisition().getFilePath()));
        getSubmitPurchaseRequest().saveButton();
        getSubmitPurchaseRequest().confirmDataCheckbox();
        getSubmitPurchaseRequest().toFormDocument();
        getSubmitPurchaseRequest().reloadStatus();
        getSubmitPurchaseRequest().signDocuments();
        element(Selectors.byXpath("//div[contains(@class, 'toast-success')]")).shouldHave(Condition.appear);
        getSubmitPurchaseRequest().deleteApplication(getPurchaseRequisition().getAppNumber());
        getPersonalCabinetPage().logOut();
    }
}
