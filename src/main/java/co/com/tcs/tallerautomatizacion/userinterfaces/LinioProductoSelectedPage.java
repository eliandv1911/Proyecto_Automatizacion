package co.com.tcs.tallerautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LinioProductoSelectedPage {

    public static final Target BUTTON_ANADIR_AL_CARRITO = Target.the("button_anadir_al_carrito").locatedBy("//button[@id='buy-now']");
    public static final Target BUTTON_IR_AL_CARRITO = Target.the("button_ir_al_carrito").locatedBy("//a[contains(text(),'Ir al carrito')]");
    public static final Target BUTTON_SELECT_PRODUCT_QUANTITY = Target.the("button_select_product_quantity").locatedBy("//button[@class='form-control form-control-lg select-dropdown-button select-dropdown-button-product-quantity hidden-sm-down d-none d-md-block']");
    public static final Target LIST_SELECT_PRODUCT_QUANTITY = Target.the("list_select_product_quantity").locatedBy("//li[@class='select-dropdown-list-item'][3]");

}
