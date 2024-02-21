package Biblio.Metier;

import javax.sound.sampled.Port;
import java.time.LocalDate;
import java.util.List;

public abstract class Ouvrage {
    protected String titre;
    protected int ageMin;
    protected LocalDate dateParution;
    protected TypeOuvrage typeOuvrage;
    protected double prixLocation;
    protected String langue;
    protected String genre;
    protected List<Exemplaire> listeExemplaires;
    protected List<Auteur> listeAuteurs;

    public Ouvrage(String titre, int ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre) {
        this.titre = titre;
        this.ageMin = ageMin;
        this.dateParution = dateParution;
        this.typeOuvrage = typeOuvrage;
        this.prixLocation = prixLocation;
        this.langue = langue;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public LocalDate getDateParution() {
        return dateParution;
    }

    public void setDateParution(LocalDate dateParution) {
        this.dateParution = dateParution;
    }

    public TypeOuvrage getTypeOuvrage() {
        return typeOuvrage;
    }

    public void setTypeOuvrage(TypeOuvrage typeOuvrage) {
        this.typeOuvrage = typeOuvrage;
    }

    public double getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(double prixLocation) {
        this.prixLocation = prixLocation;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
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

    public void setListeExemplaires(List<Exemplaire> listeExemplaires) {
        this.listeExemplaires = listeExemplaires;
    }

    public List<Auteur> getListeAuteurs() {
        return listeAuteurs;
    }

    public void setListeAuteurs(List<Auteur> listeAuteurs) {
        this.listeAuteurs = listeAuteurs;
    }

    public void listerExemplaires(){

    }
    public void listerExemplaires( boolean enLocation){

    }

    public abstract double amendeRetard(int jours);
}
