package bibliotheque.mvc.controller;

import bibliotheque.metier.*;
import bibliotheque.mvc.model.DAOExemplaire;
import bibliotheque.mvc.view.AbstractViewExemplaire;

import java.util.List;
import java.util.Set;

public class ExemplaireController {
    protected DAOExemplaire model;
    protected AbstractViewExemplaire view;

    public ExemplaireController(DAOExemplaire model, AbstractViewExemplaire view) {
        this.model = model;
        this.view = view;
        this.view.setExemplaireController(this);
    }

    public List<Exemplaire> getAll(){
        List<Exemplaire> l = model.getAll();
        return l;
    }

    public Exemplaire add( Exemplaire elt) {
        Exemplaire nelt = model.add(elt);
        return nelt;
    }


    public boolean remove(Exemplaire elt) {
        return model.remove(elt);
    }
    public Exemplaire update(Exemplaire elt) {
        return model.update(elt);
    }

    public Exemplaire search(Exemplaire rech) {
        return  model.read(rech);
    }
    /*public Set<Ouvrage> listerOuvrages(Auteur a) {
        return model.listerOuvrages(a);
    }*/
    public Set<Lecteur> listerLecteur(Exemplaire e){
        return model.listerLecteur(e);    }

    /*public List<Livre> listerLivre(Auteur a, TypeLivre tl) {

        return model.listerLivre(a,tl);
    }*/

    /*public List<Ouvrage> listerOuvrages(Auteur a, String genre) {
        return model.listerOuvrages(a,genre);
    }*/

}
