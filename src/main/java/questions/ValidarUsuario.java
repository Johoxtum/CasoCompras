package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.Registrar.*;

public class ValidarUsuario implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(VALIDATE).viewedBy(actor).asString();
    }
    public static ValidarUsuario exitoso(){

        return new ValidarUsuario();
    }
}
