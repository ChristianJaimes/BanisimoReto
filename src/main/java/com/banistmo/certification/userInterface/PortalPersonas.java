package com.banistmo.certification.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PortalPersonas extends PageObject {

    public static final Target BUTTON_APRENDER_FACIl = Target.the("Boton para acceder a: \"Aprender es facil \"").located(By.xpath("//a[contains(text(),\"Aprender es Fácil\")]"));
}
