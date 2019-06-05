/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//source :https://borntocode.fr/java-customiser-lapparence-des-elements-swing-jbutton-et-jpanel/

package Vue;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
 
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class Fond extends JPanel {
 
    private static final long serialVersionUID = 1L;
    private ImageIcon background;
   
    public Fond (String fileName) {
        super();
        this.setLayout(new GridBagLayout());
        this.background = new ImageIcon(fileName);
    }
 
    public void setBackground(ImageIcon background) {
        this.background = background;
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), 0, 0, this);
    }
}