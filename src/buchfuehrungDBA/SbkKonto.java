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
public class SbkKonto extends Abschlusskonto {
    private Konto Aktivkonto;
    private Konto Passivkonto;

    public Konto getAktivkonto() {
        return Aktivkonto;
    }

    public Konto getPassivkonto() {
        return Passivkonto;
    }
    
    private String ausgabe() {
        String ausgabe = new String();
        ausgabe += this.Aktivkonto.berechneKontosumme();
        ausgabe += "\n";
        ausgabe += this.Passivkonto.berechneKontosumme();
        
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
