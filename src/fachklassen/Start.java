/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachklassen;

import java.util.ArrayList;

/**
 *
 * @author fass
 */
public class Start {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Erzeugen (Instantiieren) eines Objektes durch folgende Anweisung
        // Klasse Objektbezeichner = new Konstruktor (Parameterliste)
        Agent agent007 = new Mensch("James","Bond", 7);

        agent007.addFahrzeug(1, new Fahrzeug("BMW", 50, 5));
        agent007.addFahrzeug(2, new Fahrzeug("BMW", 50, 5));

        agent007.addFahrzeug(new Fahrzeug("B-TKA103", 50, 5));
        agent007.addFahrzeug(new Fahrzeug("B-TK0815", 50, 5));
        agent007.addFahrzeug(new Fahrzeug("B-TKA301", 50, 5));
        agent007.addFahrzeug(2, new Fahrzeug("BMW", 50, 5));
        agent007.removeFahrzeug(1);
        agent007.addFahrzeug(new Fahrzeug("LDS-0815", 10, 10));

        ArrayList<Fahrzeug> bondFahrzeuge = agent007.getFahrzeugeAsList();

        Fahrzeug f1 = agent007.getFahrzeug(1);
        Fahrzeug f2 = agent007.getFahrzeug(2);
        
        if(f1 != null) {
            f1.createZuebehoer("UKW-Radio", "Blaupunkt", 99.95, 1);

            System.out.println("Kennzeichen ändern");
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());

            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            System.out.println("Kennzeichen ABCD");
            f1.addKennzeichen("ABCD");
            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            System.out.println("Kennzeichen 1234");
            f1.addKennzeichen("1234");
            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            System.out.println("Kennzeichen xxx");
            f1.addKennzeichen("xxx");
            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            System.out.println("Kennzeichen yyy");
            f1.addKennzeichen("yyy");
            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            System.out.println("Kennzeichen xyz, def und 456");
            f1.addKennzeichen("xyz");
            f1.addKennzeichen("def");
            f1.addKennzeichen("456");
            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            System.out.println("Kennzeichen gulu");
            f1.addKennzeichen("gulu");
            System.out.println("--------------------");
            for(String zeichen : f1.getAllKennzeichen()) {
                System.out.println("Kennzeichen: " + zeichen);
            }
            System.out.println("--------------------");
            System.out.printf("Aktuelles Kennzeichen: %s%n",f1.getKennzeichen());
            System.out.println("====================");

            f1.getKennzeichen(5);
        }

        if(f2 != null) {
            f2.createZuebehoer("CD-Spieler", "Bohse", 499.95, 3);
        }
        


        for (Fahrzeug fahrzeug : bondFahrzeuge) {
            fahrzeug.setTankvolumen(100);

            System.out.println("Bond hat Fahrzeug mit Kennzeichen: " + fahrzeug.getKennzeichen());
            System.out.printf("Sein Tank hat ein Volumen von %s Litern.%n",fahrzeug.getTankvolumen());
            int i = 1;
            for (Zubehoer zubehoer : fahrzeug.getZubehoer()) {
                if (zubehoer != null) {
                    System.out.println("Zubehoer-Slot " + i + " ist: " + zubehoer.getBezeichner() + " (" + zubehoer.getMarke() + ")");
                } else {
                    System.out.println("Zubehoer-Slot " + i + " ist leer.");
                }
                i++;
            }

        }

    }

}
