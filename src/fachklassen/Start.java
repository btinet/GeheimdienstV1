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

        // Erzeugen (Instanzieren) eines Objektes durch folgende Anweisung
        // Klasse Objektbezeichner = new Konstruktor (Parameterliste)
        
        
        Agent agent007 = new Agent();

        agent007.addFahrzeug(1, new Fahrzeug("BMW",50,5));
        agent007.addFahrzeug(2, new Fahrzeug("BMW",50,5));
        agent007.addFahrzeug(3, new Fahrzeug("BMW",50,5));

        agent007.addFahrzeug(new Fahrzeug("B-TKA103",50,5));
        agent007.addFahrzeug(new Fahrzeug("B-TK0815",50,5));
        agent007.addFahrzeug(new Fahrzeug("B-TKA301",50,5));
        agent007.addFahrzeug(2, new Fahrzeug("BMW",50,5));
        agent007.removeFahrzeug(1);
        agent007.addFahrzeug(new Fahrzeug("LDS-0815",10,10));

        ArrayList<Fahrzeug> bondFahrzeuge = agent007.getFahrzeugeAsList();

        for(Fahrzeug fahrzeug : bondFahrzeuge){
            System.out.println("Bond hat Fahrzeug mit Kennzeichen: " + fahrzeug.getKennzeichen());
        }
        
    }
    
}
