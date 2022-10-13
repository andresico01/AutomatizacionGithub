package co.com.greyd.stepdefinitions.iniciarsesion;

import co.com.greyd.model.Usuario;
import co.com.greyd.questions.LaPaginaHome;
import co.com.greyd.tasks.AbrirUrl;
import co.com.greyd.tasks.IngresarCredenciales;
import co.com.greyd.tasks.IngresarModulo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinitions {

    private static final String ACTOR = "usuario";


    @Before
    public void setTheStage()
    {
        OnStage.setTheStage(new OnlineCast());
        setDriver();
    }
    public void setDriver()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        BrowseTheWeb.as(theActorCalled(ACTOR)).setDriver(new ChromeDriver(options));
    }

    @Given("^Ingresa a la Pagina principal de github$")
    public void ingresaALaPaginaPrincipalDeGithub() {
        theActorCalled(ACTOR).wasAbleTo(AbrirUrl.gitHub());
    }

    @When("^Entra al modulo de login$")
    public void entraAlModuloDeLogin() {
        theActorInTheSpotlight().attemptsTo(IngresarModulo.login());
    }

    @When("^Introduce las credenciales$")
    public void introduceLasCredenciales(List<String> credenciales) {
        Usuario usuario = new Usuario(credenciales.get(0),credenciales.get(1));
        theActorInTheSpotlight().attemptsTo(IngresarCredenciales.con(usuario));

    }

    @Then("^podra validar que esta en la pagina home$")
    public void podraValidarQueEstaEnLaPaginaHome() {
        theActorInTheSpotlight().should(seeThat(LaPaginaHome.esVisible()));
    }
}
