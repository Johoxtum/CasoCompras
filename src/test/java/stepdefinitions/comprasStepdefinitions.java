package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarLogin;
import questions.ValidarUsuario;
import tasks.Comprar;
import tasks.Diligenciar;
import tasks.Ingresar;


import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class comprasStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan");
    }

    @Given("^El usuario ingresa a la pagina para registrarse$")
    public void elUsuarioIngresaALaPaginaParaRegistrarse() {

        theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));

    }

    @When("^Ingresa los siguientes datos$")
    public void ingresaLosSiguientesDatos(Map<String, String> dato) {

        theActorInTheSpotlight().attemptsTo(Diligenciar.informacion(dato));
    }

    @Then("^Se valida ingreso a la cuenta con la palabra (.*)$")
    public void seValidaIngresoALaCuentaConLaPalabraMYACCOUNT(String validacion) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuario.exitoso(), Matchers.is(Matchers.equalTo(validacion))));

    }

    // login

    @Given("^El usuario ingresa a la pagina para logearse$")
    public void elUsuarioIngresaALaPaginaParaLogearse() {

        theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));

    }

    @When("^El usuario ingresa los siguientes datos$")
    public void ElUsuarioIngresaLosSiguientesDatos(Map<String, String> info) {

        theActorInTheSpotlight().attemptsTo(Ingresar.datos(info));
    }

    @Then("^Se valida logeo exitoso con la palabra (.*)$")
    public void seValidaLogeoExitosoConLaPalabraMYACCOUNT(String palabra) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLogin.exitoso(), Matchers.is(Matchers.equalTo(palabra))));

    }

    // Compras

    @Given("^El usuario ingresa a la pagina principal$")
    public void elUsuarioIngresaALaPaginaPrincipal() {

        theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }


    @When("^El usuario busca la siguiente ropa a comprar$")
    public void elUsuarioBuscaLaSiguienteRopaAComprar(Map<String, String> ropa) {

        theActorInTheSpotlight().attemptsTo(Comprar.articulos(ropa));

    }

    @Then("^Se valida el siguiente mensaje de compra Your order on My Store is complete$")
    public void seValidaElSiguienteMensajeDeCompraYourOrderOnMyStoreIsComplete() {


    }
}
