package fachklassen;

/**
 *
 * @author Informatik-Kurs
 */
public class Fahrzeug {
    // Attribute
   private String kennzeichen;
   private int tankvolumen;
   private int verbrauch; //pro 100 km
   
   //Refererenzattribut für Objektbeziehung (egal, welcher Art)
   private Zubehoer zubehoer;

    public Fahrzeug(String kennzeichen, int tankvolumen, int verbrauch) {
        this.kennzeichen = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
    }
    
    /* Aggregation zwischen Fahrzeug-Objekt und Zebehoer-Objekt.
     Der Konstruktor des Fahrzeug-Objektes erwartet als einen Parameter 
    ein bereits existierendes Zubehoer-Objekt
        */
    
    public Fahrzeug(String kennzeichen, int tankvolumen, int verbrauch, Zubehoer zubehoer) {
        this.kennzeichen = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
        this.zubehoer = zubehoer;
    }
    
    /* Kompostion zwischen Fahrzeug-Objekt und Zubehoer-Objekt.
    Der Konstruktor des Fahrzeug-Objektes erwartet neben den Fahrzeug-Paramtern 
    zusätzlich die Parameter zum Erzeugen eines Zubehoer-Objektes.
    */
    
    public Fahrzeug(String kennzeichen, int tankvolumen, int verbrauch, String bezeichner, String marke, double preis) {
        this.kennzeichen = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
        
        // Das Zubehoer-Objekt wird (NUR) als Teil des Fahrzeug-Objektes instanziert.
         this.zubehoer = new Zubehoer(bezeichner, marke, preis);
         // Alternativ: this.createZubehoer(bezeichner, marke, preis);
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getTankvolumen() {
        return tankvolumen;
    }

    public int getVerbrauch() {
        return verbrauch;
    }
    
    // Alternative: Methode zum Erzeugen eines Zubehoer-Objektes
    // Aufruf im Konstruktor des Fahrzeug-Objektes
    public void createZuebehoer(String bezeichner, String marke, double preis){
        this.zubehoer = new Zubehoer(bezeichner, marke, preis);
    }
    
}
