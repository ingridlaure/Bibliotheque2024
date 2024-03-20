package Biblio.Metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lecteur {

    private Long numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String mail;
    private String adresse;
    private String tel;
    private List<Location> listeLocation=new ArrayList<>();

    public Lecteur(String nom, String prenom, LocalDate dateNaiss, String adresse, String mail, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Lecteur{" +
                "numLecteur=" + numLecteur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", listeLocation=" + listeLocation +
                '}';
    }

    public Long getNumLecteur() {
        return numLecteur;
    }

    public void setNumLecteur(Long numLecteur) {
        this.numLecteur = numLecteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Location> getListeLocation() {
        return listeLocation;
    }

    public void setListeLocation(List<Location> listeLocation) {
        this.listeLocation = listeLocation;
    }
    public void listerExemplairesEnLocation(){}
    public void listerExemplairesLoues(){}
}
