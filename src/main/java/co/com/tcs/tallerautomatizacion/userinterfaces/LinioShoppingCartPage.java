package co.com.tcs.tallerautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LinioShoppingCartPage {

    public static final Target NAME_OF_PRODUCT = Target.the("name_of_product").locatedBy("//a[contains(text(),'Super Mega Combo Azul Queen 160x190 Resortado Marshall')]");
    public static final Target QUANTITY_OF_PRODUCT = Target.the("quantity_of_product").locatedBy("//option[contains(text(),'3')]");
    public static final Target VALUE_OF_PRODUCT = Target.the("value_of_product").locatedBy("//div[contains(text(),'$1.274.900')]");
    public static final Target TITLE_OF_LINIO_PAGE = Target.the("tittle_of_linio_page").locatedBy("//a[@title='Linio']");
    public static final Target DELETE_PRODUCT = Target.the("delete_product").locatedBy("//a[contains(text(),'Eliminar')]");

}
