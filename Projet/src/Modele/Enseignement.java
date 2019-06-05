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
public class Enseignement {
         private int id;
     private int id_Classe;
     private int id_Discipline;
     private int id_Personne;


    /*
    //constructeur sans parametre
    public Enseignement(){ 
    id = NULL; 
    id_Classe = NULL;
    id_Discipline = NULL;
    id_Personne = NULL;
    }*/

    //constructeur avec parametre
    public Enseignement(int id, int id_Classe, int id_Discipline, int id_Personne){
        this.id=id;
        this.id_Classe=id_Classe;
        this.id_Discipline=id_Discipline;
        this.id_Personne=id_Personne;
    }

    //******** ACCESSEURS ********

    public int getId ()
    {
        return id;
    }

    public int getId_Classe ()
    {
        return id_Classe;
    }

    public int getId_Discipline ()
    {
        return id_Discipline;
    }

    public int getId_Personne ()
    {
        return id_Personne;
    }


    //******** MUTATEURS ********

    public void setId (int id)
    {
        this.id = id;
    }

    public void setId_Classe (int id_Classe)
    {
        this.id_Classe = id_Classe;
    }

    public void setId_Discipline (int id_Discipline)
    {
        this.id_Discipline = id_Discipline;
    }

    public void setId_Personne (int id_Personne)
    {
        this.id_Personne = id_Personne;
    }
}
