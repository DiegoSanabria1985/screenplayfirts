package com.demoqa.automation.taks;

import com.demoqa.automation.ui.HomePage;
import com.demoqa.automation.ui.RadioButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRadioButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(HomePage.ELEMENT_OPTIONS),
                Click.on(RadioButton.SELECT_RADIO)


        );

    }
    public static SelectRadioButton radioButton(){

        return instrumented(SelectRadioButton.class);
    }
}
