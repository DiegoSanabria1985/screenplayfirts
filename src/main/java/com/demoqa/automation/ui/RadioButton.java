package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButton {

    public static String urlradio = "https://demoqa.com/radio-button";
    public static final Target BUTTON_YES = Target.the("RADIOUTTON YES").located(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
    public static final Target BUTTON_IMPRESIVE = Target.the("RADIOUTTON IMPRESIVE").located(By.xpath("//label[@class='custom-control-label' and @for='impressiveRadio']"));
    public static final Target SELECTED = Target.the("MENSAJE").located(By.xpath("//span[text()='Yes']"));
    public static final Target SELECT_RADIO = Target.the("seleccionar radio button").located(By.xpath("//span[text()='Radio Button']"));
}
