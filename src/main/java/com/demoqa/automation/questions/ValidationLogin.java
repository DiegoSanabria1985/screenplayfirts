package com.demoqa.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;



public class ValidationLogin implements Question<String> {

    private Target target;

    public ValidationLogin(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }
    public static ValidationLogin in (Target target){
        return new ValidationLogin(target);
    }
}
