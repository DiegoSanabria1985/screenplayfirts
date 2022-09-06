package com.demoqa.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

public class Validations implements Question<Boolean> {

    private Target target;
    public Validations(Target target){
        this.target = target;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(target, WebElementStateMatchers.isVisible());
        return  target.resolveFor(actor).isVisible();

    }
    public static Validations visible(Target target){
        return new Validations(target);
    }
}
