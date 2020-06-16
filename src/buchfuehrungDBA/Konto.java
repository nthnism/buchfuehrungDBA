package buchfuehrungDBA;


abstract class Konto {
    protected int kontoNr;
    protected String kontoBezeichnung;
    protected double summeSollbuchungen;
    protected double summeHabenbuchungen;

    
    public int getKontoNr()
    {
        return kontoNr;
    }

    public String getKontoBezeichnung()
    {
        return kontoBezeichnung;
    }

    public double getSummeSollBuchungen()
    {
        return summeSollbuchungen;
    }

    public double getSummeHabenBuchungen()
    {
        return summeHabenbuchungen;
    }

    public void bucheSoll(double buchungsbetrag)
    {
        this.summeSollbuchungen = this.getSummeSollBuchungen() + buchungsbetrag;
    }

    public void bucheHaben(double buchungsbetrag)
    {
        this.summeHabenbuchungen = this.getSummeHabenBuchungen() + buchungsbetrag;
    }

    public String ausgeben()
    {
        String ausgabe = new String();
        ausgabe += String.format("%-33s %04d %-21s %15s\n", "Soll", kontoNr, kontoBezeichnung, "Haben");
        ausgabe += "──────────────────────────────────────┬──────────────────────────────────────\n";
        return ausgabe;
    }

    public abstract double berechneKontosumme();
    public abstract double berechneSaldo();
}