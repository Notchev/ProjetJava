package Vue;

import javax.swing.BoxLayout;
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 


public class Fenetre extends JFrame{
		
	public Fenetre() {
		
		JPanel pan = new JPanel();
		JButton b_etudiant=new Bouton("Etudiant");
		JButton b_professeur=new Bouton("Professeur");
		JButton b_exit=new Bouton("exit");

		
	    this.setTitle("Gestion d'une ecole");
	    this.setSize(600, 400);
	    this.setLocationRelativeTo(null);               
	 	    	    
	    pan.setLayout(new BoxLayout(pan, BoxLayout.LINE_AXIS));
	    pan.add(b_professeur);
	    pan.add(b_etudiant);
	    pan.add(b_exit);
	    
	    JPanel b4 = new JPanel();
	    //On positionne maintenant ces trois lignes en colonne
	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
	    b4.add(pan);
	    
	    Panneau pan2=new Panneau();
	    pan2.message=1;
	    b4.add(pan2);
	    
	    //this.getContentPane().add(new Panneau());	
	    this.getContentPane().add(b4);
	    this.setVisible(true);
	    
		
	    
	    b_professeur.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
	        	
	          Fenetre_2 fen = new Fenetre_2(2);
	        	
	        }
	      });
	    
	    b_etudiant.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event){
	        	
	          Fenetre_2 fen = new Fenetre_2(3);
	        	
	        }
	      });
	    
	    b_exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
	    
	    
	}
	

}