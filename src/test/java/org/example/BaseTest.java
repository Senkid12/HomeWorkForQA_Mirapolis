package org.example;

import org.example.model.User;
import org.example.pageObjects.LoginPageMirapolis;
import org.example.service.UserGenerator;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.Endpoints.BASE_PATH;
import static org.example.constants.Endpoints.BASE_URL;

public class BaseTest {
    protected final UserGenerator userGenerator = new UserGenerator();
    protected User user;
    protected LoginPageMirapolis loginPageMirapolis;

    @Before
    public void openBrowser() {
        user = userGenerator.getValidUser();
        loginPageMirapolis = open(BASE_URL + BASE_PATH, LoginPageMirapolis.class);
    }
}
