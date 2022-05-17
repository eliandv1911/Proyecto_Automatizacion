package co.com.tcs.tallerautomatizacion.stepdefinitions;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddAndDeleteProductStepDefinitions {

     LinioPage linioPage;

    @Before
    public void setup(){ // se prepara el entorno de trabajo
        OnStage.setTheStage(new OnlineCast()); //escenario
        OnStage.theActorCalled("elian"); //actor
    }

    @Given("^the user is in the application (.*)$")
    public void theUserIsInTheApplication(String url) {

    }


    @Given("^the user must be in the Hogar category, in the section Colchones, Base Camas y Almohadas$")
    public void theUserMustBeInTheHogarCategoryInTheSectionColchonesBaseCamasYAlmohadas() {

    }

    @When("^the user selects the product (.*)$")
    public void theUserSelectsTheProduct(String product) {

    }

    @When("^the user adds products to the cart (\\d+)$")
    public void theUserAddsProductsToTheCart(int arg1) {

    }

    @When("^the user clicks go to cart$")
    public void theUserClicksGoToCart() {

    }

    @Then("^the user should see the product, the quantity and the value$")
    public void theUserShouldSeeTheProductTheQuantityAndTheValue() {

    }


}
