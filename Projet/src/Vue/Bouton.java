/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Bouton extends JFrame
{
    private JPanel pan = new JPanel();
    private JButton bouton = new JButton();

    public Bouton(){
    this.setTitle("Animation");
    this.setSize(300, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
//Ajout du bouton à notre content pane
    pan.add(bouton);
    this.setContentPane(pan);
    this.setVisible(true);
  }      
   
}

