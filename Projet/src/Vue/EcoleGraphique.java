/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;


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

/**
 *
 * @author sarahkardache
 */
public class EcoleGraphique extends JFrame {
    
    private final JFrame frame = new JFrame();
   
    /**
     * @param frame
     */
    
    public  void affichage (JFrame frame)
    {
     // TODO code application logic here
        frame= new JFrame();
        frame.setSize(800,800);
        frame.setTitle("Ecole ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("Je suis un ... ");
        JButton button1= new JButton("Eleve");
        button1.setBounds(350,300,150,40);
        JButton button2= new JButton("Enseignant");
        button2.setBounds(330,550,170,40);
        JButton button3=new JButton("Exit");
        button3.setBounds(365,450,100,40);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
    
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //connexion_eleve();
                //JOptionPane.showMessageDialog(frame,msg);
            }
            
        });
        
        button2.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomlaby="";
                JFileChooser jfc= new JFileChooser();
                Component parent1 = null;
                int retour = jfc.showOpenDialog(parent1);
                if (retour== JFileChooser.APPROVE_OPTION) {
                    nomlaby= jfc.getSelectedFile().getName();
                    
                    //TestLaby test;
                   // try {
                    //    test = new TestLaby(new File(nomlaby));
                   // } catch (FileFormatException ex) {
                    //    Logger.getLogger(LabyGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    //}
                    
                    JFrame frame1 = new JFrame();
                    frame1.setSize(800, 800);
                    frame1.setTitle("Labyrinthe 2019");
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame1.setVisible(true);
                    JButton button4 = new JButton("Exit");
                    button4.setBounds(365, 450, 100, 40);
                    frame1.add(button4);
                    JButton button6= new JButton("appliquez le dfs");
                    button6.setBounds(350,300,150,40);
                    frame1.add(button6);
                    
                    affichage_choixlaby(frame1);
                } else {
                    String erreur="Aucun fichier séléctionné!";
                    //JOptionPane.showMessageDialog(frame, erreur);
                }
            }
        });
        
        
        
    }
    
    public  void affichage_choixlaby (JFrame frame)
    {
     // TODO code application logic here
    
                //searchPath(labyrinthe, 1, 1, path);
               // pathIndex = path.size() - 2;
               // searchPath(labyrinthe,5,5, path );
                String msg="La DFS a été effectué";
                JOptionPane.showMessageDialog(frame,msg);
            
        }   

   
  
 @Override
        public void paint(Graphics g)
        {
       paintComponents(g);
        
        g.translate(50, 50);
        
        // dessin du laby
        /*for (int row = 0; row < labyrinthe.length; row++) {
            for (int col = 0; col < labyrinthe[0].length; col++) {
                Color color;
                switch (labyrinthe[row][col]) {
                    case 1 : color = Color.BLACK; break;
                    case 9 : color = Color.RED; break;
                    default : color = Color.WHITE;
                }
                g.setColor(color);
                g.fillRect(30 * col, 30 * row, 30, 30);
                g.setColor(Color.BLACK);
                g.drawRect(30 * col, 30 * row, 30, 30);
            }
        }
        for (int p = 0; p < path.size(); p += 2) {
            int pathX = path.get(p);
            int pathY = path.get(p + 1);
            g.setColor(Color.GREEN);
            g.fillRect(pathX * 30, pathY * 30, 30, 30);
        }

        // draw the ball on path
        int pathX = path.get(pathIndex);
        int pathY = path.get(pathIndex + 1);
        g.setColor(Color.RED);
        g.fillOval(pathX * 30, pathY * 30, 30, 30);
        
    }
       
public static boolean searchPath(int[][] labyrinthe, int x, int y
            , List<Integer> path) {
        
        if (labyrinthe[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }
        
        if (labyrinthe[y][x] == 0) {
            labyrinthe[y][x] = 2;
            
            int dx = -1;
            int dy = 0;
            if (searchPath(labyrinthe, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 1;
            dy = 0;
            if (searchPath(labyrinthe, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = -1;
            if (searchPath(labyrinthe, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = 1;
            if (searchPath(labyrinthe, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }

    private static class labyrinthe {

        public labyrinthe() {
        }
    }

    private static class frame {

        public frame() {
        }
    }

*/
}
}