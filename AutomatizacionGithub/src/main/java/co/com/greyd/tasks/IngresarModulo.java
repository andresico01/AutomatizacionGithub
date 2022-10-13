package co.com.greyd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.greyd.userinterface.IndexPage.BOTON_MODULO_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarModulo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_MODULO_LOGIN, isVisible()),
                Click.on(BOTON_MODULO_LOGIN)
        );

    }
    public static IngresarModulo login() {return instrumented(IngresarModulo.class);}
}
