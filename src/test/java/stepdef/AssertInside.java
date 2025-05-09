package stepdef;

import io.cucumber.java.en.And;
import pages.InsideHome;
import basewebsite.foundation;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class AssertInside extends foundation {
    InsideHome Actions;
    @Then("i should see the products page")
    public void iShouldSeeTheProductsPage() {
        Actions = new InsideHome(driver);
        Actions.validateElement();
    }
    @And("take screenshot")
    public void iTakeAScreenshot() throws IOException, InterruptedException {
        Actions = new InsideHome(driver); // reuse object
        Actions.takeScreenshot();
    }
    @And("take problem screenshot")
    public void iTakeProblemScreenshot() throws IOException, InterruptedException {
        Actions = new InsideHome(driver); // reuse object
        Actions.PBtakeScreenshot();
    }
    @Then("Compare Pictures")
    public void iComparePictures() throws IOException {
        Actions = new InsideHome(driver); // reuse object
        Actions.compareScreenshots();
    }
}
