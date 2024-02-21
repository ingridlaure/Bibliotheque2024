package Biblio.Metier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class CD extends Ouvrage{
    private long code;
    private Byte nbrePlages;
    private LocalTime dureeTotale;
    public CD(String titre, Byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, List<Exemplaire> listeExemplaires, List<Auteur> listeAuteurs,long code, Byte nbrePlages, LocalTime dureeTotale) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre, listeExemplaires, listeAuteurs);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public Byte getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(Byte nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public LocalTime getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(LocalTime dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public double amendeRetard(int njours){return 2;}


}
