/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachklassen;

/**
 *
 * @author Informatik-Kurs
 */
public class Zubehoer {
    
    private String bezeichner;
    private String marke;
    private double preis;

    public Zubehoer(String bezeichner, String marke, double preis) {
        this.bezeichner = bezeichner;
        this.marke = marke;
        this.preis = preis;
    }

    public String getBezeichner() {
        return bezeichner;
    }

    public String getMarke() {
        return marke;
    }

    public double getPreis() {
        return preis;
    }
    
    
    
}
