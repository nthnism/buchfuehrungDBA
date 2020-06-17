package buchfuehrungDBA;


abstract class Konto implements java.lang.Comparable<Konto>{
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

    public int compareTo(final Konto pKonto){        
        int result = this.kontoNr - pKonto.getKontoNr();
        if (result > 0){
            return 1;
        }else if (result < 0){
            return -1; 
        }
        return 0;
    }

    public void bucheSoll(final double buchungsbetrag)
    {
        this.summeSollbuchungen = this.getSummeSollBuchungen() + buchungsbetrag;
    }

    public void bucheHaben(final double buchungsbetrag)
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