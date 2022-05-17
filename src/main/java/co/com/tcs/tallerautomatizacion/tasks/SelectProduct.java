package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioColchonesBaseCamasAlmohadasPage;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class SelectProduct implements Task {

    public SelectProduct() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioColchonesBaseCamasAlmohadasPage.SELECTED_PRODUCT)
                );
    }

    public static SelectProduct selectProduct(){
        return Tasks.instrumented(SelectProduct.class);
    }
}
