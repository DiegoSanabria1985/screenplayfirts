package com.demoqa.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PageButtons {


    public static String urlbuttons = "https://demoqa.com/buttons";

    public static final Target BUTTON_DOUBLECLICK = Target.the("seleccionar botón dobleclick").located(By.xpath("//button[@id='doubleClickBtn']"));

    public static final Target BUTTON_CLICKRIGHT = Target.the("dar click derecho").located(By.xpath("*//button[text()='Right Click Me']"));

    public static final Target BUTTON_CLICK = Target.the("dar click").located(By.xpath("*//button[text()='Click Me']"));

    public static final Target MESSGE_DOUBLECLICK = Target.the("dar click").located(By.xpath("//p[text()='You have done a double click']"));

    public static final Target MESSGE_RIGHTCLICK = Target.the("dar click").located(By.xpath("//p[text()='You have done a right click']"));

    public static final Target MESSGE_CLICK = Target.the("dar click").located(By.xpath("//p[text()='You have done a dynamic click']"));



}
