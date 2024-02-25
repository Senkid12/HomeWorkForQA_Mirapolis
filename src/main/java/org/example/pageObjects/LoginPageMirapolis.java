package org.example.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginPageMirapolis {
    // локатор для поля с логином
    @FindBy(how = How.NAME, using = "user")
    protected SelenideElement loginField;
    // локатор для поля с паролем
    @FindBy(how = How.NAME, using = "password")
    protected SelenideElement passwordField;
    // локатор для кнопки "Войти"
    @FindBy(how = How.ID, using = "button_submit_login_form")
    protected SelenideElement entryButton;

    @Step("Заполнение поля с логином")
    public void setEmailField(String email) {
        loginField.setValue(email);
    }

    @Step("Заполнение поля с паролем")
    public void setPasswordField(String password) {
        passwordField.setValue(password);
    }

    @Step("Клик по кнопке 'Войти'")
    public void clickOnLoginButton() {
        entryButton.click();
    }

    @Step("Авторизация валидного пользователя")
    public HomePageMirapolis loginUser(String login, String password) {
        setEmailField(login);
        setPasswordField(password);
        clickOnLoginButton();

        HomePageMirapolis homePageMirapolis = page(HomePageMirapolis.class);
        homePageMirapolis.waitForLoadHomePage();

        return homePageMirapolis;
    }

    @Step("Авторизация невалидного пользователя")
    public void  loginInvalidUser(String login, String password) {
        setEmailField(login);
        setPasswordField(password);
        clickOnLoginButton();
    }
}
