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
 

    /*
    //constructeur sans parametre
    public Inscription(){ 
    id = NULL;  
    id_Classe = NULL;
    id_Personne = NULL;
    }*/

    //constructeur avec parametre
    public Inscription(int id_Inscription){
        this.id_Inscription=id_Inscription;
      
    }

    //******** ACCESSEURS ********

    public int getId_Inscription ()
    {
        return id_Inscription;
    }



    //******** MUTATEURS ********

    public void setIdInscription(int id_Inscription)
    {
        this.id_Inscription = id_Inscription;
    }

    
}
