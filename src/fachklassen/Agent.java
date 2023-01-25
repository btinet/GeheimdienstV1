package fachklassen;


import java.util.List;

public class Agent {
 // Deklaration von Attributen
private String name;
private String vorname;
private int agentenNr;

//Refererenzattribut für Objektbeziehung
private Fahrzeug fahrzeug;

    private final int anzahlFahrzeuge = 2;
    protected Fahrzeug[] fahrzeuge = new Fahrzeug[anzahlFahrzeuge];
 
    
// Konstruktor (einer oder mehrere (Überladen von Methoden))

    public Agent() {
        // Initialisieren der Attribute (erstmalige Zuweisung eines Wertes)
        this.name = "Bond";
        this.agentenNr = 7;
           
    }
    
    public Agent(int agentenNr){
        this.agentenNr = agentenNr;
    }
    
    public Agent(String nachname, int agentenNr){
        
       this.name = nachname;
       this.agentenNr = agentenNr;
    }
    
       
//Methoden
    
    // Zuweisungsmethode für Assoziation zwischen Agent-Objekt und Fahrzeug-Objekt
    
    public void setFahrzeug(Fahrzeug fahrzeug){
        this.fahrzeug = fahrzeug;
    
    }
    
    public Fahrzeug getFahrzeug(){
        return this.fahrzeug;
    }

    public void addFahrzeug(int position, Fahrzeug fahrzeug)
    {
        if(position > 0 && position <= this.anzahlFahrzeuge)
        {
            this.fahrzeuge[position-1] = fahrzeug;
            System.out.println("Fahrzeug an Position " + position + " von " + this.anzahlFahrzeuge + " platziert.");
        }
        else
        {
            System.err.println("Die Fuhrparkposition muss mindestens 1 und maximal " + this.anzahlFahrzeuge + " sein.");
        }
    }

    public String getName() {
        return name;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public String getVorname() {
        return vorname;
    }

    public int getAgentenNr() {
        return agentenNr;
    }

    public String datenAnzeigen(){
        return "Test";
    }
   
}
