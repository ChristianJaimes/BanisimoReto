package com.banistmo.certification.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PortalFACTA extends PageObject {
    public static final Target BTN_DOWNLOAD_PJ_AUTOCERTIFICATION= Target.the("Boton para dscargar documentacion PJ-Autocertificación unificado").located(By.xpath("//*[contains(text(),\"PJ-Autocertificación unificado- Fatca y CRS\")]/../../..//a"));

}
