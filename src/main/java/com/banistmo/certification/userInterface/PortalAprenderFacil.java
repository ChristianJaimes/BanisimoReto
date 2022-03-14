package com.banistmo.certification.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PortalAprenderFacil extends PageObject{
    public static final Target BTN_DESCUBRE_LEGALES = Target.the("Boton de acceso a aprender más aspectos legales").located(By.xpath("//h3[contains(text(),\"Legales\")]//..//..//a[contains(text(),\"Descubre más\")]"));

}
