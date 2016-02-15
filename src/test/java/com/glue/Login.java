package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by duongnapham on 3/2/15.
 */
public class Login {

    @Given("^I launch \"(.*?)\" page$")
    public void i_launch_page(String page) throws Throwable {

    }

    @When("^I fill in \"(.*?)\" with \"(.*?)\"$")
    public void i_fill_in_with(String username, String password) throws Throwable {

    }

    @When("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String login) throws Throwable {

    }

    @Then("^I should see text \"(.*?)\" in right side pane$")
    public void i_should_see_text_in_right_side_pane(String profileName) throws Throwable {

    }
}
