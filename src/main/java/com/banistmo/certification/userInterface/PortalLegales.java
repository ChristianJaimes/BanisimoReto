package com.banistmo.certification.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PortalLegales extends PageObject {

    public static final Target BTN_CONOCE_FATCA_CRS = Target.the("Boton de acceso a conocer FACTA y CRS").located(By.xpath("//h3[contains(text(),\"FATCA \")]//..//..//a[contains(text(),\"Conoce más\")]"));

}
