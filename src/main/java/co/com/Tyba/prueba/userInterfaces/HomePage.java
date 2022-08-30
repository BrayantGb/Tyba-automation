package co.com.Tyba.prueba.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final  Target BUTTON_LOGIN = Target.the("Button login").located(By.id("menuUserLink"));
    public static final Target BUTTON_REGISTER = Target.the("Button register").located(By.xpath("//*[contains(text(),'CREATE NEW ACCOUNT')]"));
}
