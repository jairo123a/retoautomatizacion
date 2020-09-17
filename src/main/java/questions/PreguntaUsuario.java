package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebUTest;
import util.Esperas;

public class PreguntaUsuario implements Question<Boolean> {
    String pregunta;
    Esperas esperas;
    public PreguntaUsuario(String pregunta){

        this.pregunta=pregunta;

    }

    public static PreguntaUsuario seRegistro(String pregunta){

        return new PreguntaUsuario(pregunta);

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String respuesta;
        Boolean resultado;
        respuesta = Text.of(ElementosWebUTest.respuesta).viewedBy(actor).asString();

        if (pregunta.equals(respuesta)) {

            resultado = true;

        } else {

            resultado = false;

        }
        esperas.tiempo();
        return resultado;

    }




}
