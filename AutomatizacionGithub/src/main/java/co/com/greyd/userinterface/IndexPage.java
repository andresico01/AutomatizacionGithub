package co.com.greyd.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage extends PageObject {
    public static final Target BOTON_MODULO_LOGIN = Target.the("Boton que redirige al modulo de  login").located(By.xpath("//a[@href='/login']"));
}
