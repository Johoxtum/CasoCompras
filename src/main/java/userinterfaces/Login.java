package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target BUTTON_LOGIN = Target.the("Boton ingreso a formulario").located(By.xpath("//a[@class='login']"));
    public static final Target EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target PASSWORD = Target.the("Contraseña").located(By.id("passwd"));
    public static final Target SUBMIT = Target.the("Ingresar").located(By.id("SubmitLogin"));
    public static final Target VALIDA_LOGIN = Target.the("Nombre h1").located(By.xpath("//h1[@class='page-heading']"));
}
