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
public class Classe {
  
    
     private int id_Classe;
     private String nomclasse;
     private int id_Ecole;
     private int id_Niveau;
     private int id_AnneeScolaire;

    /*
    //constructeur sans parametre
    public Classe(){ 
    id = NULL;  
    nomclas ="";
    id_Ecole = NULL;
    id_Niveau = NULL;
    id_AnneeScolaire = NULL;
    }*/

    //constructeur avec parametre
    public Classe(int id_Classe, String nomclasse, int id_Ecole, int id_Niveau, int id_AnneeScolaire){
        this.id_Classe=id_Classe;
        this.nomclasse=nomclasse;
        this.id_Ecole=id_Ecole;
        this.id_Niveau=id_Niveau;
        this.id_AnneeScolaire=id_AnneeScolaire;
    }

    //******** ACCESSEURS ********

    public int getIdClasse ()
    {
        return id_Classe;
    }

    public String getNomclasse ()
    {
        return nomclasse;
    }

    public int getId_Ecole ()
    {
        return id_Ecole;
    }

    public int getId_Niveau ()
    {
        return id_Niveau;
    }

    public int getId_AnneeScolaire ()
    {
        return id_AnneeScolaire;
    }


    //******** MUTATEURS ********

    public void setIdClasse (int id_Classe)
    {
        this.id_Classe = id_Classe;
    }

    public void setNomclas (String nomclas)
    {
        this.nomclasse = nomclasse;
    }

    public void setId_Ecole (int id_Ecole)
    {
        this.id_Ecole = id_Ecole;
    }

    public void setId_Niveau (int id_Niveau)
    {
        this.id_Niveau = id_Niveau;
    }

    public void setId_AnneeScolaire (int id_AnneeScolaire)
    {
        this.id_AnneeScolaire = id_AnneeScolaire;
    }

}
