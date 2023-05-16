package fachklassen;

import java.util.ArrayList;

public class Agent {

    // Deklaration von Attributen
    protected String name;

    protected String vorname;

    protected int agentenNr;

    protected Boolean aktiv;

    // Definiere Anzahl der maximalen Fahrzeuge
    private final int anzahlFahrzeuge = 2;

    // Liste der Fahrzeugobjekte
    protected ArrayList<Fahrzeug> fahrzeugListe = new ArrayList<>();

    // Konstruktor (einer oder mehrere (Überladen von Methoden))
    public Agent() {
        // Initialisieren der Attribute (erstmalige Zuweisung eines Wertes)
        this.name = "Bond";
        this.agentenNr = 7;
    }

    public Agent(int agentenNr) {
        this.agentenNr = agentenNr;
    }

    public Agent(String nachname, int agentenNr) {

        this.name = nachname;
        this.agentenNr = agentenNr;
    }

    //Methoden    
    /**
     *
     * @param position Position, von der ein Fahrzeug zurückgegeben werden soll.
     * @return Gibt ein Fahrzeug-Objekt zurück.
     */
    public Fahrzeug getFahrzeug(int position) {
        position--;
        return this.fahrzeugListe.get(position);
    }

    public ArrayList<Fahrzeug> getFahrzeugeAsList() {
        return this.fahrzeugListe;
    }

    /**
     *
     * @param fahrzeug Fahrzeug, dass der Liste hinzugefügt werden soll.
     */
    public void addFahrzeug(Fahrzeug fahrzeug) {
        if (this.fahrzeugListe.size() < this.anzahlFahrzeuge) {
            this.fahrzeugListe.add(fahrzeug);
            System.out.println("Fahrzeug mit dem Kennzeichen '" + fahrzeug.getKennzeichen() + "' dem Fuhrpark von " + this.getName() + " hinzugefügt.");
        } else {
            System.out.println("Der Fuhrpark ist voll. Nicht mehr als " + this.anzahlFahrzeuge + " erlaubt.");
        }
    }

    /**
     *
     * @param position Position, der ein Fahrzeug zugeordnet werden soll.
     * @param fahrzeug Fahrzeug, dass der Liste hinzugefügt werden soll.
     */
    public void addFahrzeug(int position, Fahrzeug fahrzeug) {
        position--;
        try {
            if (position <= this.anzahlFahrzeuge) {
                this.fahrzeugListe.set(position, fahrzeug);
                System.out.println("Fahrzeug mit dem Kennzeichen '" + fahrzeug.getKennzeichen() + "' im Fuhrpark von " + this.getName() + " an Position " + (position + 1) + " gesetzt.");
            } else {
                System.out.println("Maximale Position darf nicht größer als " + this.anzahlFahrzeuge + " sein.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index existiert (noch) nicht. Versuche lieber 'addFahrzeug(Fahrzeug fahrzeug)'");
        }
    }

    /**
     *
     * @param position Position, an der ein Fahrzeug entfernt werden soll.
     */
    public void removeFahrzeug(int position) {
        position--;
        if (position >= 0 && position <= this.fahrzeugListe.size()) {
            System.out.println("Fahrzeug mit dem Kennzeichen '" + this.fahrzeugListe.get(position).getKennzeichen() + "' an Position " + (position + 1) + " entfernt.");
            this.fahrzeugListe.remove(position);
        } else {
            System.out.println("An Position " + position + " befindet sich kein Fahrzeug.");
        }
    }

    /**
     *
     * @return Gibt die aktuelle Anzahl der Fahrzeuge zurück.
     */
    public int getAktuelleAnzahlFahrzeuge() {
        return this.fahrzeugListe.size();
    }

    /**
     *
     * @return Gibt die maximale Anzahl möglicher Fahrzeuge zurück.
     */
    public int getMaxAnzahlFahrzeuge() {
        return this.anzahlFahrzeuge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAgentenNr() {
        return agentenNr;
    }

    public void setAgentenNr(int agentenNr) {
        this.agentenNr = agentenNr;
    }

    public Boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }

}
