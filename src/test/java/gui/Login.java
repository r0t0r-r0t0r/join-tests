package gui;

import core.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class Login extends TestBase {
    @Test
    void vkBoNegative() {
        open("https://dev.joinrpg.ru/account/login");
        $("#VKontakte").click();
        //$(byLinkText("Мои заявки")).isDisplayed();
    }

    @Test
    void vkBo() {
        open("https://dev.joinrpg.ru/account/login");
        $("#VKontakte").click();
        //$(byLinkText("Мои заявки")).isDisplayed();
    }
}
