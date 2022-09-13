package com.demoqa.automation.taks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.demoqa.automation.ui.PageButtons;
import com.demoqa.automation.ui.RadioButton;
import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import org.openqa.selenium.interactions.ContextClickAction;
import net.serenitybdd.screenplay.actions.RightClick;
import net.serenitybdd.screenplay.actions.RightClickOnTarget;


import static net.serenitybdd.screenplay.Tasks.instrumented;

//RightClickOnTarget rightClickOnTarget = new RightClickOnTarget();

public class SelectButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoubleClick.on(PageButtons.BUTTON_DOUBLECLICK),
                Click.on(PageButtons.BUTTON_CLICK),
                RightClick.on(PageButtons.BUTTON_CLICKRIGHT)


        );

    }
    public static SelectButton Buttons(){

        return instrumented(SelectButton.class);
    }
}
