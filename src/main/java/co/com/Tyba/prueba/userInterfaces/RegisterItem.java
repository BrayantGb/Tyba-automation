package co.com.Tyba.prueba.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterItem extends PageObject {
    //public static final Target SELECT_TABLET = Target.the("Select Tablet").located(By.xpath("//article[@id=\"popular_items\"]//div[@class=\"grid-table center\"]//div[@name=\"popular_item_16\"]//a[@role=\"link\"]//label[@id=\"details_16\"]"));
    //public static final Target ADD_TO_CART = Target.the("Add to cart").located(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
    //public static final Target SELECT_HOME = Target.the("Select home").located(By.xpath("/html/body/div[3]/nav/a[1]"));
   //public static final Target SELECT_POPULAR_ITEMS = Target.the("Select popular items").located(By.xpath("/html/body/header/nav/ul/li[6]/a"));
    //public static final Target SELECT_PC = Target.the("Select pc").located(By.xpath("//*[@id=\"details_10\"]"));
    //public static final Target ADD_TO_CART_PC = Target.the("Add to cart").located(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
    //public static final Target SELECT_MENU_CART = Target.the("Select cart to shopping").located(By.xpath("//*[@id=\"menuCart\"]"));
    //public static final Target CHECK_OUT_SHOPPING = Target.the("CheckOut shopping").located(By.xpath("//*[@id=\"checkOutButton\"]"));
    //public static final Target SHIPPING_DETAILS = Target.the("Shipping Details").located(By.xpath("//*[@id=\"next_btn\"]"));
    public static final Target INPUT_SAFEPAY_USERNAME = Target.the("SafePay username").located(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[1]/div/input"));
    public static final Target INPUT_SAFEPAY_PASSWORD = Target.the("SafePay Password").located(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[2]/div/input"));
    public static final Target BUTTON_PAY_NOW = Target.the("Button pay now").located(By.xpath("//*[@id=\"pay_now_btn_SAFEPAY\"]"));

}
