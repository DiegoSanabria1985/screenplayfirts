package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.openTheBrowser;
import com.demoqa.automation.questions.QuestionRadionew;
import com.demoqa.automation.taks.FillAllFieldsValidatios;
import com.demoqa.automation.taks.SelectRadioButton;
import com.demoqa.automation.taks.SelectTextBox;
import com.demoqa.automation.taks.fillAllFields;
import com.demoqa.automation.ui.HomePage;

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
import static org.hamcrest.core.IsEqual.equalTo;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddWebTableStepDefinitions {



    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));


    }
    @Given("^make practice of the demoqa page$")
    public void makePracticeOfTheDemoqaPage() {
        theActorInTheSpotlight().attemptsTo(openTheBrowser.on(HomePage.urlhome));
        theActorInTheSpotlight().attemptsTo(SelectTextBox.valida());


    }


    @When("^is a web table created$")
    public void isawebtablecreated() {
        theActorInTheSpotlight().attemptsTo(fillAllFields.successful());


    }

    @Then("^should create a record$")
    public void shouldCreateARecord() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsValidatios.validatios());
       // System.out.println("*****" + QuestionRadionew.value().answeredBy(theActorInTheSpotlight()));




    }

}
