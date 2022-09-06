package com.demoqa.automation.questions;

import com.demoqa.automation.ui.RadioButton;
import com.demoqa.automation.ui.WebTables;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class WebTablesValidations {

    public static Question<String> valueweb(){
        return actor -> TextContent.of(WebTables.VALIDA).viewedBy(actor).asString();
    }
}
