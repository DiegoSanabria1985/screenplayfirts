package com.demoqa.automation.ui;

//import com.sun.javafx.scene.control.skin.NestedTableColumnHeader;
import net.serenitybdd.screenplay.targets.Target;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;

public class TextBoxPage {
    //public static String URL = "https://demoqa.com/text-box";

    public static final Target FULL_NAME_INPUT = Target.the("full name input").located(By.id("userName"));
    public static final Target EMAIL_INPUT = Target.the("EMAIL").located(By.id("userEmail"));
    public static final Target CURRENT_ADDRESS = Target.the("ADDRESS").located(By.id("currentAddress"));
    public static final Target PERMANENT_ADDRESS = Target.the("p ADDRESS").located(By.id("permanentAddress"));
    public static final Target SUBMIT_BUTTON = Target.the("submit").located(By.id("submit"));

    public static final Target NAME_VALIDATION = Target.the("name validation").located(By.id("name"));



}
