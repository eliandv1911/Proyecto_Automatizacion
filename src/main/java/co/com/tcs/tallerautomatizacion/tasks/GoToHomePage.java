package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToHomePage implements Task {

    public GoToHomePage() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioShoppingCartPage.TITLE_OF_LINIO_PAGE)

                );
    }

    public static GoToHomePage goToHomePage(){
        return Tasks.instrumented(GoToHomePage.class);
    }
}
