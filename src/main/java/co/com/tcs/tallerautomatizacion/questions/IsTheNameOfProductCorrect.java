package co.com.tcs.tallerautomatizacion.questions;

import co.com.tcs.tallerautomatizacion.userinterfaces.LinioShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IsTheNameOfProductCorrect implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        //--------------------------------------------------------------------------------------
        // creacion archivo txt
        try {
            String ruta = "src\\main\\java\\co\\com\\tcs\\tallerautomatizacion\\utils\\File_Txt.txt";
            String nameProduct = LinioShoppingCartPage.NAME_OF_PRODUCT.resolveAllFor(actor).get(0).getText() + "\n";
            String quantityProduct = LinioShoppingCartPage.QUANTITY_OF_PRODUCT.resolveAllFor(actor).get(0).getText() + "\n";
            String valueProduct = LinioShoppingCartPage.VALUE_OF_PRODUCT.resolveAllFor(actor).get(0).getText();
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nameProduct);
            bw.write(quantityProduct);
            bw.write(valueProduct);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //-----------------------------------------------------------------------------

        return LinioShoppingCartPage.NAME_OF_PRODUCT.resolveAllFor(actor).get(0).getText();// se tomael elemento.el actor resuelve el elemento. en la posicion 0.obtiene el texto
    }

    public static IsTheNameOfProductCorrect isTheNameOfProductCorrect(){
        return new IsTheNameOfProductCorrect();
    }
}
