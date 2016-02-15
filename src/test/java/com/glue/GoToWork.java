package com.glue;

import com.sample.Person;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by duongnapham on 3/2/15.
 */
public class GoToWork {
    private final String NAME = "Laszlo";
    private final String NOT = "not";

    private static Person person;
    private static boolean isWeekend;

    @Given("^There is a person$")
    public void There_is_a_person() throws Throwable {
        System.out.println("There is a person " + NAME);
        this.person = new Person(NAME);

    }

    @And("^it is (.*)weekend$")
    public void it_is_weekend(String isOrIsNotWeekend) throws Throwable {
        this.isWeekend = !(NOT.equals(isOrIsNotWeekend.trim()));
    }

    @When("^the alarm rings$")
    public void the_alarm_rings() throws Throwable {
        System.out.println("Ring....ring....ring...");
    }

    @Then("^the person should (.*)get up and go to work$")
    public void the_person_should_get_up_and_go_to_work(String isOrIsNotWeekend) throws Throwable {

        final String expectedMessage;
        if (NOT.equals(isOrIsNotWeekend.trim())){
            expectedMessage = NAME + " does not go to work!";
        }
        else {
            expectedMessage = NAME + " goes to work!";
        }
        String actualMessage = person.goToWork(this.isWeekend);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
