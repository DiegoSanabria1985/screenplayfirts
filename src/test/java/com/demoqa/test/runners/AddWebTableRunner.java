package com.demoqa.test.runners;


//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/addTables.feature",
glue = "com.demoqa.test.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE,
tags = "@Login")
public class AddWebTableRunner {
}
