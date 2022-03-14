#language:en
Feature:
  YO como Test Atomator Engeneer de Banismo
  DESEO decargar el documento PJ-Autocertificación unificado- Fatca y CRS.pdf del portal Web de Banistmo
  PARA Validar que el documento generado es el correcto

  Scenario:Es Validar generacion del docuemnto PJ-Autocertificación unificado- Fatca y CRS.pdf

    Given que Christian esta en la web de Banistmo
    When navega hasta la seccion de FATCA & CRS
    And descaga el documento
    Then se valida que el documento es el correcto
