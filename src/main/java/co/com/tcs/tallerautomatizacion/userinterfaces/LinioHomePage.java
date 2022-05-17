package co.com.tcs.tallerautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LinioHomePage {

    public static final Target MENU_ICON = Target.the("menu_icon").locatedBy("//div[@class='icon icon-hamburger']");
    public static final Target HOGAR_CATEGORY = Target.the("hogar_category").locatedBy("//span[contains(text(),'Hogar')]"); //span[contains(text(),'Hogar')] //a[@data-offcanvas-menu='subcategory-menu-8']
    public static final Target COLCHONES_BASE_CAMAS_ALMOHADAS_SECTION = Target.the("colchones_base_camas_almohadas_section").locatedBy("//a[contains(text(),'Colchones, Base Camas y Almohadas')]");
    public static final Target SHOPPING_CART = Target.the("shopping_cart").locatedBy("//a[@class='profile-cart']");

}
