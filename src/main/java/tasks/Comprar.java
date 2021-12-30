package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Compras.*;

@AllArgsConstructor
public class Comprar implements Task {

    private final Map<String, String> ropa;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.keyValues(ropa.get("T-shirts")).into(SEARCH).thenHit(Keys.ENTER),
                Scroll.to(SHIRT),
                Click.on(SHIRT),
                Click.on(ADD)

        );

    }
    public static Comprar articulos(Map<String, String> ropa){

        return instrumented(Comprar.class,ropa);
    }
}
