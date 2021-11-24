package kz.sapasoft.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.element;

public class SubmitPurchaseRequest extends PagesManager{
    String providerPrice = "100";
    String num= "115265";

    File file = new File("src/test/resources/test.xlsx");


    public void goToMainPage(){
        element(Selectors.byXpath("//span[@jhitranslate=\"layouts.goToMain\"]")).click();
    }

    public void searchApplicationNumber(){
        element(Selectors.byXpath("//input[@name=\"keywordName\"]")).setValue(num);
        element(Selectors.byXpath("//button[@type=\"submit\"]")).click();
    }

    public void openApplication(){
        element(Selectors.byXpath("//div[contains(text(),'"+num+"')]")).click();
    }

    public void chooseLot(){
        element(Selectors.byXpath("//sk-checkbox//span")).click();
    }

    public void applyButton(){
        element(Selectors.byXpath("//sk-main-dialog//div[@class=\"m-modal__row\"]/button")).shouldNotBe(Condition.disabled);
        element(Selectors.byXpath("//sk-main-dialog//div[@class=\"m-modal__row\"]/button")).click();
    }

    public void confirmDataCheckbox(){
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirement\"]/ancestor::table//tbody/tr/td[2]//label/span")).scrollTo();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirement\"]/ancestor::table//tbody/tr/td[2]//label/span")).click();
    }

    public void openLotsRequirments(){
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirementsCriterias\"]")).scrollTo();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirementsCriterias\"]")).click();
    }

    public void fillProviderPrice(){
        element(Selectors.byXpath("//sk-numberbox[@name=\"foreignPrice\"]//input")).setValue(providerPrice);
    }

    public void fillDescriptionRu(){
        element(Selectors.byXpath("//sk-froala-editor[@name=\"detailRu\"]//div[@role=\"application\"]/div[3]//p")).setValue("testru");
    }

    public void fillDescriptionKz(){
        element(Selectors.byXpath("//sk-froala-editor[@name=\"detailKk\"]//div[@role=\"application\"]/div[3]//p")).setValue("testkz");
    }

    public void uploadProvidingApplication(){
        element(By.xpath("//sk-fileupload[@name=\"requestProviding\"]//input[@type=\"file\"]")).uploadFile(file);
    }



}
