package co.com.tcs.tallerautomatizacion.stepdefinitions;

import co.com.tcs.tallerautomatizacion.questions.IsTheNameOfProductCorrect;
import co.com.tcs.tallerautomatizacion.questions.IsTheQuantityOfProductCorrect;
import co.com.tcs.tallerautomatizacion.questions.IsTheValueOfProductCorrect;
import co.com.tcs.tallerautomatizacion.tasks.AddToCart;
import co.com.tcs.tallerautomatizacion.tasks.GoToCart;
import co.com.tcs.tallerautomatizacion.tasks.GoToColchonesBaseCamasAlmohadasSection;
import co.com.tcs.tallerautomatizacion.tasks.SelectProduct;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class AddAndDeleteProductStepDefinitions {

     LinioPage linioPage;

    @Before
    public void setup(){ // se prepara el entorno de trabajo
        OnStage.setTheStage(new OnlineCast()); //escenario
        OnStage.theActorCalled("elian"); //actor
    }

    @Given("^the user is in the application (.*)$")
    public void theUserIsInTheApplication(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(linioPage));
    }


    @When("^the user must be in the Hogar category, in the section Colchones, Base Camas y Almohadas$")
    public void theUserMustBeInTheHogarCategoryInTheSectionColchonesBaseCamasYAlmohadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToColchonesBaseCamasAlmohadasSection.colchonesBaseCamasAlmohadasSection());
    }

    @When("^the user selects the product (.*)$")
    public void theUserSelectsTheProduct(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.selectProduct());
    }

    @When("^the user adds products to the cart (.*)$")
    public void theUserAddsProductsToTheCart(int quantity) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.addProductToCart(quantity));
    }

    @When("^the user clicks go to cart$")
    public void theUserClicksGoToCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.goToCart());
    }

    @Then("^the user should see the product, the quantity and the value (.*) (.*) (.*)$")
    public void theUserShouldSeeTheProductTheQuantityAndTheValue(String product, String quantity, String value) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheNameOfProductCorrect.isTheNameOfProductCorrect(), Matchers.equalTo(product)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheQuantityOfProductCorrect.isTheQuantityOfProductCorrect(), Matchers.equalTo(quantity)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheValueOfProductCorrect.isTheValueOfProductCorrect(), Matchers.equalTo(value)));

    }


}
