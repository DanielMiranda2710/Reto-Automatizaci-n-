package com.advantageshopping.qa.stepdefinitions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingHome.*;
import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingBuy.*;

import com.advantageshopping.qa.exceptions.ResultNotWaited;
import com.advantageshopping.qa.questions.TheElement;
import com.advantageshopping.qa.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AdvantageShoppingStepDefinitions {

    @Managed
    private WebDriver browser;


    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").can(BrowseTheWeb.with(browser));
    }

    @Given("^that user wants to register correctly$")
    public void thatUserWantsToRegisterCorrectly() throws Exception {
        theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on());
        Thread.sleep(4000);
    }

    @When("^he writes his data correctly$")
    public void heWritesHisDataCorrectly() throws Exception {
        theActorInTheSpotlight().attemptsTo(EnterMenuUser.open());
        Thread.sleep(4000);
        theActorInTheSpotlight().attemptsTo(EnterTo.create());
        Thread.sleep(4000);
        theActorInTheSpotlight().attemptsTo(FillForm.register());
        Thread.sleep(4000);
    }

    @Then("^he should see his username in the navbar$")
    public void heShouldSeeHisUsernameInTheNavbar() throws Exception {
        theActorInTheSpotlight().should((seeThat(TheElement.exists(NAVBAR_USERNAME))));
    }

    @Given("^that user wants to buy some hp computer$")
    public void thatUserWantsToBuySomeHpComputer() throws Exception {
        theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on());
        Thread.sleep(4000);
    }

    @When("^he logs in and added the product to the shopping cart$")
    public void heLogsInAndAddedTheProductToTheShoppingCart() throws Exception {
        theActorInTheSpotlight().attemptsTo(Log.in());
        Thread.sleep(4000);
        theActorInTheSpotlight().attemptsTo(SearchHpLaptop.select());
        Thread.sleep(4000);
        theActorInTheSpotlight().attemptsTo(SelectLaptop.add());
        Thread.sleep(4000);
    }

    @Then("^he should see the product added in the shopping cart$")
    public void heShouldSeeTheProductAddedInTheShoppingCart() throws Exception {
        theActorInTheSpotlight().should((seeThat(TheElement.exists(AGGREGATE_PURCHASE))).orComplainWith(ResultNotWaited.class,ResultNotWaited.getErrorNetworkMessage()));

    }

}
