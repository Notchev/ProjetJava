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
   
     private int id_Trimestre;
     private int id_Inscription;
  private String appreciation;

    /*
    //constructeur sans parametre
    public Bulletin(){ 
    id = NULL; 
    appreciation = "";  
    id_Trimestre = NULL;
    id_Inscription = NULL;
    }*/
     public Bulletin()
             {
                 
             }
    //constructeur avec parametre
    public Bulletin(int id_Bulletin, int id_Trimestre, int id_Inscription,String appreciation)
    {
        this.id_Bulletin=id_Bulletin;
        this.appreciation=appreciation;
        this.id_Trimestre=id_Trimestre;
        this.id_Inscription=id_Inscription; 
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
    
    public int getIdTrimestre()
    {
        return id_Trimestre;
    }
   
    public int getIdInscription()
    {
        return id_Inscription;
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
