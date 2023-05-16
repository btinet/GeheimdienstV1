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
        Agent agent007 = new Agent();

        agent007.addFahrzeug(1, new Fahrzeug("BMW", 50, 5));
        agent007.addFahrzeug(2, new Fahrzeug("BMW", 50, 5));

        agent007.addFahrzeug(new Fahrzeug("B-TKA103", 50, 5));
        agent007.addFahrzeug(new Fahrzeug("B-TK0815", 50, 5));
        agent007.addFahrzeug(new Fahrzeug("B-TKA301", 50, 5));
        agent007.addFahrzeug(2, new Fahrzeug("BMW", 50, 5));
        agent007.removeFahrzeug(1);
        agent007.addFahrzeug(new Fahrzeug("LDS-0815", 10, 10));

        ArrayList<Fahrzeug> bondFahrzeuge = agent007.getFahrzeugeAsList();

        agent007.getFahrzeug(1).createZuebehoer("UKW-Radio", "Blaupunkt", 99.95, 1);
        agent007.getFahrzeug(2).createZuebehoer("CD-Spieler", "Bohse", 499.95, 3);
        
        System.out.println("Kennzeichen ändern");
        Fahrzeug kfz1 = agent007.getFahrzeug(1);
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        
        System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");
        
        System.out.println("Kennzeichen ABCD");        
        kfz1.addKennzeichen("ABCD");        
       System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");
        
        System.out.println("Kennzeichen 1234");
        kfz1.addKennzeichen("1234");
        System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");
        
        System.out.println("Kennzeichen xxx");
        kfz1.addKennzeichen("xxx");
        System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");
        
        System.out.println("Kennzeichen yyy");
        kfz1.addKennzeichen("yyy");
        System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");
        
        System.out.println("Kennzeichen xyz, def und 456");
        kfz1.addKennzeichen("xyz");
        kfz1.addKennzeichen("def");
        kfz1.addKennzeichen("456");
        System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");
        
        System.out.println("Kennzeichen gulu");
        kfz1.addKennzeichen("gulu");
        System.out.println("--------------------");
        for(String zeichen : kfz1.getAllKennzeichen()) {
            System.out.println("Kennzeichen: " + zeichen);
        }
        System.out.println("--------------------");
        System.out.printf("Aktuelles Kennzeichen: %s%n",kfz1.getKennzeichen());
        System.out.println("====================");

        kfz1.getKennzeichen(5);

        for (Fahrzeug fahrzeug : bondFahrzeuge) {
            System.out.println("Bond hat Fahrzeug mit Kennzeichen: " + fahrzeug.getKennzeichen());
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
