package com.ps.fluentinterface.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * Class to use Gherkin.
 */
public class HomePageTest {

    /**
     * Given.
     */
    @Given("There are a list of tabs")
    public void there_are_a_list_of_tabs() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(2, 2);
    }

    /**
     * When.
     */
    @When("I click on each one")
    public void click_on_each_one() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java8.PendingException();
    }

    /**
     * Then.
     */
    @Then("The list expands")
    public void the_list_expands() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java8.PendingException();
    }
}
