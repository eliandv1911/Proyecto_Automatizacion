package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioHomePage;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioProductoSelectedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class GoToCart implements Task {

    public GoToCart() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioProductoSelectedPage.BUTTON_IR_AL_CARRITO)

                );
    }

    public static GoToCart goToCart(){
        return Tasks.instrumented(GoToCart.class);
    }
}
