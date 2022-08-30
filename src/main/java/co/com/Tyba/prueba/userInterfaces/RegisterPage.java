package co.com.Tyba.prueba.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public static final Target MESSAGE_PASSWORD_DOESNOT_MATCH = Target.the("Passwords do not match").located(By.xpath("//label[text()='Passwords do not match']"));
    public static final Target MESSAGE_INVALID_EMAIL = Target.the("Your email address isn't formatted correctly").located(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/label"));
}
