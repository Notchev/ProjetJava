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
public class Discipline {
       
     private int id_Discipline;
     private String nomdiscipline;

    /*
    //constructeur sans parametre
    public Discipline(){ 
    id = NULL;  
    nomdis ="";
    }*/

    //constructeur avec parametre
    public Discipline(int id_Discipline, String nomdiscipline){
        this.id_Discipline=id_Discipline;
        this.nomdiscipline=nomdiscipline;
    }

    //******** ACCESSEURS ********

    public int getId_Discipline ()
    {
        return id_Discipline;
    }

    public String getNomdiscipline ()
    {
        return nomdiscipline;
    }


    //******** MUTATEURS ********

    public void setIdDiscipline (int id_Discipline)
    {
        this.id_Discipline = id_Discipline;
    }

    public void setNomdiscipline (String nomdiscipline)
    {
        this.nomdiscipline = nomdiscipline;
    }
}
