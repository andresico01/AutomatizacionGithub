package co.com.greyd.tasks;

import co.com.greyd.model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.greyd.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarCredenciales implements Task {
    private Usuario usuario;

    public IngresarCredenciales(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ENTRADA_USUARIO, isVisible()),
                Enter.theValue(usuario.getUsername()).into(ENTRADA_USUARIO),
                Enter.theValue(usuario.getPassword()).into(ENTRADA_CLAVE),
                Click.on(BOTON_LOGIN)
        );

    }

    public static IngresarCredenciales con(Usuario usuario) {return instrumented(IngresarCredenciales.class, usuario);}
}
