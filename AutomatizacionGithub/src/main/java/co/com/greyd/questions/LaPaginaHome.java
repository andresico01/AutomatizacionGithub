package co.com.greyd.questions;

import co.com.greyd.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaPaginaHome implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.MENSAJE_HOME.resolveFor(actor).isVisible();
    }

    public static LaPaginaHome esVisible() {return new LaPaginaHome();}
}
