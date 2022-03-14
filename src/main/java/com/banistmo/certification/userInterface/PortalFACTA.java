package com.banistmo.certification.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PortalFACTA extends{
    public static final Target BTN_DOWNLOAD_PJ_AUTOCERTIFICATION= Target.the("Boton para dscargar documentacion PJ-Autocertificación unificado").located(By.xpath("//*[contains(text(),\"PJ-Autocertificación unificado- Fatca y CRS\")]/../../..//a"));

}
