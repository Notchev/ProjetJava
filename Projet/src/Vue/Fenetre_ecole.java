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

public class Fenetre_ecole extends JFrame{
	
	public Fenetre_ecole() throws SQLException, ClassNotFoundException {

	connexion_ecole NosEcoles = new connexion_ecole("Ecole","root","root");
	
	JLabel texte = new JLabel("Voici toutes les écoles (id : nom)");
	JLabel t_ajouter = new JLabel("Ajouter une école");
	JLabel t_supprimer = new JLabel("supprimer une école");
	JLabel t_modifier = new JLabel("Modifier une école");
	
	texte.setForeground(Color.BLACK);
	texte.setHorizontalAlignment(JLabel.CENTER);
	t_ajouter.setForeground(Color.WHITE);
	t_ajouter.setHorizontalAlignment(JLabel.CENTER);
	t_supprimer.setForeground(Color.WHITE);
	t_supprimer.setHorizontalAlignment(JLabel.CENTER);
	t_modifier.setForeground(Color.WHITE);
	t_modifier.setHorizontalAlignment(JLabel.CENTER);
	
	JLabel t_id = new JLabel("Entrez l'ID");
	JLabel t_nom = new JLabel("Entrez le nom");

	JTextField f_id = new JTextField("");
	JTextField f_nom = new JTextField("");
	f_id.setPreferredSize(new Dimension(60, 30));
	f_nom.setPreferredSize(new Dimension(60, 30));
	JTextField f_id1 = new JTextField("");
	JTextField f_nom1 = new JTextField("");
	f_id1.setPreferredSize(new Dimension(60, 30));
	f_nom1.setPreferredSize(new Dimension(60, 30));
	JTextField f_id2 = new JTextField("");
	JTextField f_nom2 = new JTextField("");
	f_id2.setPreferredSize(new Dimension(60, 30));
	f_nom2.setPreferredSize(new Dimension(60, 30));

	JButton b_ajouter=new Bouton("ajouter");
	JButton b_modifier=new Bouton("modifier");
	JButton b_supprimer=new Bouton("supprimer");

	JButton b_exit=new Bouton("exit");
	JButton b_refresh=new Bouton("Rafraichir");
	
	this.setTitle("Informations école");
    this.setSize(600, 400);
    this.setLocationRelativeTo(null); 
    	   	    
    ////////////////////////////////////// panneau
    
    JPanel pan= new JPanel();
    
    JPanel p_ajouter1= new JPanel();
    p_ajouter1.setBackground(Color.GRAY);
    JPanel p_ajouter2= new JPanel();
    p_ajouter2.setBackground(Color.WHITE);

    JPanel p_modifier1= new JPanel();
    p_modifier1.setBackground(Color.black);
    JPanel p_modifier2= new JPanel();
    p_modifier2.setBackground(Color.WHITE);

    JPanel p_supprimer1= new JPanel();
    p_supprimer1.setBackground(Color.black);
    JPanel p_supprimer2= new JPanel();
    p_supprimer2.setBackground(Color.WHITE);
    
    
    p_ajouter1.setPreferredSize(new Dimension(600, 30));
	p_supprimer1.setPreferredSize(new Dimension(600, 30));
	p_modifier1.setPreferredSize(new Dimension(600, 30));
    p_ajouter2.setPreferredSize(new Dimension(600, 60));
	p_supprimer2.setPreferredSize(new Dimension(600, 60));
	p_modifier2.setPreferredSize(new Dimension(600, 60));

    
    pan.add(texte);

   
    p_ajouter1.add(t_ajouter);
    p_ajouter2.add(new JLabel("Entrez l'ID"));
    p_ajouter2.add(f_id);
    p_ajouter2.add(new JLabel("Entrez le nom"));
    p_ajouter2.add(f_nom);
    p_ajouter2.add(b_ajouter);
    
    p_modifier1.add(t_modifier);
    p_modifier2.add(new JLabel("Entrez l'ID"));
    p_modifier2.add(f_id1);
    p_modifier2.add(new JLabel("Entrez le nom"));
    p_modifier2.add(f_nom1);
    p_modifier2.add(b_modifier);

    p_supprimer1.add(t_supprimer);
    p_supprimer2.add(new JLabel("Entrez l'ID"));
    p_supprimer2.add(f_id2);
    p_supprimer2.add(b_supprimer);
    
    
    pan.add(p_ajouter1);
    pan.add(p_ajouter2);
    pan.add(p_modifier1);
    pan.add(p_modifier2);
    pan.add(p_supprimer1);
    pan.add(p_supprimer2);

    pan.add(b_exit);
    pan.add(b_refresh);


   
    //this.getContentPane().add(new Panneau());	
    this.getContentPane().add(pan);
    this.setVisible(true);
    
    
    
    
    b_ajouter.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        	int i;
        	String s;

        	s=f_id.getText();
        	i=Integer.parseInt(s); 
        	s=f_nom.getText();
            System.out.println(i);
            System.out.println(s);
            System.out.println("popoplopolooopopo");


        	NosEcoles.AjoutEcole(i,s);
        	
        
        }
    });
      
    b_supprimer.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	int j;
                             System.out.println("ok");

        String k;
              System.out.println("okk");

        	k=f_id2.getText();             
                System.out.println("okkk");

                
        	j=Integer.parseInt(k); 
      
            System.out.println(j);
            System.out.println("popoplopolooopopo");


        	NosEcoles.SupprimerEcole(j);
        	
        
        }
        });
   
    
    b_modifier.addActionListener(new ActionListener() {
        @Override
          public void actionPerformed(ActionEvent e) {
        	int j;
                             System.out.println("ok");

        String k;
        String poub ; 
              System.out.println("okk");

        	k=f_nom1.getText();             
                System.out.println("okkk");
               poub = f_id1.getText();
                
        	j=Integer.parseInt(poub); 
      
            System.out.println(j);
            System.out.println("popoplopolooopopo");


        	NosEcoles.ModifierEcole(j,k);
        	
        
        }
    });
    
  
    b_refresh.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try { 
                Fenetre_ecole fen= new Fenetre_ecole();
            } catch (SQLException ex) {
                Logger.getLogger(Fenetre_ecole.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Fenetre_ecole.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
    b_exit.addActionListener((ActionEvent e) -> {
        System.exit(0);
    });
    

}
}