package org.example.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class HomePageMirapolis {
    // Локатор div для с главной страницей
    @FindBy(how = How.CLASS_NAME, using = "mira-wrap-4")
    protected SelenideElement mainPage;

    public void waitForLoadHomePage() {
        mainPage.shouldBe(visible);
    }

    public String getTextHomePage() {
        return mainPage.getText();
    }
}
