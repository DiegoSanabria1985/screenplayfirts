package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.openTheBrowser;
import com.demoqa.automation.questions.QuestionRadionew;
import com.demoqa.automation.taks.*;
import com.demoqa.automation.ui.HomePage;
import com.demoqa.automation.ui.RadioButton;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SelectRadiButton {



    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));


    }
    @Given("^want to practice the demoqa page$")
    public void wanttopracticethedemoqapage() {
        theActorInTheSpotlight().attemptsTo(openTheBrowser.on(RadioButton.urlradio));
        //theActorInTheSpotlight().attemptsTo(SelectRadioButton.radioButton());


    }


    @When("^a field is selected$")
    public void afieldisselected() {

        theActorInTheSpotlight().attemptsTo(SelectRadioYes.radio());

    }

    @Then("^should show a record$")
    public void shouldshowarecord() {

        theActorInTheSpotlight().should(seeThat("respuesta", QuestionRadionew.value(), equalTo("Yes")));



    }

}
