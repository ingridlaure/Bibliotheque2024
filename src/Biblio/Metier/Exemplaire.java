package Biblio.Metier;

import java.util.List;

public class Exemplaire {
    private String matricule;
    private String descriptionEtat;
    private Rayon rayon;
    private List<Location> listeLocations;
    private Ouvrage ouvrage;

    public Exemplaire(String matricule, String descriptionEtat, Rayon rayon, List<Location> listeLocations, Ouvrage ouvrage) {
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
        this.rayon = rayon;
        this.listeLocations = listeLocations;
        this.ouvrage = ouvrage;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDescriptionEtat() {
        return descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public List<Location> getListeLocations() {
        return listeLocations;
    }

    public void setListeLocations(List<Location> listeLocations) {
        this.listeLocations = listeLocations;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public void modifierEtat(String etat){}
    public void lecteurActuel(){}
    public void lecteurs(){}
    public void envoiMailLecteurActuel(Mail mail){}
    public void envoiMailLecteurs(Mail mail){}
    public  boolean enRetard(){
        return true;
    }
    public int joursRetard(){
        return 2;
    }

    public boolean enLocation(){
        return true;
    }


}
