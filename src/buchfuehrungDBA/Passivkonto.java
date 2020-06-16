package buchfuehrungDBA;


public class Passivkonto extends Bestandskonto {

    public Passivkonto(int kontoNr, String kontoBezeichnung)
    {

    }

    public Passivkonto(int kontoNr, String kontoBezeichnung, double anfangsbestand)
    {

    }

    public Passivkonto(int kontoNr, String kontoBezeichnung, double anfangsbestand, double summeSollbuchungen, double summeHabenbuchungen)
    {

    }

    @Override
    public String ausgeben()
    {
        String ausgabe = new String();
        ausgabe += super.ausgeben();
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", this.summeSollbuchungen, "Anfangsbestand", this.anfangsbestand);
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Saldo", berechneSaldo(), "Summe Habenbuchungen", this.summeHabenbuchungen);
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }

    @Override
    public double berechneKontosumme()
    {
        double kontosumme = anfangsbestand + summeHabenbuchungen;
        return kontosumme;
    }

    @Override
    public double berechneSaldo()
    {
        double saldo;
        saldo = this.anfangsbestand + this.summeHabenbuchungen - this.summeSollbuchungen;
        return saldo;
    }
}