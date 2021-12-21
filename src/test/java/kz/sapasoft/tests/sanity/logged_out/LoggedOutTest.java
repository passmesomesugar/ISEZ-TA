package kz.sapasoft.tests.sanity.logged_out;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class LoggedOutTest extends BasicTestConditions {


    @Test(groups = "test", description = "")
    public void news() {
        open(MAIN_URL);
        getHomePage().openNews();
        getHomePage().newsRow.shouldBe(Condition.exist);
    }

    @Test(groups = "test", description = "")
    public void registry() {
        open(MAIN_URL);
        getHomePage().openRegistry();
        getHomePage().chooseRegistry();
        getHomePage().searchRegistry();
        getHomePage().registryResult.shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void participantDirectory() {
        open(MAIN_URL);
        getHomePage().openParticipantsDirectory();
        getHomePage().searchParticipant();
        getHomePage().searchParticipantResult.shouldBe(Condition.visible);
    }

    @Test(groups = "test", description = "")
    public void signatureVerification() {
        open(MAIN_URL);
        getHomePage().openSignatureVerification();
        getHomePage().title.shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void Faq() {
        open(MAIN_URL);
        getHomePage().openFAQ();
        getHomePage().faqInfo.shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void searchLots() {
        open(MAIN_URL);
        getHomePage().openSearchLots();
        getHomePage().chooseLots();
        getHomePage().lotsList.shouldBe(Condition.visible);
        getHomePage().choosePurchases();
        getHomePage().purchasesList.shouldBe(Condition.visible);
        getHomePage().chooseContracts();
        getHomePage().contractsList.shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void searchPlans() {
        open(MAIN_URL);
        getHomePage().openSearchPlans();
        getHomePage().exportPlans();
        getHomePage().exportInfo.shouldBe(Condition.visible);
        getHomePage().openSearchPlans();
        getHomePage().yearPlan();
        getHomePage().yearPlanInfo.shouldBe(Condition.visible);
        getHomePage().openSearchPlans();
        getHomePage().longTermPlan();
        getHomePage().longTermPlanInfo.shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void regulations() {
        open(MAIN_URL);
        getHomePage().openRegulations();
        getHomePage().regulationsInfo.shouldBe(Condition.visible);
        getHomePage().chooseManual();
        getHomePage().regulationsInfo.shouldBe(Condition.visible);
        getHomePage().chooseVideo();
        getHomePage().regulationsInfo.shouldBe(Condition.visible);
        getHomePage().chooseDirectories();
        getHomePage().regulationsInfo.shouldBe(Condition.visible);
        getHomePage().chooseStandarts();
        getHomePage().regulationsInfo.shouldBe(Condition.visible);
        getHomePage().chooseOther();
        getHomePage().regulationsInfo.shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void kmz() {
        open(MAIN_URL);
        getHomePage().openKmz();
    }

    @Test(groups = "test", description = "")
    public void categories() {
        open(MAIN_URL);
        getHomePage().openCategories();
        getHomePage().holdingCategoriesInfo.shouldBe(Condition.visible);
        getHomePage().chooseZksSuppliers();
        getHomePage().zksSuppliersInfo.shouldBe(Condition.visible);
    }

}
