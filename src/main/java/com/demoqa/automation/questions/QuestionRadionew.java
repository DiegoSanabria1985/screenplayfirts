package com.demoqa.automation.questions;

import com.demoqa.automation.ui.RadioButton;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class QuestionRadionew {

    public static Question<String> value(){
        return actor -> TextContent.of(RadioButton.SELECTED).viewedBy(actor).asString();
    }
}
