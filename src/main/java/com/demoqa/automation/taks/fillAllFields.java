package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.ui.TextBoxPage;
import com.demoqa.automation.utils.SpecialMetthods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class fillAllFields implements Task {

    DataInjections dataInjections = new DataInjections();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjections.getUsername()).into(TextBoxPage.FULL_NAME_INPUT),
                Enter.theValue(dataInjections.getEmail()).into(TextBoxPage.EMAIL_INPUT),
                Enter.theValue(dataInjections.getCurrentAdress()).into(TextBoxPage.CURRENT_ADDRESS),
                Enter.theValue(dataInjections.getPermanentAdress()).into(TextBoxPage.PERMANENT_ADDRESS),
                JavaScriptClick.on(TextBoxPage.SUBMIT_BUTTON)

        );



    }

    public static fillAllFields successful(){
        return instrumented(fillAllFields.class);
    }
}
