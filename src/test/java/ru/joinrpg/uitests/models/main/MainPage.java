package ru.joinrpg.uitests.models.main;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    public GameCreationPage newProject() {
        pressCreateProject();
        return page(GameCreationPage.class);
    }

    private void pressCreateProject() {
        $(byText("Создать тестовую базу заявок")).click();
    }
}
