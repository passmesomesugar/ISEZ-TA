package pages;

import com.codeborne.selenide.Selectors;
import services.PropertyDataReader;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends PagesManager {

    public String userName = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.name");
    public String password = PropertyDataReader.getProperties(currentUserEnv).getProperty("user.password");

    public void logIn() {
        open(MAIN_URL);
        logger.info("Main/home url opened for: " + this.getClass().toString());
        element(Selectors.byXpath("//span//*[text()='зарегистрироваться']")).click();
        element(Selectors.byXpath("//span[text()='Войти без ЭЦП']")).click();
        element(Selectors.byXpath("//*/label[text()=' Логин ']/../input")).setValue(userName);
        element(Selectors.byXpath("//*[@type='password']")).setValue(password);
        element(Selectors.byXpath("//*[@type='submit']")).click();
        logger.info("User name and password were submitted for:" + this.getClass().toString());
    }

    public void logOut() {

    }
}
