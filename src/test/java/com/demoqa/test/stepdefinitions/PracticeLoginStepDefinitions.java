package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.openTheBrowser;
import com.demoqa.automation.taks.*;
import com.demoqa.automation.ui.HomePage;
import com.demoqa.automation.ui.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeLoginStepDefinitions {

    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));


    }
    @Given("^that a web user wants to practice login in DemoQA$")
    public void thatawebuserwantstopracticelogininDemoQA() {
        theActorInTheSpotlight().attemptsTo(openTheBrowser.on(LoginPage.urlLogin));

    }


    @When("^he fills all the requested fields and he follows the steps using excel$")
    public void hefillsalltherequestedfieldsandhefollowsthestepsusingexcel() {
        theActorInTheSpotlight().attemptsTo(LoginWithExcel.dataExcel());


    }

    @Then("^he should see the correct validations with the excel$")
    public void heshouldseethecorrectvalidationswiththeexcel() {
        //theActorInTheSpotlight().attemptsTo(FillAllFieldsValidatios.validatios());
        // System.out.println("*****" + QuestionRadionew.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().attemptsTo(LoginWhitDataValidations.logvalida());




    }
}
