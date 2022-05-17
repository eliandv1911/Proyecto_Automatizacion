package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioProductoSelectedPage;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteProductFromShoppingCart implements Task {

    public DeleteProductFromShoppingCart() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioShoppingCartPage.DELETE_PRODUCT)

                );
    }

    public static DeleteProductFromShoppingCart deleteProductFromShoppingCart(){
        return Tasks.instrumented(DeleteProductFromShoppingCart.class);
    }
}
