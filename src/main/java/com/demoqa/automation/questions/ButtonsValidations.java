package com.demoqa.automation.questions;

import com.demoqa.automation.ui.PageButtons;
import com.demoqa.automation.ui.RadioButton;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ButtonsValidations {

    public static Question<String> valuebuttons(){
        return actor -> TextContent.of(PageButtons.MESSGE_DOUBLECLICK).viewedBy(actor).asString();
    }
    public static Question<String> valuebutton(){
        return actor -> TextContent.of(PageButtons.MESSGE_RIGHTCLICK).viewedBy(actor).asString();
    }
}
