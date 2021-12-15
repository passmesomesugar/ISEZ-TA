package kz.sapasoft.tests.sanity.logged_out;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import kz.sapasoft.tests.BasicTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class LoggedOutTest  extends BasicTestConditions{


    @Test(groups = "test", description = "")
    public void news() {
        open(MAIN_URL);
        getHomePage().openNews();
        element(Selectors.byXpath("//div[@class='news__item ng-star-inserted']")).shouldBe(Condition.exist);
    }

    @Test (groups = "test", description = "")
    public void registry() {
        open(MAIN_URL);
        getHomePage().openRegistry();
        getHomePage().chooseRegistry();
        getHomePage().searchRegistry();
        element(Selectors.byXpath("//tbody/tr/td/a")).shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void participantDirectory() {
        open(MAIN_URL);
        getHomePage().openParticipantsDirectory();
        element(Selectors.byXpath("//h2[@jhitranslate='participants.title']")).shouldBe(Condition.visible);
        getHomePage().searchParticipant();
        element(Selectors.byXpath("//tbody/tr/td/a")).shouldBe(Condition.visible);
    }

    @Test(groups = "test", description = "")
    public void signatureVerification() {
        open(MAIN_URL);
        getHomePage().openSignatureVerification();
        element(Selectors.byXpath("//sk-document-signing-info//h2")).shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void Faq() {
        open(MAIN_URL);
        getHomePage().openFAQ();
        element(Selectors.byXpath("//div[@class='faq-list__item ng-star-inserted']")).shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void searchLots() {
        open(MAIN_URL);
        getHomePage().openSearchLots();
        element(Selectors.byXpath("//li/label[@for='lot']")).click();
        element(Selectors.byXpath("//sk-search-result/div/div")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//li/label[@for='advert']")).click();
        element(Selectors.byXpath("//sk-search-result/div/div")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//li/label[@for='contractCard']")).click();
        element(Selectors.byXpath("//sk-search-result/div/div")).shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void searchPlans() {
        open(MAIN_URL);
        getHomePage().openSearchPlans();
        element(Selectors.byXpath("//a[@jhitranslate='layouts.planExport']")).click();
        element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//a[@jhitranslate='layouts.searchPlans']")).click();
        element(Selectors.byXpath("//a[@jhitranslate='layouts.consolidatedYearPlan']")).click();
        element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//a[@jhitranslate='layouts.searchPlans']")).click();
        element(Selectors.byXpath("//a[@jhitranslate='layouts.consolidatedPlan']")).click();
        element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);

    }

    @Test(groups = "test", description = "")
    public void regulations() {
        open(MAIN_URL);
        getHomePage().openRegulations();
        element(Selectors.byXpath("//div[@jhitranslate='regulation.title']")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][1]")).click();
        element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][2]")).click();
        element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][3]")).click();
        element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][4]")).click();
        element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][5]")).click();
        element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']")).shouldBe(Condition.visible);

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
        element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
        element(Selectors.byXpath("//a[@jhitranslate='categories.tab2']")).click();
        element(Selectors.byXpath("//div[@class='m-sidebar__layout m-sidebar__layout--found-item ng-star-inserted']")).shouldBe(Condition.visible);
    }

}
