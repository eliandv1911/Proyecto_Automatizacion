package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioHomePage;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCartPageSinceHomePage implements Task {

    public GoToCartPageSinceHomePage() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioHomePage.SHOPPING_CART)

                );
    }

    public static GoToCartPageSinceHomePage goToCartPageSinceHomePage(){
        return Tasks.instrumented(GoToCartPageSinceHomePage.class);
    }
}
