# Klassen

## Inhalt

1. [Klassenkopf](#klassenkopf)
2. [Klassenkörper](#klassenkrper)
3. [Attribute](#attribute)
4. [Methoden](#methoden)
   1. [Constructor](#constructor)
   2. [Auftrag](#auftrag)
   3. [Anfrage](#anfrage)

Jede Java Klasse besteht aus einem Klassenkopf und einem Klassenkörper.

## Klassenkopf

Der Klassenkopf enthält
mindestens:

- Sichtbarkeit (_public, private_)
- Typ (_class, enum, interface_)
- Bezeichnung (_selbstgewählter Name_)

Der Klassenname wird grundsätzlich am Anfang großgeschrieben und sollte
nur ASCII-Zeichen enthalten.

## Klassenkörper

Die Attribute und Methoden der Klassen werden innerhalb der geschweiften
Klammern notiert. Der Klassenkörper folgt unmittelbar dem Klassenkopf.

````java
// Klassenname.java
public class Klassenname // Klassenkopf
{    
    // Klassenkörper    
}
````

## Attribute

Jede Klasse kann mehrere Attribute besitzen, muss sie jedoch nicht.
Attribute werden - ebenso wie Methoden - innerhalb des Klassenkörpers
notiert.

Im Folgenden ist die Klasse ``Agent`` beispielhaft dargestellt. Jede Instanz
der Klasse Agent soll einen **Namen** haben.

Wie bei den Klassenkörpern erwartet jedes Attribut drei Schlüsselwörter:

- Sichtbarkeit (_public,_protected_, private_)
- Typ (_Datentyp_)
- Bezeichnung (_selbstgewählter Name_)

Attribute werden, ebenso wie Variablen, stets kleingeschrieben. So lässt sich
besser zwischen Variable und Datentyp unterscheiden. Der Datentyp wird immer großgeschrieben.
Ausnahmen stellen nur die sogenannten primitiven Datentypen dar, wie etwa ``int``, da diese
keiner Datentypklasse entspringen und deshalb auch keine eigenen Methoden besitzen.
Mehr dazu auch unter [Datentypen]()

Um das Attribut manipulieren zu können, setzen wir die Sichtbarkeit auf public.
Warum das nicht immer sinnvoll ist, wird im Abschnitt **Methoden** erläutert.

Da der Agentenname eine Zeichenkette sein soll, setzen wir als Datentyp ``String``.


````java
// Agent.java
public class Agent // Klassenkopf
{
    public String name; // Attribut (Datentyp attributName)
}
````

## Methoden

Methoden werden im Klassenkörper notiert und haben denselben formalen Aufbau wie die Klassen
selbst. Sie bestehen also aus einem Methodenkopf und einem Methodenkörper.

````java
// Klassenname.java
public class Klassenname // Klassenkopf
{
    
    public Rückgabedatentyp methodenName // Methodenkopf
            (
                    Parameterdatentyp parameterBezeichner // Parameterliste (kommagetrennt)
            ) 
    {
        // Methodenkörper
    }    
    
}
````

Obwohl alle Methoden demselben Aufbau folgen, lassen sich mindestens drei Arten von Methoden
unterscheiden.

### Constructor

Constructor-Methoden werden beim Initialisieren einer Instanz ausgeführt. Sie sind daran
erkennbar, dass sie grundsätzlich großgeschrieben werden und denselben Namen haben wie ihre
Klasse.

Da Constructor-Methoden immer die eigene Klasse zurückgeben, fehlt hier der Rückgabetyp.

Unsere Klasse [Agent](../src/fachklassen/Agent.java) könnte also folgenden Constructor haben:

````java
// Agent.java
public class Agent // Klassenkopf
{
    public String name; // Attribut
    
    public Agent() // Constructor, Methodenkopf
    {
        // Constructor, Methodenkörper
    }
}
````

Um zu verstehen, was die Constructor-Methode macht, könnten wir uns den Aufbau so vorstellen:

````java
public class Agent // Klassenkopf
{    
    public Agent constructor() // Constructor, Methodenkopf
    {
        // Constructor, Methodenkörper
    }
}
````

Da die Constructor-Methode nur ihre Klasse zurückgibt (ähnliches Verhalten wie ``void``),
handelt es sich hier also um einen sogenannten Auftrag. Denn es wurde mit ``Agent bond = new Agent()``
der Auftrag erteilt, eine neue Instanz vom Typ Agent zu erstellen.

Wir können also Methoden unterscheiden in **Aufträge** und **Anfragen**.

### Auftrag

Aufträge sind dadurch gekennzeichnet, dass Sie:

1. keinen Rückgabewert (*void*)
2. meistens wenigstens einen Parameter

erwarten.

Setzen wir einmal das Attribut ``name`` auf **protected**.
Nun können wir nicht mehr direkt auf das Attribut zugreifen.
Stattdessen verwenden wir eine sogenannte Set-Methode (Auftrag),
um den Namen des Agentenobjekts festzulegen.

Warum eigentlich **protected**? Ich zwinge den Benutzer,
die Get- und Set-Methoden zu verwenden, da ich mir vorbehalte,
weitere Algorithmen zum Setzen und Auslesen des Attributs zu
implementieren.

````java
// Agent.java
public class Agent // Klassenkopf
{
    protected String name; // Attribut
    
    public Agent() // Constructor, Methodenkopf
    {
        // Constructor, Methodenkörper
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
````

Über die Set-Methode ``setName()`` können wir nun den
Namen des Agenten festlegen. Als Parameter wird derselbe
Datentyp übergeben, den das Attribut hat. Es wäre aber
auch eine andere Herangehensweise denkbar.

````java
// Agent.java
public class Agent // Klassenkopf
{
   protected String name; // Attribut

   public Agent() // Constructor, Methodenkopf
   {
      // Constructor, Methodenkörper
   }

   public void setName(int code)
   {
      
      // Gegenbeispiel für den Fall, wo der Parameterdatentyp abweicht. 
      switch (code) {
         case 1 -> this.name = "Bond";
         case 2 -> this.name = "Goldfinger";
         case 3 -> this.name = "Batman";
         default -> {
            this.name = "Generischer Agent";
            System.err.println("Eingegebener Code '" + code + "' ist ungültig!");
         }
      }
      
   }
   
}
````

### Anfrage

