package fachklassen;


import java.util.ArrayList;
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

    protected ArrayList<Fahrzeug> fahrzeugListe = new ArrayList<>();
 
    
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

    public void addFahrzeugToList(Fahrzeug fahrzeug)
    {
        if(this.fahrzeugListe.size() < this.anzahlFahrzeuge)
        {
            this.fahrzeugListe.add(fahrzeug);
            System.out.println("Fahrzeug mit dem Kennzeichen '" + fahrzeug.getKennzeichen() + "' dem Fuhrpark von " + this.getName() + " hinzugefügt.");
        }
        else
        {
            System.err.println("Der Fuhrpark ist voll. Nicht mehr als " + this.anzahlFahrzeuge + " erlaubt.");
        }
    }

    public void removeFromFahrzeugList(int position)
    {
        if(position >= 0 && position <= this.fahrzeugListe.size())
        {
            System.out.println("Fahrzeug mit dem Kennzeichen '" + this.fahrzeugListe.get(position).getKennzeichen() + "' an Position " + position + " entfernt.");
            this.fahrzeugListe.remove(position);
        }
        else
        {
            System.out.println("An Position " + position + " befindet sich kein Fahrzeug.");
        }
    }

    public int getAktuelleAnzahlFahrzeuge()
    {
        return this.fahrzeugListe.size();
    }

    public int getMaxAnzahlFahrzeuge()
    {
        return this.anzahlFahrzeuge;
    }

    public void addFahrzeugToList(int position, Fahrzeug fahrzeug)
    {
        if(position <= this.anzahlFahrzeuge)
        {
            this.fahrzeugListe.set(position, fahrzeug);
            System.out.println("Fahrzeug mit dem Kennzeichen '" + fahrzeug.getKennzeichen() + "' dem Fuhrpark von " + this.getName() + " an Position " + position + " hinzugefügt/ersetzt.");
        }
        else
        {
            System.err.println("Position darf nicht größer als " + this.anzahlFahrzeuge + " sein.");
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
