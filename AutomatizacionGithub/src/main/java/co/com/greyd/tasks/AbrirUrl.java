package co.com.greyd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirUrl implements Task {

    private final static String url ="https://github.com/";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );

    }

    public static AbrirUrl gitHub() {return instrumented(AbrirUrl.class);}
}
