package com.demoqa.automation.taks;

import net.serenitybdd.screenplay.Actor;
import com.demoqa.automation.ui.RadioButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRadioYes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RadioButton.BUTTON_YES)
        );
    }
    public static SelectRadioYes radio(){

        return instrumented(SelectRadioYes.class);
    }
}
