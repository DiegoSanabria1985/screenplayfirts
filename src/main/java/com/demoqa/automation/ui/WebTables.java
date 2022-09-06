package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTables {

    public static String urlwebtables = "https://demoqa.com/webtables";


    public static final Target BUTTON_ADD_WEB = Target.the("button add the web table").located(By.id("addNewRecordButton"));
    public static final Target FIELD_FIRSTNAME = Target.the("firts name").located(By.id("firstName"));
    public static final Target FIELD_LASTNAME = Target.the("lastName").located(By.id("lastName"));
    public static final Target FIELD_EMAIL = Target.the("userEmail").located(By.id("userEmail"));
    public static final Target FIELD_AGE = Target.the("AGe").located(By.id("age"));
    public static final Target FIELD_DEPARTMENT = Target.the("department").located(By.id("department"));
    public static final Target FIELD_SALARY = Target.the("salary").located(By.id("salary"));
    public static final Target BUTTON_SUBMIT_WEB = Target.the("SUBMIT").located(By.id("submit"));

    public static final Target VALIDA = Target.the("VALIDATION").locatedBy("//div[text()='Diego']");


}
