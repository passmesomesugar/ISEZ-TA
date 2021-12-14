package kz.sapasoft.tests.sanity.logged_out;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class LoggedOutTest {


        @Test
        public void news(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//ul[@class=\"m-list m-list--nav\"]/li/a[@jhitranslate=\"main.news\"]")).click();
            element(Selectors.byXpath("//div[@class=\"news__item ng-star-inserted\"]")).shouldBe(Condition.exist);

        }

        @Test
        public void registry(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate='layouts.registry']")).click();
            element(Selectors.byXpath("//div[@class='skDeleteBtn']/select")).click();
            element(Selectors.byXpath("//div[@class='skDeleteBtn']/select/option[contains(@value, '1: GENUINE_SUPPLIER')]")).click();
            element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.planItem.searchParam.search\"]")).click();
            element(Selectors.byXpath("//tbody/tr/td/a")).shouldBe(Condition.visible);
            // Configuration.holdBrowserOpen = true;

        }

        @Test
        public void participantDirectory(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.participantsDirectory\"]")).click();
            element(Selectors.byXpath("//h2[@jhitranslate=\"participants.title\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.planItem.searchParam.search\"]")).click();
            element(Selectors.byXpath("//tbody/tr/td/a")).shouldBe(Condition.visible);
        }

        @Test
        public void signatureVerification(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.signingVerification\"]")).click();
            element(Selectors.byXpath("//sk-document-signing-info//h2")).shouldBe(Condition.visible);

        }

        @Test
        public void Faq(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.faq\"]")).click();
            // element(Selectors.byXpath("//div[@jhitranslate=\"faq.title\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"faq-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);

        }

        @Test
        public void searchLots(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.searchLots\"]")).click();
            element(Selectors.byXpath("//li/label[@for=\"lot\"]")).click();
            element(Selectors.byXpath("//sk-search-result/div/div")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//li/label[@for=\"advert\"]")).click();
            element(Selectors.byXpath("//sk-search-result/div/div")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//li/label[@for=\"contractCard\"]")).click();
            element(Selectors.byXpath("//sk-search-result/div/div")).shouldBe(Condition.visible);

        }

        @Test
        public void searchPlans(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.searchPlans\"]")).click();
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.planExport\"]")).click();
            element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.searchPlans\"]")).click();
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.consolidatedYearPlan\"]")).click();
            element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.searchPlans\"]")).click();
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.consolidatedPlan\"]")).click();
            element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
            //Configuration.holdBrowserOpen = true;

        }

        @Test
        public void regulations(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.regulations\"]")).click();
            element(Selectors.byXpath("//div[@jhitranslate=\"regulation.title\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"regulation-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"regulation-tab mr-4 ng-star-inserted\"][1]")).click();
            element(Selectors.byXpath("//div[@class=\"regulation-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"regulation-tab mr-4 ng-star-inserted\"][2]")).click();
            element(Selectors.byXpath("//div[@class=\"regulation-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"regulation-tab mr-4 ng-star-inserted\"][3]")).click();
            element(Selectors.byXpath("//div[@class=\"regulation-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"regulation-tab mr-4 ng-star-inserted\"][4]")).click();
            element(Selectors.byXpath("//div[@class=\"regulation-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//div[@class=\"regulation-tab mr-4 ng-star-inserted\"][5]")).click();
            element(Selectors.byXpath("//div[@class=\"regulation-list__item ng-star-inserted\"]")).shouldBe(Condition.visible);

        }

        @Test
        public void kmz(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.kmz\"]")).click();




        }

        @Test
        public void categories(){
            open("http://dev10.sapasoft.kz/#/ext");
            element(Selectors.byXpath("//a[@jhitranslate=\"layouts.categories\"]")).click();
            element(Selectors.byXpath("//tbody/tr")).shouldBe(Condition.visible);
            element(Selectors.byXpath("//a[@jhitranslate=\"categories.tab2\"]")).click();
            element(Selectors.byXpath("//div[@class=\"m-sidebar__layout m-sidebar__layout--found-item ng-star-inserted\"]")).shouldBe(Condition.visible);
        }

}
