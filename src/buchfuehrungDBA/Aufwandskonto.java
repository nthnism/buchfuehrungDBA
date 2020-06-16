package buchfuehrungDBA;


public class Aufwandskonto extends Erfolgskonto {

    public Aufwandskonto(int kontoNr, String kontoBezeichnung)
    {
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
    }

    public Aufwandskonto(int kontoNr, String kontoBezeichnung, double summeSollbuchungen, double summeHabenbuchung)
    {
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.summeSollbuchungen = summeSollbuchungen;
        this.summeHabenbuchungen = summeHabenbuchung;
    }

    @Override
    public String ausgeben(){
        String ausgabe = new String();
        ausgabe += super.ausgeben();
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", this.summeSollbuchungen, "Summe Habenbuchungen", this.summeHabenbuchungen);
        ausgabe += String.format("                                      │%-21s %,15.2f\n", "Saldo", berechneSaldo());
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }

    @Override
    public double berechneKontosumme() {
        double kontosumme = summeSollbuchungen;
        return kontosumme;
    }

    @Override
    public double berechneSaldo()
    {
        double saldo;
        saldo = this.summeSollbuchungen - this.summeHabenbuchungen;
        return saldo;
    }
}