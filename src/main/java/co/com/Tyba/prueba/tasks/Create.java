package co.com.Tyba.prueba.tasks;

import co.com.Tyba.prueba.userInterfaces.CreateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Create implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(CreateUser.CHECK_TERMS_CONDITIONS),
        Click.on(CreateUser.BUTTON_REGISTER)
        );
    }
    public static Create account(){
        return Tasks.instrumented(Create.class);
    }
}
