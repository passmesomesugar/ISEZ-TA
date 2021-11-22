package kz.sapasoft.pages;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends PagesManager {


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

    }
}
