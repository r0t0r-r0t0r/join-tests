package ru.joinrpg.uitests.models.reg;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationSuccessPage {
    public SelenideElement registrationSuccessCaption() {
        return $(byText("Регистрация успешна"));
    }
}