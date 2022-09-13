package com.demoqa.automation.taks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.questions.Validations;
import com.demoqa.automation.ui.RadioButton;
import com.demoqa.automation.ui.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFieldsValidatios implements Task {

    DataInjections dataInjections = new DataInjections();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(Validations.visible(TextBoxPage.NAME_VALIDATION)));
        //actor.should(seeThat(Validations.visible(RadioButton.SELECTED)));


    }
    public static  FillAllFieldsValidatios validatios(){
        return instrumented(FillAllFieldsValidatios.class);
    }
}
