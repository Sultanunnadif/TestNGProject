package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class CalculatorStep {

    int num;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        System.out.println("adding two numbers");
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int number, int number2) {
        this.num = number + number2;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int result) {
        System.out.println("The result is: " + result);
        Assert.assertEquals(this.num, result);
    }
}
