package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by duongnapham on 3/2/15.
 */
public class ExampleChars {

    private static String theLetter;

    @Given("^the letter \"(.*?)\"$")
    public void the_letter(String letter) {
        this.theLetter = letter;
    }

    @When("^I check the letter$")
    public void i_check_the_letter() {
        // just a stub
    }

    @Then("^the letter should be \"(.*?)\"$")
    public void the_letter_should_be(String strLetter) {
        assertEquals(this.theLetter,strLetter);
    }
}
