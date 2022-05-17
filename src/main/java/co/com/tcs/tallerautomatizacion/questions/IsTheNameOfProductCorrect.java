package co.com.tcs.tallerautomatizacion.questions;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsTheNameOfProductCorrect implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LinioShoppingCartPage.NAME_OF_PRODUCT.resolveAllFor(actor).get(0).getText();// se tomael elemento.el actor resuelve el elemento. en la posicion 0.obtiene el texto
    }

    public static IsTheNameOfProductCorrect isTheNameOfProductCorrect(){
        return new IsTheNameOfProductCorrect();
    }
}
