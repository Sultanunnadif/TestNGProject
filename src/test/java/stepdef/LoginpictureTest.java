package stepdef;

import basewebsite.foundation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginpictureTest extends foundation{
    LoginPage Actions;

    @Given("i am on the login page")
    public void iAmOnTheLoginPage() {
    Actions = new LoginPage(driver);
    Actions.loginHomepage();
    }

    @When("i enter my username {string}")
    public void iEnterMyUsername(String username) {
        Actions.inputUsername(username);
    }

    @And("i enter my password {string}")
    public void iEnterMyPassword(String password) {
        Actions.inputPassword(password);
    }

    @And("i click on the login button")
    public void iClickOnTheLoginButton() {
    Actions.loginButton();
    }

}
