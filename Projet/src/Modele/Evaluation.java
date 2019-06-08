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
public class Evaluation  {
     
     private int id_Evaluation;
     private int id_DetailBulletin;
     private int note;
     private String appreciation;

    /*
    //constructeur sans parametre
    public Evaluation(){ 
    id = NULL; 
    noteeval = NULL;
    appreciationeval = "";  
    id_DetailBulletin = NULL;
    }*/

    //constructeur avec parametre
    public Evaluation(int id_Evaluation, int id_DetailBulletin, int note, String appreciation)
    {

        this.id_Evaluation=id_Evaluation;
        this.id_DetailBulletin=id_DetailBulletin;
        this.note=note;
        this.appreciation=appreciation;
      
    }

    //******** ACCESSEURS ********

    public int getIdEvaluation ()
    {
        return id_Evaluation;
    }

       public int getIdDetailBulletin ()
    {
        return id_DetailBulletin;
    }
       
          public int getNote ()
    {
        return id_Evaluation;
    }
          
     public String getAppreciation ()
    {
        return appreciation;
    }
  

    //******** MUTATEURS ********

    public void setIdEvaluation (int id_Evaluation)
    {
        this.id_Evaluation = id_Evaluation;
    }
  
}
