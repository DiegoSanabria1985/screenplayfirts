package com.demoqa.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static String urlLogin = "https://demoqa.com/login";
    public static final Target NEW_USER_BUTTON = Target.the("").located(By.id("newUser"));
    public static final Target FIRTS_NAME_INPUT = Target.the("").located(By.id("firstname"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastname"));
    public static final Target USERNAME_NAME_INPUT = Target.the("").located(By.id("userName"));
    public static final Target PASWORD_NAME_INPUT = Target.the("").located(By.id("password"));
    public static final Target CAPCHA= Target.the("").located(By.id("recaptcha-anchor"));
    public static final Target REGISTER_BUTTON = Target.the("").located(By.id("register"));
    public static final Target BACK_TO_LOGIN_BUTTON = Target.the("").located(By.id("gotologin"));
}
