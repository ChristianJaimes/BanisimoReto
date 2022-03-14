package com.banistmo.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.banistmo.certification.userInterface.PortalFACTA.BTN_DOWNLOAD_PJ_AUTOCERTIFICATION;

public class DownloadDocument implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DOWNLOAD_PJ_AUTOCERTIFICATION)
        );
    }
    public static DownloadDocument PJAutoCertificacionFACTA(){
        return Tasks.instrumented(DownloadDocument.class);
    }
}
