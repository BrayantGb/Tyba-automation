package co.com.Tyba.prueba.tasks;

import co.com.Tyba.prueba.interactions.Type;
import co.com.Tyba.prueba.models.NewUser;
import co.com.Tyba.prueba.userInterfaces.CreateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InvalidEmail implements Task {
    private NewUser newUser;
    public InvalidEmail(NewUser newUser){this.newUser = newUser;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CreateUser.INPUT_USERNAME),
                Type.on(CreateUser.INPUT_USERNAME, newUser.getUsername()),
                Click.on(CreateUser.INPUT_EMAIL),
                Type.on(CreateUser.INPUT_EMAIL, newUser.getInvalidEmail()),
                Click.on(CreateUser.INPUT_USERNAME)
        );
    }
    public static InvalidEmail format(NewUser newUser){return Tasks.instrumented(InvalidEmail.class, newUser);
    }
}
