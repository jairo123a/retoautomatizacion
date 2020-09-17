package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.KeyInput;
import userinterface.ElementosWebUTest;
import util.Esperas;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

public class Registrar implements Task {

    List<UtestData> datos;
    Esperas esperas;
    private Registrar(List data){

        datos=data;


    }

    public static Registrar unUsuario(List<UtestData> data) {


        return new Registrar(data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebUTest.registrar),
                Enter.theValue(datos.get(0).getNombre()).into(ElementosWebUTest.nombre),
                Enter.theValue(datos.get(0).apellido).into(ElementosWebUTest.apellido),
                Enter.theValue(datos.get(0).correo).into(ElementosWebUTest.correo),
                Click.on(ElementosWebUTest.mes),
                SelectFromOptions.byVisibleText(datos.get(0).mes).from(ElementosWebUTest.mes),
                Click.on(ElementosWebUTest.dia),
                SelectFromOptions.byVisibleText(datos.get(0).dia).from(ElementosWebUTest.dia),
                Click.on(ElementosWebUTest.ano),
                SelectFromOptions.byVisibleText(datos.get(0).ano).from(ElementosWebUTest.ano),
                WaitUntil.the(ElementosWebUTest.nextlocation,
                        isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ElementosWebUTest.nextlocation),
                WaitUntil.the(ElementosWebUTest.nextdevices,
                        isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ElementosWebUTest.nextdevices),
                WaitUntil.the(ElementosWebUTest.nextlast,
                        isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ElementosWebUTest.nextlast),
                Click.on(ElementosWebUTest.password),
                Enter.theValue(datos.get(0).password).into(ElementosWebUTest.password),
                Enter.theValue(datos.get(0).confirm).into(ElementosWebUTest.passwordconfir),
                Click.on(ElementosWebUTest.check1),
                Click.on(ElementosWebUTest.check2),
                Click.on(ElementosWebUTest.complete)
        );



    }
}
