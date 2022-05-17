package co.com.tcs.tallerautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LinioProductoSelectedPage {

    public static final Target SELECT_PRODUCT_QUANTITY = Target.the("select_product_quantity").locatedBy("//select[@id='product-quantity']");
    public static final Target DIV_SELECT_PRODUCT_QUANTITY = Target.the("div_select_product_quantity").locatedBy("//div[@class='select-dropdown select-dropdown-product-quantity']");

    public static final Target OPTION_PRODUCT_QUANTITY = Target.the("option_product_quantity").locatedBy("//option[@id='option-3']");

    public static final Target BUTTON_ANADIR_AL_CARRITO = Target.the("button_anadir_al_carrito").locatedBy("//button[@id='buy-now']");
    public static final Target BUTTON_IR_AL_CARRITO = Target.the("button_ir_al_carrito").locatedBy("//a[contains(text(),'Ir al carrito')]");

}
