package com.banistmo.certification.stepDefinitions;

import com.banistmo.certification.tasks.DownloadDocument;
import com.banistmo.certification.tasks.NavegateTo;
import com.banistmo.certification.userInterface.URLHomeBanistmo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
public class ValidarDocumentoPJStepDefinition {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
    @Given("^que Christian esta en la web de Banistmo$")
    public void queChristianEstaEnLaWebDeBanistmo() throws Exception {
        theActorCalled("Christian").wasAbleTo(Open.browserOn(new URLHomeBanistmo()));

    }

    @When("^navega hasta la seccion de FATCA & CRS$")
    public void navegaHastaLaSeccionDeFATCACRS() throws Exception {
        theActorInTheSpotlight().attemptsTo(NavegateTo.factaDocuments());
    }

    @When("^descaga el documento$")
    public void descagaElDocumento() throws Exception {
        theActorInTheSpotlight().attemptsTo(DownloadDocument.PJAutoCertificacionFACTA());
        try {
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

    @Then("^se valida que el documento es el correcto$")
    public void seValidaQueElDocumentoEsElCorrecto() throws Exception {

    }
}
