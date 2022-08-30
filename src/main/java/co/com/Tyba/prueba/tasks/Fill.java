package co.com.Tyba.prueba.tasks;

import co.com.Tyba.prueba.interactions.Type;
import co.com.Tyba.prueba.models.NewUser;
import co.com.Tyba.prueba.userInterfaces.CreateUser;
import co.com.Tyba.prueba.utils.NumberRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

public class Fill implements Task {

    private NewUser newUser;
    private WebDriver webDriver;
    public Fill(NewUser newUser, WebDriver webDriver){this.newUser = newUser; this.webDriver = webDriver;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateUser.INPUT_USERNAME),
                Type.on(CreateUser.INPUT_USERNAME, newUser.getUsername()+ NumberRandom.username(111111,999999)),
                Click.on(CreateUser.INPUT_EMAIL),
                Type.on(CreateUser.INPUT_EMAIL, newUser.getEmail()),
                Click.on(CreateUser.INPUT_PASSWORD),
                Type.on(CreateUser.INPUT_PASSWORD,newUser.getPassword()),
                Click.on(CreateUser.INPUT_CONFIRM_PASSWORD),
                Type.on(CreateUser.INPUT_CONFIRM_PASSWORD, newUser.getConfirma_password()),
                Click.on(CreateUser.INPUT_FIRST_NAME),
                Type.on(CreateUser.INPUT_FIRST_NAME, newUser.getFirst_Name()),
                Click.on(CreateUser.INPUT_LAST_NAME),
                Type.on(CreateUser.INPUT_LAST_NAME, newUser.getLast_Name()),
                Click.on(CreateUser.INPUT_PHONE_NUMBER),
                Type.on(CreateUser.INPUT_PHONE_NUMBER, newUser.getPhone_Number()),
                Click.on(CreateUser.INPUT_COUNTRY),
                Type.on(CreateUser.INPUT_COUNTRY, newUser.getCountry()),
                Click.on(CreateUser.INPUT_CITY),
                Type.on(CreateUser.INPUT_CITY, newUser.getCity()),
                Click.on(CreateUser.INPUT_ADDRESS),
                Type.on(CreateUser.INPUT_ADDRESS, newUser.getAddress()),
                Click.on(CreateUser.INPUT_POSTAL_CODE),
                Type.on(CreateUser.INPUT_POSTAL_CODE,newUser.getPostal_Code())
        );
    }
    public static Fill form(NewUser newUser, WebDriver webDriver){
        return Tasks.instrumented(Fill.class, newUser, webDriver);
    }
}
