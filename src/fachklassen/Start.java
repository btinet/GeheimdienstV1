/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachklassen;

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
        Agent b = new Agent("Mueller", -1000000);
        Agent c = new Agent("Marrento",8);
        Agent d = new Agent( 2);
        
       // Fahrzeug ohne Zubehoer
        Fahrzeug auto1 = new Fahrzeug("B-TK 08", 50, 3);
        
        /* Fahrzeug mit Zubehör
            realisiert als Aggregation:
            Das Zubehör-Objekt wird erzeugt und existiert unabhängig vom Fahrzeug-Objekt
        */
        Zubehoer cdWechsler1 = new Zubehoer("Wexx", "Skoda", 100.0);
        Fahrzeug auto2 = new Fahrzeug ("B-TK 02", 50, 2, cdWechsler1);
        
        /* Fahrzeug mit Zubehör
         realisiert als Komposition:
        Das Zubehör-Objekt wird während der Erzeugung des Fahrzeug-Objektes erzeugt.
        */
        
        Fahrzeug auto3 = new Fahrzeug ("B-TK 05", 50, 4,"CD4U", "Skoda", 80.0);
        
        
        agent007.setVorname("James");
        
        //Zuweisen von Fahrzeug-Objekten
        agent007.setFahrzeug(auto1);
        c.setFahrzeug(auto1);
        b.setFahrzeug(auto2);
        agent007.setFahrzeug(auto3);
        
        
        System.out.println("Name der Agenten");
        
        System.out.println(agent007.getName());
           
        System.out.println(b.getName());
        
        // Alternative für Erzeugung und Zuweisung eines Fahrzeugobjektes
        d.setFahrzeug(new Fahrzeug("b-TK 007",50,3));
        c.setFahrzeug(d.getFahrzeug());
        
        
    }
    
}
