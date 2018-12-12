package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class Panneau extends JPanel {

	public void paintComponent(Graphics g){

	    

	    System.out.println("Je suis exécutée !");//Vous verrez cette phrase chaque fois que la méthode sera invoquée

	    g.fillOval(20, 20, 75, 75);//rond
	    g.drawOval(800, 100, 80, 80);
	    g.drawRect(100, 100, 50, 60);//carre
	    g.fillRect(265, 65, 30, 40);
	    g.drawRoundRect(330, 10, 30, 50, 10, 10);//rectangle arrondi
	    g.fillRoundRect(430, 65, 55, 30, 5, 5);
	    g.drawRoundRect(10, 10, 30, 50, 10, 10);//tracer des lignes
	    g.fillRoundRect(55, 65, 55, 30, 5, 5);
	    
	    Font font = new Font("Courier", Font.BOLD, 20);
	    g.setFont(font);
	    g.setColor(Color.red);          
	    g.drawString("Tiens ! Le Site du Zéro !", 500, 100);  
	    
	    int x1 = this.getWidth()/4;
	    int y1 = this.getHeight()/4;                      
	    g.fillOval(x1, y1, this.getWidth()/3, this.getHeight()/2);
	    
	    try {

	        Image img = ImageIO.read(new File("Inkedlogo bleiz rider team 02_LI.jpg"));

	        g.drawImage(img, 800, 400, this);

	        //Pour une image de fond
	        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

	      } catch (IOException e) {
	        e.printStackTrace();
	      }

	  }  
	
}
