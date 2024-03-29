package fachklassen;

public class Mensch extends Agent
{

    private String vorname;

    private String nachname;

    public Mensch (String vorname, String nachname, int agentNr)
    {
        super(agentNr);
        super.anzahlFahrzeuge = 2;

        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

}
