package co.com.greyd.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target MENSAJE_HOME = Target.the("mensaje que valida pagina Home").located(By.xpath("//h1[contains(text(), 'The home')]"));

}
