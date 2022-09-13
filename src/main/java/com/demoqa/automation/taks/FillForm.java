package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.ui.RadioButton;
import com.demoqa.automation.ui.TextBoxPage;
import com.demoqa.automation.ui.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillForm implements Task {

    DataInjections dataInjections = new DataInjections();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebTables.BUTTON_ADD_WEB),
                Enter.theValue(dataInjections.getFirstnameweb()).into(WebTables.FIELD_FIRSTNAME),
                Enter.theValue(dataInjections.getLastnameweb()).into(WebTables.FIELD_LASTNAME),
                Enter.theValue(dataInjections.getEmailweb()).into(WebTables.FIELD_EMAIL),
                Enter.theValue(dataInjections.getAgeweb()).into(WebTables.FIELD_AGE),
                Enter.theValue(dataInjections.getSalaryweb()).into(WebTables.FIELD_SALARY),
                Enter.theValue(dataInjections.getDepartmentweb()).into(WebTables.FIELD_DEPARTMENT),
                Click.on(WebTables.BUTTON_SUBMIT_WEB)

        );

    }
    public static FillForm form(){

        return instrumented(FillForm.class);
    }
}
