package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static String urlhome = "https://demoqa.com/";
    public static final Target ELEMENT_OPTIONS = Target.the("").locatedBy("//h5[text()='Elements']");
    public static final Target ELEMENTS = Target.the("").locatedBy("//div[text()='Elements']");
    public static final Target TEXTBOX_OPTION = Target.the("").locatedBy("//span[text()= 'Text Box']");


}
