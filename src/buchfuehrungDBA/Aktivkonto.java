package buchfuehrungDBA;


public class Aktivkonto extends Bestandskonto {

    public Aktivkonto(int kontoNr, String kontoBezeichnung)
    {
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
    }

    public Aktivkonto(int kontoNr, String kontoBezeichnung, double anfangsbestand)
    {
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.anfangsbestand = anfangsbestand;
    }

    public Aktivkonto(int kontoNr, String kontoBezeichnung, double anfangsbestand, double summeSollbuchungen, double summeHabenbuchungen){
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.anfangsbestand = anfangsbestand;
        this.summeSollbuchungen = summeSollbuchungen;
        this.summeHabenbuchungen = summeHabenbuchungen;
    }
    
    @Override
    public String ausgeben()
    {
        String ausgabe = new String();
        ausgabe += super.ausgeben();
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Anfangsbestand", anfangsbestand, "Summe Habenbuchungen", summeHabenbuchungen);
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", summeSollbuchungen, "Saldo", berechneSaldo());
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }
    
    @Override
    public double berechneKontosumme()
    {
        double kontosumme = anfangsbestand + summeSollbuchungen;
        return kontosumme;
    }
    
    @Override
    public double berechneSaldo() {
        double saldo;
        saldo = this.anfangsbestand + this.summeSollbuchungen - this.summeHabenbuchungen;
        return saldo;
    }
}
