package Vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D; 
import javax.swing.JButton;


public class Bouton extends JButton{
	
	  String name;
	  
	  public Bouton(String str){
	    super(str);
	    this.name = str;
	  }

}
