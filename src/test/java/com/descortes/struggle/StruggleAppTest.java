package com.descortes.struggle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StruggleAppTest {


    @Test
    public void test01_HumanoConEspadaVsHumanoConEspadaEnEstadioEmpate() {
        String result = StruggleApp.run("estadio", "humano", "espada", "humano", "espada");
        assertEquals("Resultado: empate", result);
    }

    @Test
    public void test02_HumanoConEspadaVsHumanoConManoEnEstadioGana1() {
        String result = StruggleApp.run("estadio", "humano", "espada", "humano", "mano");
        assertEquals("Resultado: gana 1", result);
    }

    @Test
    public void test03_HumanoConEspadaVsHumanoConCuchilloEnEstadioGana2() {
        String result = StruggleApp.run("estadio", "humano", "espada", "humano", "cuchillo");
        assertEquals("Resultado: gana 2", result);
    }

    @Test
    public void test04_HumanoConEspadaVsLoboConManoEnCiudadGana1() {
        String result = StruggleApp.run("ciudad", "humano", "espada", "lobo", "mano");
        assertEquals("Resultado: gana 1", result);
    }

    @Test
    public void test05_VampiroConEspadaVsLoboConManoEnNocheGana1() {
        String result = StruggleApp.run("noche", "vampiro", "espada", "lobo", "mano");
        assertEquals("Resultado: gana 1", result);
    }

    @Test
    public void test06_VampiroConCuchilloVsLoboConManoEnLluviaEmpate() {
        String result = StruggleApp.run("lluvia", "vampiro", "cuchillo", "lobo", "mano");
        assertEquals("Resultado: empate", result);
    }

    @Test
    public void test07_EscenarioDesconocidoLanzaError() {
        String result = StruggleApp.run("ningun_lugar", "humano", "mano", "humano", "mano");
        assertEquals("error: escenario desconocido", result);
    }

    @Test
    public void test08_HumanoConManoVsLoboConManoEnEstadioGana2() {
        String result = StruggleApp.run("estadio", "humano", "mano", "lobo", "mano");
        assertEquals("Resultado: gana 2", result);
    }

    @Test
    public void test09_HumanoConManoVsLoboConManoEnBosqueGana2() {
        String result = StruggleApp.run("bosque", "humano", "mano", "lobo", "mano");
        assertEquals("Resultado: gana 2", result);
    }

}