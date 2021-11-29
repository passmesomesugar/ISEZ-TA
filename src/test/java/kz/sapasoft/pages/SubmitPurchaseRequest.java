package kz.sapasoft.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;

public class SubmitPurchaseRequest extends PagesManager{
    String providerPrice = "100";
    String num= "115265";

    File file = new File("src/test/resources/test.xlsx");

    @Step("шаг1")
    public void goToMainPage(){
        element(Selectors.byXpath("//span[@jhitranslate=\"layouts.goToMain\"]")).click();
    }

    @Step("шаг2")
    public void searchApplicationNumber(){
        element(Selectors.byXpath("//input[@name=\"keywordName\"]")).setValue(num);
        element(Selectors.byXpath("//button[@type=\"submit\"]")).click();
    }
    @Step("шаг3")
    public void openApplication(){
        element(Selectors.byXpath("//div[contains(text(),'"+num+"')]")).click();
    }

    @Step("шаг4")
    public void chooseLot(){
        element(Selectors.byXpath("//sk-checkbox//span")).click();
    }

    @Step("шаг5")
    public void applyButton(){
        element(Selectors.byXpath("//sk-main-dialog//div[@class=\"m-modal__row\"]/button")).shouldNotBe(Condition.disabled);
        element(Selectors.byXpath("//sk-main-dialog//div[@class=\"m-modal__row\"]/button")).click();
    }

    @Step("шаг6")
    public void confirmDataCheckbox(){
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirement\"]/ancestor::table//tbody/tr/td[2]//label/span")).scrollTo();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirement\"]/ancestor::table//tbody/tr/td[2]//label/span")).click();
    }
    @Step("шаг7")
    public void openLotsRequirments(){
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirementsCriterias\"]")).scrollTo();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirementsCriterias\"]")).click();
    }

    @Step("шаг8")
    public void fillProviderPrice(){
        element(Selectors.byXpath("//sk-numberbox[@name=\"foreignPrice\"]//input")).setValue(providerPrice);
    }
    @Step("шаг9")
    public void fillDescriptionRu(){
        element(Selectors.byXpath("//sk-froala-editor[@name=\"detailRu\"]//div[@role=\"application\"]/div[3]//p")).setValue("testru");
    }
    @Step("шаг10")
    public void fillDescriptionKz(){
        element(Selectors.byXpath("//sk-froala-editor[@name=\"detailKk\"]//div[@role=\"application\"]/div[3]//p")).setValue("testkz");
    }
    @Step("шаг11")
    public void uploadProvidingApplication(){
        element(By.xpath("//sk-fileupload[@name=\"requestProviding\"]//input[@type=\"file\"]")).uploadFile(file);
    }
    @Step("шаг12")
    public void managmentSertification(){
        element(Selectors.byXpath("//tbody/tr[1]//sk-select//select")).click();
        element(Selectors.byXpath("//tbody/tr[1]//sk-select//select")).selectOptionByValue("1: true");
        element(By.xpath("//tbody/tr[1]/td[1]//sk-fileupload//input[@type=\"file\"]")).uploadFile(file);
    }

    @Step("шаг13")
    public void fillWorkExperienceTRU(){
        element(Selectors.byXpath("//tbody/tr[2]//sk-numberbox//input")).setValue("5");
        element(By.xpath("//tbody/tr[2]/td[1]//sk-fileupload//input[@type=\"file\"]")).uploadFile(file);

    }

    @Step("шаг14")
    public void consistsInRegistry(){
        element(Selectors.byXpath("//tbody/tr[4]//sk-select//select")).click();
        element(Selectors.byXpath("//tbody/tr[4]//sk-select//select")).selectOptionByValue("1: true");
        element(By.xpath("//tbody/tr[4]/td[1]//sk-fileupload//input[@type=\"file\"]")).uploadFile(file);
    }

    @Step("шаг15")
    public void fillWorkExperience(){
        element(Selectors.byXpath("//tbody//sk-numberbox[@name=\"workExperience\"]//input")).setValue("5");
        element(By.xpath("//sk-fileupload[@name=\"docs\"]//input[@type=\"file\"]")).uploadFile(file);
    }
    @Step("шаг16")
    public void saveButton(){
        element(Selectors.byXpath("//button[@jhitranslate=\"advert.lotReq.save\"]")).scrollTo();
        element(Selectors.byXpath("//button[@jhitranslate=\"advert.lotReq.save\"]")).click();
    }
    @Step("шаг17")
    public void toFormDocument(){
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.createDocs\"]")).shouldNotBe(Condition.disabled);
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.createDocs\"]")).click();
    }
    @Step("шаг18")
    public void reloadStatus(){
        element(Selectors.byXpath("//span[@jhitranslate=\"entity.action.update\"]")).click();
        sleep(5000);
        element(Selectors.byXpath("//span[@jhitranslate=\"entity.action.update\"]")).click();
    }
    @Step("шаг19")
    public void signDocuments(){
       // String message = element(Selectors.byXpath("//div[@class=\"toast-content\"]/div[@class=\"toast-title\"]")).getText();
        //System.out.println(message);
        element(Selectors.byXpath("//sk-multiple-signing//button/span")).shouldBe(Condition.exist);
        element(Selectors.byXpath("//sk-multiple-signing//button/span")).click();
        element(Selectors.byXpath("//div[@class=\"modal-content\"]//span[@jhitranslate=\"eds.getCertData\"]")).shouldBe(Condition.visible);

    }

    @Step("шаг20")
    public void deleteApplication() {
        element(Selectors.byXpath("//div[@class=\"modal-content\"]//span[@jhitranslate=\"entity.action.cancel\"]")).click();
        element(Selectors.byXpath("//span[@jhitranslate=\"layouts.bid\"]")).click();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.title\"]")).click();
        element(Selectors.byXpath("//a[text()=\" 115265 \"]/ancestor::tr//button[@id=\"dropdownParticipation\"]")).click();
        element(Selectors.byXpath("//a[text()=\" 115265 \"]/ancestor::tr//a[@jhitranslate=\"participation.delete\"]")).click();
        element(Selectors.byXpath("//span[@jhitranslate=\"entity.action.delete\"]")).click();
    }
}
