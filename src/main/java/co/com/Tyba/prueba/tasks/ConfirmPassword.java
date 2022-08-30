package co.com.Tyba.prueba.tasks;

import co.com.Tyba.prueba.interactions.Type;
import co.com.Tyba.prueba.models.NewUser;
import co.com.Tyba.prueba.userInterfaces.CreateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmPassword implements Task {

    private NewUser newUser;
    public ConfirmPassword(NewUser newUser) {this.newUser = newUser;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateUser.INPUT_USERNAME),
                Type.on(CreateUser.INPUT_USERNAME, newUser.getUsername()),
                Click.on(CreateUser.INPUT_EMAIL),
                Type.on(CreateUser.INPUT_EMAIL, newUser.getEmail()),
                Click.on(CreateUser.INPUT_PASSWORD),
                Type.on(CreateUser.INPUT_PASSWORD,newUser.getPassword()),
                Click.on(CreateUser.INPUT_CONFIRM_PASSWORD),
                Type.on(CreateUser.INPUT_CONFIRM_PASSWORD, newUser.getConfirmPasswordIncorrect()),
                Click.on(CreateUser.INPUT_PASSWORD),
                Click.on(CreateUser.INPUT_PASSWORD)
        );
    }
    public static ConfirmPassword incorrect(NewUser newUser){return Tasks.instrumented(ConfirmPassword.class, newUser);
    }
}
