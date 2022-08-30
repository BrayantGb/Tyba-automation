package co.com.Tyba.prueba.userInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUser extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input UserName").located(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input"));
    public static final Target INPUT_EMAIL = Target.the("Input Email").located(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input"));
    public static final Target INPUT_PASSWORD = Target.the("Input Password").located(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input confirm Password").located(By.xpath("//input[@name='confirm_passwordRegisterPage']"));
    public static final Target INPUT_FIRST_NAME = Target.the("Input First Name").located(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input"));
    public static final Target INPUT_LAST_NAME = Target.the("Input Last Name").located(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input"));
    public static final Target INPUT_PHONE_NUMBER = Target.the("Input Phone Number").located(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input"));
    public static final Target INPUT_COUNTRY = Target.the("Input country").located(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select"));
    public static final Target INPUT_CITY = Target.the("Input city").located(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input"));
    public static final Target INPUT_ADDRESS = Target.the("Input address").located(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input"));
    //public static final Target INPUT_STATE = Target.the("Input State/Province/Region").located(By.xpath("//div[@class=\"inputContainer ng-scope\"]//input[@name=\"state_/_province_/_regionRegisterPage\"]"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Input postal code").located(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input"));
    public static final Target CHECK_TERMS_CONDITIONS = Target.the("Check terms and conditions").located(By.name("i_agree"));
    public static final Target BUTTON_REGISTER = Target.the("Button register user").located(By.id("register_btnundefined"));
}
