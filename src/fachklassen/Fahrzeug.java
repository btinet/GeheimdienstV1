package fachklassen;

/**
 *
 * @author Informatik-Kurs
 */
public class Fahrzeug {

    // Attribute
    final private String[] kennzeichen = new String[5];
    private int tankvolumen;
    private int verbrauch; //pro 100 km

    //Refererenzattribut für Objektbeziehung (egal, welcher Art)
    // Zubehör ist jetzt eine Sammlung von 5 Schubladen
    private Zubehoer[] zubehoer = new Zubehoer[5];

    public Fahrzeug(String kennzeichen, int tankvolumen, int verbrauch) {
        this.kennzeichen[0] = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
    }

    /* Aggregation zwischen Fahrzeug-Objekt und Zebehoer-Objekt.
     Der Konstruktor des Fahrzeug-Objektes erwartet als einen Parameter 
    ein bereits existierendes Zubehoer-Objekt
     */
    public Fahrzeug(String kennzeichen, int tankvolumen, int verbrauch, Zubehoer[] zubehoer) {
        this.kennzeichen[0] = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
        this.zubehoer = zubehoer;
    }

    /** Komposition zwischen Fahrzeug-Objekt und Zubehoer-Objekt.
    Der Konstruktor des Fahrzeug-Objektes erwartet neben den Fahrzeug-Paramtern 
    zusätzlich die Parameter zum Erzeugen eines Zubehoer-Objektes.
     */
    public Fahrzeug(String kennzeichen, int tankvolumen, int verbrauch, String bezeichner, String marke, double preis, int zIndex) {
        this.kennzeichen[0] = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;

        // Das Zubehoer-Objekt wird (NUR) als Teil des Fahrzeug-Objektes instanziert.
        this.zubehoer[zIndex - 1] = new Zubehoer(bezeichner, marke, preis);
        // Alternativ: this.createZubehoer(bezeichner, marke, preis);
    }
    
     public void addKennzeichen(String zeichen) {

        /* Version mit for each-Schleife
        *
        *  int pos = 0;
        *  for(String kfz : this.kennzeichen) {
        *      if(kfz == null) {
        *          this.kennzeichen[pos] = zeichen;
        *          break;
        *      }
        *      pos++;
        *  }
        */

         int pos;
         for(pos = 0; pos < this.kennzeichen.length; pos++) {
             if(this.kennzeichen[pos] == null) {
                 this.kennzeichen[pos] = zeichen;
                 break;
             }
         }
        
        if(this.kennzeichen.length == pos) {
            int i;
            for (i = 0; i < this.kennzeichen.length-1; i++) {
                this.kennzeichen[i] = this.kennzeichen[i+1];
            }
            this.kennzeichen[i] = zeichen;
        }
    }

    public String[] getAllKennzeichen() {        
        return this.kennzeichen;
    }

    public String getKennzeichen(int index) {
        if(index >= 0 && index < this.kennzeichen.length) {
            return kennzeichen[index];
        } else {
            System.out.printf("Index '%s' außerhalb des Intervalls [%s,%s]!%n",index,0,this.kennzeichen.length-1);
            return null;
        }

    }
    
    public String getKennzeichen() {
        for (int i = this.kennzeichen.length-1; i >= 0; i--) {
            if (kennzeichen[i] != null) {
                return kennzeichen[i];
            }
        }
        return null;
    }

    public void setTankvolumen(int tankvolumen) {
        this.tankvolumen = tankvolumen;
    }

    public int getTankvolumen() {
        return tankvolumen;
    }

    public void setVerbrauch (int verbrauch) {
        this.verbrauch = verbrauch;
    }

    public int getVerbrauch() {
        return verbrauch;
    }

    // Alternative: Methode zum Erzeugen eines Zubehoer-Objektes
    // Aufruf im Konstruktor des Fahrzeug-Objektes
    public void createZuebehoer(String bezeichner, String marke, double preis, int zIndex) {
        this.zubehoer[zIndex - 1] = new Zubehoer(bezeichner, marke, preis);
    }

    public Zubehoer[] getZubehoer() {
        return zubehoer;
    }

    public Zubehoer getZubehoer(int zIndex) {
        return zubehoer[zIndex - 1];
    }

}
