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
public class Niveau 
{
    private int id_Niveau;
    private String nom;
    
     public Niveau(int id_Niveau, String nom){
        this.id_Niveau=id_Niveau;
        this.nom=nom;
       
    }
     
     public int getIdNiveau ()
    {
        return id_Niveau;
    }

    public String getNom ()
    {
        return nom;
    }

      public void setNom (String nom)
    {
        this.nom = nom;
    }

    public void setIdNiveau (int id_Niveau)
    {
        this.id_Niveau = id_Niveau;
    }
    
}
