package org.hbrs.se.ws20.uebung1.view;

import org.hbrs.se.ws20.uebung1.control.factory.Factory;

public class ClientTest {
    public static void main(String[] args){
        Factory.createClient().display(1);
        Factory.createClient().display(10);
        Factory.createClient().display(5);
        Factory.createClient().display(-1);
        Factory.createClient().display(-5);
        Factory.createClient().display(11);
        Factory.createClient().display(20);
    }
}
