package bibliotheque.mvc.view;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.TypeLivre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.*;
import static bibliotheque.utilitaires.Utilitaire.affListe;

public class ExemplaireViewConsole  extends AbstractViewExemplaire{
    Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        update(exemplaireController.getAll());
        List options = Arrays.asList("ajouter", "retirer", "rechercher","modifier","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    rechercher();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private void retirer() {
        int nl = choixElt(le)-1;
        Exemplaire e= le.get(nl);
        boolean ok = exemplaireController.remove(e);
        if(ok) affMsg("exemplaire effacé");
        else affMsg("exemplaire non effacé");
    }

    private void affMsg(String msg) {
        System.out.println(msg);
    }


    public void rechercher() {
        try {
            System.out.println("matricule");
            String matricule = sc.nextLine();
            Exemplaire rech = new Exemplaire(matricule);
            Exemplaire e = exemplaireController.search(rech);
            if(e==null) affMsg("auteur inconnu");
            else {
                affMsg(e.toString());
                special(e);
            }
        }catch(Exception e){
            System.out.println("erreur : "+e);
        }

    }


    public void modifier() {
        int choix = choixElt(le);
        Exemplaire e = le.get(choix-1);
        do {
            try {
                String matricule = modifyIfNotBlank("matricule", e.getMatricule());
                String etat = modifyIfNotBlank("état", e.getDescriptionEtat());
                e.setMatricule(matricule);
                e.setDescriptionEtat(etat);
                break;
            } catch (Exception ex) {
                System.out.println("erreur :" + ex);
            }
        }while(true);
        exemplaireController.update(e);
    }


    public void ajouter() {
        Exemplaire e;
        do {
            try {
                System.out.println("matricule ");
                String matricule = sc.nextLine();
                System.out.println("état");
                String etat = sc.nextLine();
                System.out.println("ouvrage");
                String ouvrage = sc.nextLine();
                e= new Exemplaire(matricule,etat);
                break;
            } catch (Exception e) {
                System.out.println("une erreur est survenue : "+e.getMessage());
            }
        }while(true);
        exemplaireController.add(e);
    }

    public void special(Exemplaire e) {

        List options = Arrays.asList("lister ouvrages", "lister livres", "lister par genre","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {

                case 1:
                    listerOuvrages(a);
                    break;
                case 2:
                    listerLivres(a);
                    break;
                case 3:
                    listerGenre(a);
                    break;
                case 4 :return;
            }
        } while (true);

    }


    public void listerGenre(Auteur a) {
        System.out.println("genre :");
        String genre = sc.nextLine();
        affListe(new ArrayList(auteurController.listerOuvrages(a,genre)));
    }


    public void listerOuvrages(Auteur a){
        affList(new ArrayList(auteurController.listerOuvrages(a)));
    }


    public void listerLivres(Auteur a){
        TypeLivre[] tlv = TypeLivre.values();
        int ch2 = choixListe(List.of(tlv));
        TypeLivre tl = tlv[ch2-1];
        affList(new ArrayList(auteurController.listerLivre(a,tl)));
    }

    @Override
    public void affList(List la) {
        affListe(la);
    }
}
