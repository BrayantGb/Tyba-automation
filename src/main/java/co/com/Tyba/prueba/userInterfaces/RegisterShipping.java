package co.com.Tyba.prueba.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterShipping extends PageObject {

    public static final Target SHIPPING_SUCCESSFUL = Target.the("Shipping successful").located(By.xpath("//h3[contains(text(),'ORDER PAYMENT')]"));
}
