package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioProductoSelectedPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import org.openqa.selenium.Keys;

public class AddToCart implements Task{

    int quantityOfProduct;

    public AddToCart(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LinioProductoSelectedPage.BUTTON_SELECT_PRODUCT_QUANTITY),
                Click.on(LinioProductoSelectedPage.LIST_SELECT_PRODUCT_QUANTITY),
                Click.on(LinioProductoSelectedPage.BUTTON_ANADIR_AL_CARRITO)
        );
    }

    public static AddToCart addProductToCart(int quantityOfProduct){
        return Tasks.instrumented(AddToCart.class, quantityOfProduct);
    }
}
