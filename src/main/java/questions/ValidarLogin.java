package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.Login.*;

public class ValidarLogin implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(VALIDA_LOGIN).viewedBy(actor).asString();
    }

    public static ValidarLogin exitoso(){

        return new ValidarLogin();
    }
}
