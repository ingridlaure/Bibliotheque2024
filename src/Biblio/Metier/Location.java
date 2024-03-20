package Biblio.Metier;

import java.time.LocalDate;

public class Location {
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private Double amende;
    private Exemplaire exemplaire;
    private Lecteur lecteur;

    public Location(LocalDate dateLoc, LocalDate dateRestitution,Lecteur lecteur, Exemplaire exemplaire) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.exemplaire = exemplaire;
        this.lecteur = lecteur;
    }

    @Override
    public String toString() {
        return "Location{" +
                "dateLoc=" + dateLoc +
                ", dateRestitution=" + dateRestitution +
                ", amende=" + amende +
                ", exemplaire=" + exemplaire +
                ", lecteur=" + lecteur +
                '}';
    }

    public LocalDate getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(LocalDate dateLoc) {
        this.dateLoc = dateLoc;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public Double getAmende() {
        return amende;
    }

    public void setAmende(Double amende) {
        this.amende = amende;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public void calculerAmende(){}
    public void enregistrerRetour(){}
}
