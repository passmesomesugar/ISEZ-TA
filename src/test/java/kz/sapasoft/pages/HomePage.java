package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends PagesManager {


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

    public void openSearchPlans() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.searchPlans']")).click();
    }

    public void openRegulations() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.regulations']")).click();
    }

    public void openKmz() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.kmz']")).click();
    }

    public void openCategories() {
        element(Selectors.byXpath("//a[@jhitranslate='layouts.categories']")).click();
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
}
