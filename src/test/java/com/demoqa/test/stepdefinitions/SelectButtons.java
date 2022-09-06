package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.openTheBrowser;
import com.demoqa.automation.questions.ButtonsValidations;
import com.demoqa.automation.questions.QuestionRadionew;
import com.demoqa.automation.taks.SelectButton;
import com.demoqa.automation.taks.SelectRadioYes;
import com.demoqa.automation.ui.PageButtons;
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

public class SelectButtons {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));


    }
    @Given("^I want to practice on the demoqa page$")
    public void Iwanttopracticeonthedemoqapage() {
        theActorInTheSpotlight().attemptsTo(openTheBrowser.on(PageButtons.urlbuttons));
        //theActorInTheSpotlight().attemptsTo(SelectRadioButton.radioButton());


    }


    @When("^select the buttons on the screen$")
    public void selectthebuttonsonthescreen() {

        theActorInTheSpotlight().attemptsTo(SelectButton.Buttons());

    }

    @Then("^it should show a success message$")
    public void itshouldshowasuccessmessage() {

        theActorInTheSpotlight().should(seeThat("respuesta selección", ButtonsValidations.valuebuttons(), equalTo("You have done a double click")));
        theActorInTheSpotlight().should(seeThat("respuesta selección click derecho", ButtonsValidations.valuebutton(), equalTo("You have done a right click")));



    }



}
