package co.com.tcs.tallerautomatizacion.tasks;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioColchonesBaseCamasAlmohadasPage;
import co.com.tcs.tallerautomatizacion.userinterfaces.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import net.thucydides.core.annotations.locators.WaitForWebElements;

public class GoToColchonesBaseCamasAlmohadasSection implements Task {

    public GoToColchonesBaseCamasAlmohadasSection() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(LinioHomePage.MENU_ICON),
                //Click.on(LinioHomePage.MENU_ICON),
                MoveMouse.to(LinioHomePage.HOGAR_CATEGORY),
                Click.on(LinioHomePage.COLCHONES_BASE_CAMAS_ALMOHADAS_SECTION)

                );
    }

    public static GoToColchonesBaseCamasAlmohadasSection colchonesBaseCamasAlmohadasSection(){
        return Tasks.instrumented(GoToColchonesBaseCamasAlmohadasSection.class);
    }
}
