package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PreguntaUsuario;
import tasks.Abrir;
import tasks.Registrar;

import java.util.List;

public class StepDefinition {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());


    }



    @Given("^Ingresar al sitio web$")
    public void ingresarAlSitioWeb() {

      OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());

    }


    @When("^ingresar a registro y  diligenciar los datos de ingreso$")
    public void ingresarARegistroYDiligenciarLosDatosDeIngreso(List<UtestData> losdatos) {

        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.unUsuario(losdatos));

    }

    @Then("^Verificar El registro correcto del usuario \"([^\"]*)\"$")
    public void verificarElRegistroCorrectoDelUsuario(String lapregunta) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaUsuario.seRegistro(lapregunta)));
    }



}
