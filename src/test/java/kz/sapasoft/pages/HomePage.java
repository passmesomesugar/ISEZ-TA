package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends PagesManager {

    public SelenideElement newsRow = element(Selectors.byXpath("//div[@class='news__item ng-star-inserted']"));
    public SelenideElement registryResult = element(Selectors.byXpath("//tbody/tr[2]"));
    public SelenideElement searchParticipantResult = element(Selectors.byXpath("//tbody/tr/td/a"));
    public SelenideElement title = element(Selectors.byXpath("//sk-document-signing-info//h2")); //для проверки отображения результата нужен номер документа, пока проверяю что есть заголовок
    public SelenideElement faqInfo = element(Selectors.byXpath("//div[@class='faq-list__item ng-star-inserted']"));
    public SelenideElement lotsList = element(Selectors.byXpath("//sk-search-result/div/div"));
    public SelenideElement purchasesList = element(Selectors.byXpath("//sk-search-result/div/div"));
    public SelenideElement contractsList = element(Selectors.byXpath("//sk-search-result/div/div"));
    public SelenideElement exportInfo = element(Selectors.byXpath("//tbody/tr"));
    public SelenideElement yearPlanInfo = element(Selectors.byXpath("//tbody/tr"));
    public SelenideElement holdingCategoriesInfo = element(Selectors.byXpath("//tbody/tr"));
    public SelenideElement zksSuppliersInfo = element(Selectors.byXpath("//div[@class='m-sidebar__layout m-sidebar__layout--found-item ng-star-inserted']"));
    public SelenideElement longTermPlanInfo = element(Selectors.byXpath("//tbody/tr"));
    public SelenideElement regulationsInfo = element(Selectors.byXpath("//div[@class='regulation-list__item ng-star-inserted']"));
    public SelenideElement companyInfoButton = element(Selectors.byAttribute("jhitranslate", "layouts.aboutCompany"));
   // public String SelenideElement = element(Selectors.byXpath("//*[@jhitranslate='layouts.login']/following-sibling::text()"));

    public void openNews() {
        element(Selectors.byXpath("//ul[@class='m-list m-list--nav']/li/a[@jhitranslate='main.news']")).click();
    }

    public void openRegistry() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.registry']")).click();
    }

    public void chooseRegistry() {
        element(Selectors.byXpath("//div[@class='skDeleteBtn']/select")).click();
        element(Selectors.byXpath("//div[@class='skDeleteBtn']/select/option[contains(@value, '1: GENUINE_SUPPLIER')]")).click();
    }

    public void searchRegistry() {
        element(Selectors.byXpath("//span[@jhitranslate='eProcGatewayApp.planItem.searchParam.search']")).click();
    }

    public void openParticipantsDirectory() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.participantsDirectory']")).click();
    }

    public void searchParticipant() {
        element(Selectors.byXpath("//span[@jhitranslate='eProcGatewayApp.planItem.searchParam.search']")).click();
    }

    public void openSignatureVerification() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.signingVerification']")).click();
    }

    public void openFAQ() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.faq']")).click();
    }

    public void openSearchLots() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.searchLots']")).click();
    }

    public void chooseLots() {
        element(Selectors.byXpath("//li/label[@for='lot']")).click();
    }

    public void choosePurchases() {
        element(Selectors.byXpath("//li/label[@for='advert']")).click();
    }

    public void chooseContracts() {
        element(Selectors.byXpath("//li/label[@for='contractCard']")).click();
    }

    public void openSearchPlans() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.searchPlans']")).click();
    }

    public void exportPlans() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.planExport']")).click();
    }

    public void yearPlan() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.consolidatedYearPlan']")).click();
    }

    public void longTermPlan() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.consolidatedPlan']")).click();
    }

    public void openRegulations() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.regulations']")).click();
    }

    public void chooseManual() {
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][1]")).click();
    }

    public void chooseVideo() {
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][2]")).click();
    }

    public void chooseDirectories() {
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][3]")).click();
    }

    public void chooseStandarts() {
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][4]")).click();
    }

    public void chooseOther() {
        element(Selectors.byXpath("//div[@class='regulation-tab mr-4 ng-star-inserted'][5]")).click();
    }

    public void openKmz() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.kmz']")).click();
    }

    public void openCategories() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.categories']")).click();
    }

    public void chooseZksSuppliers() {
        element(Selectors.byXpath("//a[@jhitranslate='categories.tab2']")).click();
    }

    public void logIn(String user, String password) {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
        element(Selectors.byAttribute("jhitranslate", "layouts.register")).click();
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.loginWithoutEds")).click();
        element(Selectors.byXpath("//*[@name='username']//input")).setValue(user);
        element(Selectors.byXpath("//*[@type='password']")).setValue(password);
        element(Selectors.byXpath("//*[@type='submit']")).click();
        logger.info("User name and password were submitted for:" + this.getClass().toString());
    }

    public void logOut() {
        element(Selectors.byAttribute("jhitranslate", "global.menu.account.logout")).click();
    }

    public void clickCompanyInfo() {
        companyInfoButton.click();
    }
}
