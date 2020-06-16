package buchfuehrungDBA;


public class Ertragskonto extends Erfolgskonto {

    public Ertragskonto(int kontoNr, String kontoBezeichnung) {
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
    }

    public Ertragskonto(int kontoNr, String kontoBezeichnung, double summeSollbuchungen, double summeHabenbuchungen) {
        this.kontoNr = kontoNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.summeSollbuchungen = summeSollbuchungen;
        this.summeHabenbuchungen = summeHabenbuchungen;
    }

    @Override
    public String ausgeben()
    {
        String ausgabe = new String();
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", summeSollbuchungen, "Summe Habenbuchungen", summeHabenbuchungen);
        ausgabe += String.format("%-21s %,15.2f │\n", "Saldo", berechneSaldo());
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }

    @Override
    public double berechneKontosumme()
    {
        double kontosumme = summeHabenbuchungen;
        return kontosumme;
    }

    @Override
    public double berechneSaldo()
    {
        double saldo;
        saldo = this.summeHabenbuchungen - this.summeSollbuchungen;
        return saldo;
    }
}