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
public class Inscription {
     private int id_Inscription;
     private int id_Classe;
     private int id_Personne;
 

    /*
    //constructeur sans parametre
    public Inscription(){ 
    id = NULL;  
    id_Classe = NULL;
    id_Personne = NULL;
    }*/

    //constructeur avec parametre
    public Inscription(int id_Inscription, int id_Classe, int id_Personne){
        this.id_Inscription=id_Inscription;
        this.id_Classe = id_Classe;
        this.id_Personne = id_Personne;
      
    }

    //******** ACCESSEURS ********

    public int getId_Inscription ()
    {
        return id_Inscription;
    }
 public int getId_Classe ()
    {
        return id_Classe;
    }
  public int getId_Personne ()
    {
        return id_Personne;
    }

    //******** MUTATEURS ********

    public void setIdInscription(int id_Inscription)
    {
        this.id_Inscription = id_Inscription;
    }

    
}
