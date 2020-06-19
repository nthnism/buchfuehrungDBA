/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchfuehrungDBA;

/**
 *
 * @author Fabian
 */
public class GuVKonto extends Abschlusskonto{
    private Konto Aufwandskonto;
    private Konto Ertragskonto;

    public GuVKonto(Konto Aktivkonto, Konto Aufwandskonto, Konto Bestandskonto, Konto Erfolgskonto, Konto Ertragskonto, Konto Passivkonto) {
        this.Aufwandskonto = Aufwandskonto;
        this.Ertragskonto = Ertragskonto;
    }
    
    public Konto getAufwandskonto() {
        return Aufwandskonto;
    }

    public Konto getErtragskonto() {
        return Ertragskonto;
    }
    
    public String ausgeben() {
        String ausgabe = new String();
        ausgabe += super.ausgeben();
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", this.Aufwandskonto.berechneKontosumme(), "Anfangsbestand");
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Saldo", berechneSaldo(), "Summe Habenbuchungen", this.Ertragskonto.berechneKontosumme());
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }

    @Override
    public double berechneKontosumme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double berechneSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
