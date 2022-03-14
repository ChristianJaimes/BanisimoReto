package com.banistmo.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.banistmo.certification.userInterface.PortalAprenderFacil.BTN_DESCUBRE_LEGALES;
import static com.banistmo.certification.userInterface.PortalLegales.BTN_CONOCE_FATCA_CRS;
import static com.banistmo.certification.userInterface.PortalPersonas.BUTTON_APRENDER_FACIl;

public class NavegateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_APRENDER_FACIl),
                Click.on(BTN_DESCUBRE_LEGALES),
                Click.on(BTN_CONOCE_FATCA_CRS)


        );
    }
    public static NavegateTo factaDocuments(){
        return Tasks.instrumented(NavegateTo.class);
    }
}
