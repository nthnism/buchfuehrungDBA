package buchfuehrungDBA;

public class Buchungssatz {

    private Konto sollKonto;
    private Konto habenKonto;
    private double buchungsbetrag;

    public Buchungssatz(Konto sollKonto, Konto habenKonto, double buchungsbetrag) {
        this.sollKonto = sollKonto;
        this.habenKonto = habenKonto;
        this.buchungsbetrag = buchungsbetrag;
    }

    public String buchungDurchfuehren() {
        switch (this.sollKonto.getClass().getName()) {
            case "Passivkonto":
                if ((sollKonto.getSummeHabenBuchungen() - sollKonto.getSummeSollBuchungen()) < this.buchungsbetrag) {
                    return "Die Buchung konnte nicht durchgeführt werden, weil nicht genug Geld auf dem Konto ist.";
                }
                break;
            case "Ertragskonto":
                return "Die Buchung konnte nicht durchgeführt werden, weil ...";
            default:
                break;
        }

        switch (this.habenKonto.getClass().getName()) {
            case "Aktivkonto":
                if ((habenKonto.getSummeSollBuchungen() - habenKonto.getSummeHabenBuchungen()) < this.buchungsbetrag) {
                    return "Die Buchung konnte nicht durchgeführt werden, weil nicht genug Geld auf dem Konto ist.";
                }
                break;
            case "Aufwandskonto":
                return "Die Buchung konnte nicht durchgeführt werden, weil ...";
            default:
                break;
        }

        return this.bucheSollUndHaben();
    }

    public String bucheSollUndHaben() {
        return null;
    }

    public String ausgeben() {
        String ausgabe = new String();
        ausgabe = String.format("%04d %-18s an %04d %-18s %,15.2f\n", sollKonto.getKontoNr(), sollKonto.getKontoBezeichnung(), habenKonto.getKontoNr(), habenKonto.getKontoBezeichnung(), buchungsbetrag);
        return ausgabe;
    }
}
