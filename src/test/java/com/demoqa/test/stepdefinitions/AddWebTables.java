package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.openTheBrowser;
import com.demoqa.automation.questions.QuestionRadionew;
import com.demoqa.automation.questions.WebTablesValidations;
import com.demoqa.automation.taks.FillForm;
import com.demoqa.automation.taks.SelectRadioYes;
import com.demoqa.automation.ui.RadioButton;
import com.demoqa.automation.ui.WebTables;

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

public class AddWebTables {

    @Managed
    private WebDriver driver;


    @Before
    public void actorSetUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));


    }
    @Given("^practice page demoqa$")
    public void practicePageDemoqa() {
        theActorInTheSpotlight().attemptsTo(openTheBrowser.on(WebTables.urlwebtables));
        //theActorInTheSpotlight().attemptsTo(SelectRadioButton.radioButton());


    }


    @When("^adding fields to a table$")
    public void addingfieldstoatable() {

        theActorInTheSpotlight().attemptsTo(FillForm.form());

    }

    @Then("^should display a new table$")
    public void shoulddisplayanewtable() {
        theActorInTheSpotlight().should(seeThat("respuesta WEBTABLES", WebTablesValidations.valueweb(), equalTo("Diego")));



    }
}
