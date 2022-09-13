package com.demoqa.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;


public class openTheBrowser implements Interaction {

    private String url;
    protected openTheBrowser(String url){
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(url));


    }

    public static openTheBrowser on (String url){
        return new openTheBrowser(url);
    }
}
