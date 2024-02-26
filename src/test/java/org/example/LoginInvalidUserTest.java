package org.example;

import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.example.constants.DataForLoginUser.LOGIN;
import static org.example.constants.DataForLoginUser.PASSWORD;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LoginInvalidUserTest extends BaseTest {

    private final String login;
    private final String password;

    public LoginInvalidUserTest(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Parameterized.Parameters
    public static Object getParameters() {
        return new Object[][] {
                {LOGIN, RandomStringUtils.randomAlphanumeric(8)},
                {RandomStringUtils.randomAlphanumeric(10), PASSWORD},
                {RandomStringUtils.randomAlphanumeric(10), RandomStringUtils.randomAlphanumeric(8)}
        };
    }

    @Test
    @DisplayName("Авторизация пользователя с некорректными данными")
    public void loginInvalidUser() {
        loginPageMirapolis.loginInvalidUser(login, password);

        Alert alert = switchTo().alert();
        String textAlert = alert.getText();

        assertEquals(textAlert, "Неверные данные для авторизации");
    }

}
