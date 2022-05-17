package co.com.tcs.tallerautomatizacion.stepdefinitions;

import co.com.tcs.tallerautomatizacion.questions.IsTheMessageToCheckItemDeleted;
import co.com.tcs.tallerautomatizacion.questions.IsTheNameOfProductCorrect;
import co.com.tcs.tallerautomatizacion.questions.IsTheQuantityOfProductCorrect;
import co.com.tcs.tallerautomatizacion.questions.IsTheValueOfProductCorrect;
import co.com.tcs.tallerautomatizacion.tasks.*;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioPage;
import co.com.tcs.tallerautomatizacion.utils.ReadDataFromFileTxt;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @Then("^the user should see the product and the quantity (.*) (.*)$")
    public void theUserShouldSeeTheProductAndTheQuantity(String product, String quantity) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheNameOfProductCorrect.isTheNameOfProductCorrect(), Matchers.equalTo(product)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheQuantityOfProductCorrect.isTheQuantityOfProductCorrect(), Matchers.equalTo(quantity)));

    }

    @When("^the user returns to the main page$")
    public void theUserReturnsToTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToHomePage.goToHomePage());
    }

    @When("^the user clicks on the shopping cart on the main page$")
    public void theUserClicksOnTheShoppingCartOnTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCartPageSinceHomePage.goToCartPageSinceHomePage());
    }

    @Then("^the user should see the same values saved in the txt file$")
    public void theUserShouldSeeTheSameValuesSavedInTheTxtFile() {
        List<String> dataFileTxtRows = new ArrayList<String>();

        try {
            dataFileTxtRows = ReadDataFromFileTxt.ReadData("src\\main\\java\\co\\com\\tcs\\tallerautomatizacion\\utils\\File_Txt.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String product = dataFileTxtRows.get(0);
        String quantity = dataFileTxtRows.get(1);
        String value = dataFileTxtRows.get(2);


        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheNameOfProductCorrect.isTheNameOfProductCorrect(), Matchers.equalTo(product)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheQuantityOfProductCorrect.isTheQuantityOfProductCorrect(), Matchers.equalTo(quantity)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheValueOfProductCorrect.isTheValueOfProductCorrect(), Matchers.equalTo(value)));
    }

    @When("^the user clicks the delete section on the shopping cart page$")
    public void theUserClicksTheDeleteSectionOnTheShoppingCartPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteProductFromShoppingCart.deleteProductFromShoppingCart());
    }


    @Then("^el usuario deberia ver el mensaje (.*)$")
    public void elUsuarioDeberiaVerElMensaje(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsTheMessageToCheckItemDeleted.isTheMessageToCheckItemDeleted(), Matchers.equalTo(message)));

    }

}
