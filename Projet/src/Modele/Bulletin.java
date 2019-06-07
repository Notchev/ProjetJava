/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author sarahkardache
 * 
 */
public class Bulletin  {
     
    private int id_Bulletin;
     private String appreciation;


    /*
    //constructeur sans parametre
    public Bulletin(){ 
    id = NULL; 
    appreciation = "";  
    id_Trimestre = NULL;
    id_Inscription = NULL;
    }*/

    //constructeur avec parametre
    public Bulletin(int id_Bulletin, String appreciation)
    {
        this.id_Bulletin=id_Bulletin;
        this.appreciation=appreciation;
    }

    //******** ACCESSEURS ********

    public int getIdBulletin ()
    {
        return id_Bulletin;
    }

    public String getAppreciation ()
    {
        return appreciation;
    }

   

    //******** MUTATEURS ********

    public void setIdBulletin (int id_Bulletin)
    {
        this.id_Bulletin = id_Bulletin;
    }

    public void setAppreciation (String appreciation)
    {
        this.appreciation = appreciation;
    }

}
