package Vue;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panneau extends JPanel {
	
	 int message;
	 
	 public void paintComponent(Graphics g){
		 
		 this.setBackground(Color.WHITE);

		 
		 if(this.message==0) {
			    g.drawString("choisis la rubrique qui t'intéresse", 150, 20);
			    this.setBackground(Color.WHITE);
			 }
		 if(this.message==1) {
		    g.drawString("Bienvenue sur le logiciel de gestion du campus", 150, 20);
		    this.setBackground(Color.WHITE);
		 }
		 if(this.message==2) {
			 g.drawString("Bienvenue cher professeur, choisis la rubrique qui t'intéresse", 150, 20);
			 this.setBackground(Color.WHITE);			 
		 }

	     if(this.message==3) {
	    	 g.drawString("Bienvenue cher eleve, choisis la rubrique qui t'intéresse", 150, 20);
			 this.setBackground(Color.WHITE); 	 
	     }
	     
	     if(this.message==4) {
	    	 g.drawString("voici les infos des école", 150, 20);
			 this.setBackground(Color.WHITE); 	 
	     }

		   
	 } 
	 
	 public void ajouter_ecole() {
		 
		 JTextField jtf = new JTextField("Valeur par défaut");
		 JLabel label = new JLabel("Un JTextField");
		 
		 this.add(label);
		 
		 
	 }

}