package com.demoqa.automation.taks;

import com.demoqa.automation.models.DataInjections;
import com.demoqa.automation.questions.ValidationLogin;
import com.demoqa.automation.questions.Validations;
import com.demoqa.automation.ui.LoginPage;
import com.demoqa.automation.utils.Excelclass;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static  net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.*;
public class LoginWhitDataValidations implements Task {

    DataInjections dataInjections = new DataInjections();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.should(seeThat(ValidationLogin.in(LoginPage.BACK_TO_LOGIN_BUTTON),equalToIgnoringCase(Excelclass.getCellValue(dataInjections.getFilepath(),dataInjections.getLogincredentialName(),0,0))));
    }
    public static LoginWhitDataValidations logvalida(){
        return instrumented(LoginWhitDataValidations.class);
    }
}
