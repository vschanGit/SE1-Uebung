package org.hbrs.se.ws20.uebung1.control.factory;
import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.view.Client;

public class Factory {

    public static GermanTranslator createGermanTranslator(){
        return new GermanTranslator();
    }

    public static Client createClient(){
        return new Client();
    }
}
