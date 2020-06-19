package buchfuehrungDBA;


public class Buchungssatz {
    private Konto sollKonto;
    private Konto habenKonto;
    private double buchungsbetrag;

    
    public Buchungssatz(Konto sollKonto, Konto habenKonto, double buchungsbetrag)
    {
        this.sollKonto = sollKonto;
        this.habenKonto = habenKonto;
        this.buchungsbetrag = buchungsbetrag;
    }

    public String ausgeben()
    {
        String ausgabe = new String();
        ausgabe = String.format("%04d %-18s an %04d %-18s %,15.2f\n", sollKonto.getKontoNr(), sollKonto.getKontoBezeichnung(), habenKonto.getKontoNr(), habenKonto.getKontoBezeichnung(), buchungsbetrag);
        return ausgabe;
    }
}
