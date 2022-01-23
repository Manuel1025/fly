package co.com.utest.tasks;
import co.com.utest.userinterfaces.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

import static co.com.utest.userinterfaces.PaginaUtest.*;
import static net.serenitybdd.screenplay.actions.Scroll.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.springframework.util.ClassUtils.isPresent;

public class Abrir implements Task {

    private PaginaUtest pagina;

    public static Abrir laPagina() {

        return Tasks.instrumented(Abrir.class);


    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //WebDriver driver;

        actor.attemptsTo(Open.browserOn(pagina),
                Click.on(botonAceptar),
                Click.on(contenedor),
                Enter.theValue("Medellin").into(origen),
                Hit.the(Keys.ARROW_DOWN).into(origen),
                Hit.the(Keys.TAB).into(origen),
                Click.on(contenedorDestino),
                Enter.theValue("Lima").into(cajaDestino),
                Click.on(seleccionaDestino),
                Click.on(dia),
                Click.on(diaSalida),
                Click.on(botonBuscar)





      );


    }
}
