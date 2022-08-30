package co.com.Tyba.prueba.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopularItems extends PageObject {

    public static final Target BUTTON_POPULAR_ITEMS = Target.the("Button popular items").located(By.xpath("//*[contains(text(),'POPULAR ITEMS')]"));
}
