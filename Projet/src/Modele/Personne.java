/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author sarahkardache
 */
public class Personne {
        private int id_Personne;
     private String nom;
     private String prenom;
     private int type;


    /*
    //constructeur sans parametre
    public Personne(){ 
    id = NULL; 
    nom = ""; 
    prenom = ""; 
    type = NULL;
    }*/

    //constructeur avec parametre
    public Personne(int id_Personne, String nom, String prenom, int type){
        this.id_Personne=id_Personne;
        this.nom=nom;
        this.prenom=prenom;
        this.type=type;
    }

    //******** ACCESSEURS ********

    public int getIdPersonne ()
    {
        return id_Personne;
    }

    public String getNom ()
    {
        return nom;
    }

    public String getPrenom ()
    {
        return prenom;
    }

    public int getType ()
    {
        return type;
    }


    //******** MUTATEURS ********

    public void setIdPersonne (int id_Personne)
    {
        this.id_Personne = id_Personne;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public void setPrenom (String prenom)
    {
        this.prenom = prenom;
    }

    public void setType (int type)
    {
        this.type = type;
    }   
}
