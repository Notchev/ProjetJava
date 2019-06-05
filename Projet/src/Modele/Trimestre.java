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
public class Trimestre {
    private int id_Trimestre ;
    private int numero;
    private int debut;
    private int fin;
    
    public Trimestre(int id_Trimestre,int numero, int debut, int fin)
    {
        this.id_Trimestre = id_Trimestre;
        this.numero = numero ; 
        this.debut = debut ; 
        this.fin = fin; 
    }
    
     public int getIdTrimestre ()
    {
        return id_Trimestre;
    }

    public int getNumero ()
    {
        return numero;
    }

    public int getDebut ()
    {
        return debut;
    }
    
     public int getFin ()
    {
        return fin;
    }

    //******** MUTATEURS ********

    public void setIdTrimestre (int id)
    {
        this.id_Trimestre = id_Trimestre;
    }

    public void setNumero (int numero)
    {
        this.numero = numero;
    }
    
    public void setDebut (int debut)
    {
        this.debut = debut;
    }
    
     public void setFin (int fin)
    {
        this.fin = fin;
    }
}
