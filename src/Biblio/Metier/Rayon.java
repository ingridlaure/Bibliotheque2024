package Biblio.Metier;

import java.util.ArrayList;
import java.util.List;

public class Rayon {
    private String codeRayon;
    private String genre;
    private List<Exemplaire> listeExemplaires=new ArrayList<>();

    public Rayon(String codeRayon, String genre) {
        this.codeRayon = codeRayon;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Rayon{" +
                "codeRayon='" + codeRayon + '\'' +
                ", genre='" + genre + '\'' +
                ", listeExemplaires=" + listeExemplaires +
                '}';
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Exemplaire> getListeExemplaires() {
        return listeExemplaires;
    }

    public void setListeExemplaires(List<Exemplaire> exemplaires) {
        this.listeExemplaires = exemplaires;
    }

    public void listerExemplaires(){

    }
}
