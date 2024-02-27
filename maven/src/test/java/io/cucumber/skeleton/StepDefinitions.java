package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer hour) {
        // throw new io.cucumber.java.PendingException();
        System.out.println(hour);
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // throw new io.cucumber.java.PendingException();
        System.out.println("my belly should growl");
    }
}
