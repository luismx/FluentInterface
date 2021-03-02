package com.ps.fluentinterface.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
* Class to identify the stepDefinition related.
*/
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "HomeTabStepDefinition")
public class CucumberTest {

}
