package co.com.greyd.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target ENTRADA_USUARIO = Target.the("Entrada nombre de usuario").located(By.xpath("//input[@id='login_field']"));
    public static final Target ENTRADA_CLAVE = Target.the("Entrada clave").located(By.xpath("//input[@id='password']"));
    public static final Target BOTON_LOGIN = Target.the("Boton que redirige a la pagina principal").located(By.xpath("//input[@name='commit']"));
}
