/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.SQLException;

/**
 *
 * @author sarahkardache
 */
public class Ecole {
    private int id_Ecole;
    private String nom_Ecole;
    
      //constructeur avec parametre
    public Ecole(int id_Ecole, String nom_Ecole)
    {
        this.id_Ecole=id_Ecole;
        this.nom_Ecole = nom_Ecole;
    }
    
      public int getIdEcole ()
    {
        return id_Ecole;
    }

    public String getNomEcole ()
    {
        return nom_Ecole;
    }
    
       public void setIdEcole (int id_Ecole)
    {
        this.id_Ecole = id_Ecole;
    }

    public void setNomEcole (String nom_Ecole)
    {
        this.nom_Ecole = nom_Ecole;
    }
    
    public void Ajout (int i, String S)
    {
        
        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        String requete = "INSERT INTO Ecole(id_ecole, nom_ecole) VALUES("; // TODO Auto-generated catch block
        requete += i;
        requete +=",'";
        requete += S;
        requete += "')";
        System.out.println(requete);
        
        //stmt.executeUpdate(requete);
    }
    
}
