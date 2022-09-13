package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.ui.LoginPage;
import com.demoqa.automation.utils.Excelclass;
import com.demoqa.automation.utils.SpecialMetthods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import java.io.IOException;

import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginWithExcel implements Task {

    DataInjections dataInjections = new DataInjections();

    @Override
    public <T extends Actor> void performAs(T actor) {



            actor.attemptsTo(
                    JavaScriptClick.on(LoginPage.NEW_USER_BUTTON),
                    Enter.theValue(Excelclass.getCellValue(dataInjections.getFilepath(), dataInjections.getSheetName(), 1, 0)).into(LoginPage.FIRTS_NAME_INPUT),
                    Enter.theValue(Excelclass.getCellValue(dataInjections.getFilepath(), dataInjections.getSheetName(), 1, 1)).into(LoginPage.LAST_NAME_INPUT),
                    Enter.theValue(Excelclass.getCellValue(dataInjections.getFilepath(), dataInjections.getSheetName(), 1, 2)).into(LoginPage.USERNAME_NAME_INPUT),
                    Enter.theValue(Excelclass.getCellValue(dataInjections.getFilepath(), dataInjections.getSheetName(), 1, 3)).into(LoginPage.PASWORD_NAME_INPUT),
                    Scroll.to(LoginPage.REGISTER_BUTTON)
                    //JavaScriptClick.on(LoginPage.CAPCHA)


            );
        }




    public static LoginWithExcel dataExcel() {

        return instrumented(LoginWithExcel.class);
    }
}
