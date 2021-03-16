package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.GoogleHome_Page;



public class GoogleHomeSteps {


    GoogleHome_Page googleHomepage = new GoogleHome_Page();

    @Given("^Iam on the google search page$")
    public void navigateToGoogle(){
        googleHomepage.navigateToGoogle("https://www.google.com/");
    }
    @When("^I enter the search criteria$")
    public void enterSearchCriteria(){
        googleHomepage.enterSearchCriteria("Mariano Panella");
    }

    @And("^Click in the search button$")
    public void clickSearchButton(){
        googleHomepage.clickGoogleSearch();
    }

    @Then("^The result match the criteria$")
    public void validateResults(){
        Assert.assertTrue(googleHomepage.textForElement_firstResult().contains("Mariano Panella"));
    }



}
