package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Login.*;

@AllArgsConstructor
public class Ingresar implements Task {

    private final Map<String, String> info;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_LOGIN),
                Enter.keyValues(info.get("Email")).into(EMAIL),
                Enter.keyValues(info.get("Password")).into(PASSWORD),
                Click.on(SUBMIT)
        );

    }
    public static Ingresar datos(Map<String, String> info){

        return instrumented(Ingresar.class,info);
    }
}
