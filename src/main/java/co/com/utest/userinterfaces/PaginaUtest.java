
package co.com.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.emirates.com/co/spanish/")

public class PaginaUtest extends PageObject {



    public static  final Target botonAceptar = Target.the("email")
            .located(By.id("onetrust-accept-btn-handler"));

    public static  final Target contenedor = Target.the("email")
            .located(By.xpath("(//div[@class='dropdown__input-container js-dropdown-open'])[1]"));

    public static  final Target origen = Target.the("email")
            .located(By.xpath("(//input[@class='js-field-input field__input js-dropdown-open field__input--active'])[1]"));

    public static  final Target contenedorDestino = Target.the("email")
            .located(By.xpath("(//div[@class='dropdown__input-container js-dropdown-open'])[2]"));

    public static  final Target cajaDestino = Target.the("email")
            .located(By.xpath("(//input[@class='js-field-input field__input js-dropdown-open field__input--active'])[2]"));

    public static  final Target seleccionaDestino = Target.the("email")
            .located(By.xpath("//li[@class='location__item js-dropdown-select-item highlight js-location-list']"));

    public static  final Target dia = Target.the("email")
            .located(By.xpath(" (//td[@data-date='10'])[2]"));

    public static  final Target diaSalida = Target.the("email")
            .located(By.xpath("(//td[@data-date='6'])[2]"));

    public static  final Target botonBuscar = Target.the("email")
            .located(By.xpath("//button[@class='cta cta--large cta--primary js-widget-submit ']"));































}
