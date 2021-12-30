package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registrar {

    public static final Target BUTTON_REGISTER = Target.the("Boton ingreso a formulario").located(By.xpath("//a[@class='login']"));
    public static final Target EMAIL = Target.the("Ingresamos Email a registrar").located(By.id("email_create"));
    public static final Target BUTTON_SUBMIT = Target.the("Boton").located(By.id("SubmitCreate"));
    public static final Target TITLE = Target.the("Boton Email a registrar").located(By.id("id_gender1"));
    public static final Target FIRSTNAME = Target.the("Primer nombre").located(By.id("customer_firstname"));
    public static final Target LASTNAME = Target.the("Apellido").located(By.id("customer_lastname"));
    public static final Target PASSWORD = Target.the("Contraseña").located(By.id("passwd"));
    public static final Target DAY = Target.the("Dia").located(By.id("days"));
    public static final Target MONTH = Target.the("Month").located(By.id("months"));
    public static final Target YEAR = Target.the("Años").located(By.id("years"));
    public static final Target COMPANY = Target.the("Company").located(By.id("company"));
    public static final Target ADDRESS = Target.the("Direccion").located(By.id("address1"));
    public static final Target ADDRESS2 = Target.the("Direccion2").located(By.id("address2"));
    public static final Target CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target STATE = Target.the("Estado").located(By.id("uniform-id_state"));
    public static final Target STATE2 = Target.the("Escoger").located(By.xpath("//*[text()='Georgia']"));
    public static final Target POSTAL = Target.the("Codigo").located(By.id("postcode"));
    public static final Target COUNTRY = Target.the("country").located(By.id("id_country"));
    public static final Target HOMEPHONE = Target.the("Telefono").located(By.id("phone"));
    public static final Target PHONE= Target.the("Celular").located(By.id("phone_mobile"));
    public static final Target SUBMIT= Target.the("Registrar").located(By.id("submitAccount"));
    public static final Target VALIDATE = Target.the("Nombre h1").located(By.xpath("//h1[@class='page-heading']"));



}

