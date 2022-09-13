package com.demoqa.automation.taks;

import com.demoqa.automation.ui.HomePage;
import com.demoqa.automation.ui.TextBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTextBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                JavaScriptClick.on(HomePage.ELEMENT_OPTIONS),
                //Click.on(HomePage.ELEMENT_OPTIONS),
                //Click.on(HomePage.ELEMENTS),
                Click.on(HomePage.TEXTBOX_OPTION));

    }

    public static SelectTextBox valida(){

        return instrumented(SelectTextBox.class);
    }
}
