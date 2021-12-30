package tasks;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;



import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Registrar.*;


@AllArgsConstructor
public class Diligenciar implements Task {

    private final Map<String, String> dato;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BUTTON_REGISTER),
                Enter.keyValues(dato.get("Email")).into(EMAIL),
                Click.on(BUTTON_SUBMIT),
                Click.on(TITLE),
                Enter.keyValues(dato.get("FirstName")).into(FIRSTNAME),
                Enter.keyValues(dato.get("Lastname")).into(LASTNAME),
                Enter.keyValues(dato.get("Password")).into(PASSWORD),
                Enter.keyValues(dato.get("Day")).into(DAY),
                Enter.keyValues(dato.get("Month")).into(MONTH),
                Enter.keyValues(dato.get("Year")).into(YEAR),
                Scroll.to(DAY),
                Enter.keyValues(dato.get("Company")).into(COMPANY),
                Enter.keyValues(dato.get("Adress")).into(ADDRESS),
                Enter.keyValues(dato.get("Adress2")).into(ADDRESS2),
                Enter.keyValues(dato.get("City")).into(CITY),
                Click.on(STATE),
                Click.on(STATE2),
                Enter.keyValues(dato.get("Postal")).into(POSTAL),
                Enter.keyValues(dato.get("Country")).into(COUNTRY),
                Enter.keyValues(dato.get("Homephone")).into(HOMEPHONE),
                Enter.keyValues(dato.get("Phone")).into(PHONE),
                Click.on(SUBMIT)

        );

    }

    public static Diligenciar informacion(Map<String, String> dato){

        return instrumented(Diligenciar.class,dato);
    }
}
