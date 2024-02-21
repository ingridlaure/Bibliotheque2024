package Biblio.Metier;

import java.time.LocalDate;
import java.util.List;

public class Livre extends Ouvrage{
    private String isbn;
    private int nombresPages;
    private TypeLivre typeLivre;
    private String resume;

    public Livre(String titre, int ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, String isbn, int nombresPages, TypeLivre typeLivre, String resume) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.isbn = isbn;
        this.nombresPages = nombresPages;
        this.typeLivre = typeLivre;
        this.resume = resume;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNombresPages() {
        return nombresPages;
    }

    public void setNombresPages(int nombresPages) {
        this.nombresPages = nombresPages;
    }

    public TypeLivre getTypeLivre() {
        return typeLivre;
    }

    public void setTypeLivre(TypeLivre typeLivre) {
        this.typeLivre = typeLivre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public double amendeRetard(int njours){return 2;}
}
