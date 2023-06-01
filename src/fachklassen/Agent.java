package fachklassen;

import java.util.ArrayList;

public abstract class Agent {

    // Deklaration von Attributen
    protected int agentenNr;

    protected Boolean aktiv;

    // Definiere Anzahl der maximalen Fahrzeuge
    protected int anzahlFahrzeuge = 0;

    // Liste der Fahrzeugobjekte
    protected ArrayList<Fahrzeug> fahrzeugListe = new ArrayList<>();

    // Konstruktor

    public Agent(int agentenNr) {
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
        try {
        return this.fahrzeugListe.get(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index existiert nicht.");
        }
        return null;
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
            System.out.println("Fahrzeug mit dem Kennzeichen '" + fahrzeug.getKennzeichen() + "' dem Fuhrpark von " + this.getAgentenNr() + " hinzugefügt.");
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
                System.out.println("Fahrzeug mit dem Kennzeichen '" + fahrzeug.getKennzeichen() + "' im Fuhrpark von " + this.getAgentenNr() + " an Position " + (position + 1) + " gesetzt.");
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
        try {
            if (position >= 0 && position <= this.fahrzeugListe.size()) {
                System.out.println("Fahrzeug mit dem Kennzeichen '" + this.fahrzeugListe.get(position).getKennzeichen() + "' an Position " + (position + 1) + " entfernt.");
                this.fahrzeugListe.remove(position);
            } else {
                System.out.println("An Position " + position + " befindet sich kein Fahrzeug.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Kein Fahrzeug an dieser Stelle vorhanden.");
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
