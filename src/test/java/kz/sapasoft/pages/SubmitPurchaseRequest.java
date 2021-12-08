package kz.sapasoft.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;

public class SubmitPurchaseRequest extends PagesManager {

    @Step("шаг1")
    public void goToMainPage() {
        element(Selectors.byXpath("//span[@jhitranslate=\"layouts.goToMain\"]")).click();
    }

    @Step("шаг2")
    public void searchApplicationNumber(String num) {
        element(Selectors.byXpath("//input[@name=\"keywordName\"]")).setValue(num);
        element(Selectors.byXpath("//button[@type=\"submit\"]")).click();
    }

    @Step("шаг3")
    public void openApplication(String num) {
        element(Selectors.byXpath("//div[contains(text(),'" + num + "')]")).click();
    }

    @Step("шаг4")
    public void chooseLot() {
        element(Selectors.byXpath("//sk-checkbox//span")).click();
    }

    @Step("шаг5")
    public void applyButton() {
        element(Selectors.byXpath("//sk-main-dialog//div[@class=\"m-modal__row\"]/button")).click();
    }

    @Step("шаг6")
    public void confirmDataCheckbox() {
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirement\"]/ancestor::table//tbody/tr/td[2]//label/span")).scrollTo();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirement\"]/ancestor::table//tbody/tr/td[2]//label/span")).click();
    }

    @Step("шаг7")
    public void openLotsRequirments() {
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirementsCriterias\"]")).scrollTo();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.requirementsCriterias\"]")).click();
    }

    @Step("шаг8")
    public void fillProviderPrice(String price) {
        element(Selectors.byXpath("//sk-numberbox[@name=\"foreignPrice\"]//input")).setValue(price);
    }

    @Step("шаг9")
    public void fillDescriptionRu(String ruText) {
        element(Selectors.byXpath("//sk-froala-editor[@name=\"detailRu\"]//div[@role=\"application\"]/div[3]//p")).setValue(ruText);
    }

    @Step("шаг10")
    public void fillDescriptionKz(String kzText) {
        element(Selectors.byXpath("//sk-froala-editor[@name=\"detailKk\"]//div[@role=\"application\"]/div[3]//p")).setValue(kzText);
    }

    @Step("шаг11")
    public void uploadProvidingApplication(File file) {
        element(By.xpath("//sk-fileupload[@name=\"requestProviding\"]//input[@type=\"file\"]")).uploadFile(file);
    }

    @Step("шаг12")
    public void managmentSertification(File file) {
        element(Selectors.byXpath("//tbody/tr[1]//sk-select//select")).scrollTo();
        element(Selectors.byXpath("//tbody/tr[1]//sk-select//select")).click();
        element(Selectors.byXpath("//tbody/tr[1]//sk-select//select")).selectOptionByValue("1: true");
        element(By.xpath("//tbody/tr[1]/td[1]//sk-fileupload//input[@type=\"file\"]")).uploadFile(file);
    }

    @Step("шаг13")
    public void fillWorkExperienceTRU(String expTRU, File file) {
        element(Selectors.byXpath("//tbody/tr[2]//sk-numberbox//input")).setValue(expTRU);
        element(By.xpath("//tbody/tr[2]/td[1]//sk-fileupload//input[@type=\"file\"]")).uploadFile(file);
    }

    @Step("шаг14")
    public void consistsInRegistry(File file) {
        element(Selectors.byXpath("//tbody/tr[4]//sk-select//select")).click();
        element(Selectors.byXpath("//tbody/tr[4]//sk-select//select")).selectOptionByValue("1: true");
        element(By.xpath("//tbody/tr[4]/td[1]//sk-fileupload//input[@type=\"file\"]")).uploadFile(file);
    }

    @Step("шаг15")
    public void fillWorkExperience(String workExp, File file) {
        element(Selectors.byXpath("//tbody//sk-numberbox[@name=\"workExperience\"]//input")).scrollTo();
        element(Selectors.byXpath("//tbody//sk-numberbox[@name=\"workExperience\"]//input")).setValue(workExp);
        element(By.xpath("//sk-fileupload[@name=\"docs\"]//input[@type=\"file\"]")).uploadFile(file);
        /*Do not erase Condition*/
        element(By.xpath("//sk-fileupload[@name=\"docs\"]//button[@class=\"button button--remove ng-star-inserted\"]")).shouldBe(Condition.visible);
    }

    @Step("шаг16")
    public void saveButton() {

        element(Selectors.byXpath("//button[@jhitranslate=\"advert.lotReq.save\"]")).scrollTo();
        element(Selectors.byXpath("//button[@jhitranslate=\"advert.lotReq.save\"]")).click();
    }

    @Step("шаг17")
    public void toFormDocument() {
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.createDocs\"]")).shouldBe(Condition.exist);
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.createDocs\"]")).click();
    }

    @Step("шаг18")
    public void reloadStatus() {

        while (element(Selectors.byXpath("//sk-multiple-signing//button/span")).is(Condition.not(Condition.exist))) {
            element(Selectors.byXpath("//span[@jhitranslate=\"entity.action.update\"]")).click();
            sleep(3000);
        }
    }

    @Step("шаг19")
    public void signDocuments() {
        element(Selectors.byXpath("//sk-multiple-signing//button/span")).shouldBe(Condition.exist);
        element(Selectors.byXpath("//sk-multiple-signing//button/span")).click();
        element(Selectors.byXpath("//div[@class=\"modal-content\"]//span[@jhitranslate=\"eds.getCertData\"]")).shouldBe(Condition.visible);

    }

    @Step("шаг20")
    public void deleteApplication(String number) {
        element(Selectors.byXpath("//div[@class=\"modal-content\"]//span[@jhitranslate=\"entity.action.cancel\"]")).click();
        element(Selectors.byXpath("//span[@jhitranslate=\"layouts.bid\"]")).click();
        element(Selectors.byXpath("//span[@jhitranslate=\"eProcGatewayApp.participation.title\"]")).click();
        element(Selectors.byXpath("//a[text()=" + number + "]/ancestor::tr//button[@id=\"dropdownParticipation\"]")).click();
        element(Selectors.byXpath("//a[text()=" + number + "]/ancestor::tr//a[@jhitranslate=\"participation.delete\"]")).click();
        element(Selectors.byXpath("//span[@jhitranslate=\"entity.action.delete\"]")).click();
    }
}
