package Vue;


import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controler.connexion_ecole;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class Fenetre_2 extends JFrame{
	
	
public Fenetre_2(int i) {
	if (i==2)
        {
            JPanel pan = new JPanel();
		
		JButton b_evaluation=new Bouton("Evaluations");
		JButton b_bulletin=new Bouton("Bulletins");
		JButton b_enseignement=new Bouton("Enseignements");
		JButton b_annee=new Bouton("Années Scolaires");
		JButton b_trimestre=new Bouton("Trimestres");
		JButton b_niveau=new Bouton("Niveau");
		JButton b_discipline=new Bouton("Disciplines");
		JButton b_personne=new Bouton("Personnes");
		JButton b_inscription=new Bouton("Inscriptions");
		JButton b_detail=new Bouton("Détails du Bulletin");
		JButton b_classe=new Bouton("Classes");
		JButton b_ecole=new Bouton("Ecoles");

		
		JButton b_return=new Bouton("retour");
		JButton b_exit=new Bouton("exit");

            this.setTitle("panneau de configuration Professeur");
             this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
            pan.setLayout(new BoxLayout(pan, BoxLayout.LINE_AXIS));
	   
	    pan.add(b_evaluation);
	    pan.add(b_bulletin);
	    pan.add(b_enseignement);
	    pan.add(b_ecole);
	    pan.add(b_detail);
	    pan.add(b_inscription);
	    pan.add(b_personne);
	    pan.add(b_classe);
	    pan.add(b_discipline);
	    pan.add(b_niveau);
	    pan.add(b_trimestre);
	    
	    pan.add(b_return);
	    pan.add(b_exit);
            
             JPanel b4 = new JPanel();
	    //On positionne maintenant ces trois lignes en colonne
	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
	    b4.add(pan);
	    
	    Panneau pan2=new Panneau();
	    pan2.message=i;
	    b4.add(pan2);
	    
	    //this.getContentPane().add(new Panneau());	
	    this.getContentPane().add(b4);
	    this.setVisible(true);
	   
	    
	    b_trimestre.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_trimestre fen= new Fenetre_trimestre();
			}
	        
	      });
	    b_niveau.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_niveau fen= new Fenetre_niveau();
			}
	        
	      });
	    b_discipline.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_discipline fen= new Fenetre_discipline();
			}
	        
	      });
	    b_classe.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_classe fen= new Fenetre_classe();
			}
	        
	      });
	    b_personne.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_personne fen= new Fenetre_personne();
			}
	        
	      });
	    b_inscription.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_inscription fen= new Fenetre_inscription();
			}
	        
	      });
	    b_detail.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_detail fen= new Fenetre_detail();
			}
	        
	      });
	    b_enseignement.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_enseignement fen= new Fenetre_enseignement();
			}
	        
	      });
	    b_bulletin.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_bulletin fen= new Fenetre_bulletin();
			}
	        
	      });
	    b_evaluation.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_evaluation fen= new Fenetre_evaluation();
			}
	        
	      });
	    
	    b_ecole.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
                    try {
                        Fenetre_ecole fen= new Fenetre_ecole();
                    } catch (SQLException ex) {
                        Logger.getLogger(Fenetre_2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Fenetre_2.class.getName()).log(Level.SEVERE, null, ex);
                    }
			}
	        
	      });
	    
	    b_return.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
	          Fenetre fen= new Fenetre();    	
	        }
	      });
	        
	    b_exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        }
	
		if (i==3)
                {
                     JPanel pan = new JPanel();
		
		JButton b_evaluation=new Bouton("Evaluations");
		JButton b_bulletin=new Bouton("Bulletins");
		JButton b_enseignement=new Bouton("Enseignements");
		JButton b_annee=new Bouton("Années Scolaires");
		JButton b_trimestre=new Bouton("Trimestres");
		JButton b_niveau=new Bouton("Niveaus");
		JButton b_discipline=new Bouton("Disciplines");
		JButton b_personne=new Bouton("Personnes");
		JButton b_inscription=new Bouton("Inscriptions");
		JButton b_detail=new Bouton("Détails du Bulletin");
		JButton b_classe=new Bouton("Classes");
		JButton b_ecole=new Bouton("Ecoles");

		
		JButton b_return=new Bouton("retour");
		JButton b_exit=new Bouton("exit");
                
                    this.setTitle("panneau de configuration étudiant");
                       this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
            pan.setLayout(new BoxLayout(pan, BoxLayout.LINE_AXIS));
	   
	    pan.add(b_evaluation);
	    pan.add(b_bulletin);
	    pan.add(b_enseignement);
	    pan.add(b_ecole);
	    pan.add(b_detail);
	    pan.add(b_inscription);
	    pan.add(b_personne);
	    pan.add(b_classe);
	    pan.add(b_discipline);
	    pan.add(b_niveau);
	    pan.add(b_trimestre);
	    
	    pan.add(b_return);
	    pan.add(b_exit);
            
             JPanel b4 = new JPanel();
	    //On positionne maintenant ces trois lignes en colonne
	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
	    b4.add(pan);
	    
	    Panneau pan2=new Panneau();
	    pan2.message=i;
	    b4.add(pan2);
	    
	    //this.getContentPane().add(new Panneau());	
	    this.getContentPane().add(b4);
	    this.setVisible(true);
	   
	    
	    b_trimestre.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_trimestre fen= new Fenetre_trimestre();
			}
	        
	      });
	    b_niveau.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_niveau fen= new Fenetre_niveau();
			}
	        
	      });
	    b_discipline.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_discipline fen= new Fenetre_discipline();
			}
	        
	      });
	    b_classe.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_classe fen= new Fenetre_classe();
			}
	        
	      });
	    b_personne.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_personne fen= new Fenetre_personne();
			}
	        
	      });
	    b_inscription.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_inscription fen= new Fenetre_inscription();
			}
	        
	      });
	    b_detail.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_detail fen= new Fenetre_detail();
			}
	        
	      });
	    b_enseignement.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_enseignement fen= new Fenetre_enseignement();
			}
	        
	      });
	    b_bulletin.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_bulletin fen= new Fenetre_bulletin();
			}
	        
	      });
	    b_evaluation.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
				Fenetre_evaluation fen= new Fenetre_evaluation();
			}
	        
	      });
	    
	    b_ecole.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
                    try {
                        Fenetre_ecole fen= new Fenetre_ecole();
                    } catch (SQLException ex) {
                        Logger.getLogger(Fenetre_2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Fenetre_2.class.getName()).log(Level.SEVERE, null, ex);
                    }
			}
	        
	      });
	    
	    b_return.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
	          Fenetre fen= new Fenetre();    	
	        }
	      });
	        
	    b_exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
                }
			
			
	                  
	 	    	    
	    
	    
	   
	   
	}
}