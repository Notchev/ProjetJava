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
/**
 *
 * @author sarahkardache
 */
public class Test_projet {
   
    //  private static EcoleGraphique graphique;

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
      @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
          try {
            int reponse=0;
            Connexion connection = new Connexion("Ecole","root","root");
            ArrayList essai = new ArrayList();
            essai = connection.remplirChampsTable("Ecole");
            for (int i = 0; i < essai.size(); i++) {
            System.out.println(essai.get(i));
            System.out.println("Voulez-vous ajouter une ecole ?  ");
            Scanner sc = new Scanner(System.in);
            reponse = sc.nextInt();
            if (reponse==1)
            {
                        connection.Ajout();
            }
            if (reponse==0)
            {
                connection.Supprimer();
            }
        } 
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
          */        } catch (SQLException ex) {
              Logger.getLogger(Test_projet.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Test_projet.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
}

