package org.example;

import io.qameta.allure.junit4.DisplayName;
import org.example.pageObjects.HomePageMirapolis;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginUserTest extends BaseTest {

    @Test
    @DisplayName("Вход под корректными данными")
    public void loginValidUser() {
        HomePageMirapolis homePageMirapolis = loginPageMirapolis.loginUser(user.getLogin(), user.getPassword());

        String textMainPage = homePageMirapolis.getTextHomePage();

        assertEquals(textMainPage, "Главная страница");
    }

}
