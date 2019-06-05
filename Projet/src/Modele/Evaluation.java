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


    /*
    //constructeur sans parametre
    public Evaluation(){ 
    id = NULL; 
    noteeval = NULL;
    appreciationeval = "";  
    id_DetailBulletin = NULL;
    }*/

    //constructeur avec parametre
    public Evaluation(int id_Evaluation)
    {
    

        this.id_Evaluation=id_Evaluation;
      
    }

    //******** ACCESSEURS ********

    public int getIdEvaluation ()
    {
        return id_Evaluation;
    }

  

    //******** MUTATEURS ********

    public void setIdEvaluation (int id_Evaluation)
    {
        this.id_Evaluation = id_Evaluation;
    }
  
}
