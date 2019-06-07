/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controler;
import Vue.EcoleGraphique;
import java.awt.Component;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
 import java.util.Scanner;
import Vue.Fond;
import Vue.Bouton;
import java.sql.SQLException;
import Modele.Ecole ; 
import Vue.Fenetre_ecole;
import Controler.connexion_ecole;

/**
 *
 * @author sarahkardache
 */
public class Test_projet {
   
    //  private static EcoleGraphique graphique;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
      @SuppressWarnings("empty-statement")
      
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        Fenetre_ecole fen = new Fenetre_ecole();


        
         /* try {
             ArrayList<Ecole> NosEcoles = new ArrayList() ;
             
           
            
            int reponse=0;
            int id ; 
            String nom ; 
            Connexion connection = new Connexion("Ecole","root","root");
          connexion_ecole ecoleco = new connexion_ecole("Ecole","root","root");

            ArrayList essai = new ArrayList();
            essai = connection.remplirChampsTable("Ecole");
            for (int i = 0; i < essai.size(); i++) {
            System.out.println(essai.get(i));
            System.out.println("Voulez-vous ajouter une ecole ?  ");
            Scanner sc = new Scanner(System.in);
            reponse = sc.nextInt();
            System.out.println("Quelle est l'id et son nom de l'Ecole ?  ");
            id = sc.nextInt();
            nom = sc.next();
            Ecole newEcole = new Ecole(id,nom); 
            if (reponse==1)
            {
            ecoleco.AjoutEcole(id,nom);                 
            }
            if (reponse==0)
            {
                connection.Supprimer();
            }
        } */
              //public Connexion(String nameDatabase, String loginDatabase, String passwordDatabase)
              // TODO code application logic here
              /* JFrame frame = new JFrame();
              //graphique = new EcoleGraphique();
              //graphique.affichage(frame);
              
              Fond back = new Fond("data/back.jpg");
              Bouton test = new Bouton();
              
              frame.setTitle("Gestion d'une école");
              frame.setSize(800, 600);
              frame.setLocationRelativeTo(null);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.add(back);
              frame.setVisible(true);
              JButton button1= new JButton("déplacez-moi");
              button1.setBounds(350,300,150,40);
              
              //back.add(test);
       /*         } catch (SQLException ex) {
              Logger.getLogger(Test_projet.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Test_projet.class.getName()).log(Level.SEVERE, null, ex);
          }
    }*/
    
}
}


