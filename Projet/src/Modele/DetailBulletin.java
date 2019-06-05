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
public class DetailBulletin {
 
	
     private int id_DetailBulletin;
     private String appreciationdetail;
   

    /*
    //constructeur sans parametre
    public Evaluation(){ 
    id = NULL; 
    appreciationdetail = "";  
    id_DetailBulletin = NULL;
    id_Enseignement = NULL;
    }*/

    //constructeur avec parametre
    public DetailBulletin (int id_DetailBulletin, String appreciationdetail)
    {
        this.id_DetailBulletin=id_DetailBulletin;
        this.appreciationdetail=appreciationdetail;
    }

    //******** ACCESSEURS ********

    public int getId_DetailBulletin ()
    {
        return id_DetailBulletin;
    }

    public String getAppreciationdetail ()
    {
        return appreciationdetail;
    }

  

    //******** MUTATEURS ********

    public void setIdDetailBulletin (int id_DetailBulletin)
    {
        this.id_DetailBulletin = id_DetailBulletin;
    }

    public void setAppreciationdetail (String appreciationdetail)
    {
        this.appreciationdetail = appreciationdetail;
    }

}
