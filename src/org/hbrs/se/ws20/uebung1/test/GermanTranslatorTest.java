package org.hbrs.se.ws20.uebung1.test;

import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.control.Translator;
import org.hbrs.se.ws20.uebung1.control.factory.Factory;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GermanTranslatorTest {

    @Test
    public void translateNumberTest(){
        GermanTranslator myGermanTranslator = Factory.createGermanTranslator();
        assertEquals("eins", myGermanTranslator.translateNumber(1));
        assertEquals("zehn", myGermanTranslator.translateNumber(10));
        assertEquals("fünf", myGermanTranslator.translateNumber(5));
        assertEquals("Übersetzung der Zahl " + -1 + " nicht möglich (" + Translator.version + ")" , myGermanTranslator.translateNumber(-1));
        assertEquals("Übersetzung der Zahl " + -5 + " nicht möglich (" + Translator.version + ")", myGermanTranslator.translateNumber(-5));
        assertEquals("Übersetzung der Zahl " + 11 + " nicht möglich (" + Translator.version + ")", myGermanTranslator.translateNumber(11));
        assertEquals("Übersetzung der Zahl " + 20 + " nicht möglich (" + Translator.version + ")", myGermanTranslator.translateNumber(20));
    }
}